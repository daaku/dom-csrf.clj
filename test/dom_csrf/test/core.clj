(ns dom-csrf.test.core
  "Test dom-csrf functionality."
  {:author "Naitik Shah"}
  (:use
    [dom-csrf.core :only [inject-token]]
    [clojure.test :only [deftest testing is]]))

(deftest inject-single-form
  (is (= (inject-token "name" "123" [[:form]])
         [["form"
           {:id nil :class nil}
           [["div"
             {:style "display:none" :id nil :class nil}
             [["input"
               {:value "123" :name "name" :type "hidden" :id nil :class nil}
               nil]]]
            nil]]])))
