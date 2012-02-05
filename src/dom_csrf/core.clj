(ns dom-csrf.core
  "<a href='http://travis-ci.org/nshah/dom-csrf.clj'>
  <img src='https://secure.travis-ci.org/nshah/dom-csrf.clj.png'>
  </a>

  Injects CSRF tokens as hidden input elements in form elements where the
  method is not GET."
  {:author "Naitik Shah"}
  (:require
    [clojure.string])
  (:use
    [hdom.core :only [reduce-elements prepend-child]]))

(defn- inject-if-form [token-element _ element]
  [_
   (if (= "form" (first element))
     (prepend-child element token-element)
     element)])

(defn inject-token
  "Injects the given token into the supplied hiccup data."
  [name value body]
  (let [token-element [:div
                       {:style "display:none"}
                       [:input {:type "hidden" :name name :value value}]]]
    (last (reduce-elements [] body (partial inject-if-form token-element)))))
