(defproject dom-csrf "1.0.0"
  :description "Injects CSRF tokens into forms defined as hiccup data."
  :author "Naitik Shah <n@daaku.org>"
  :url "https://github.com/nshah/dom-csrf.clj"
  :repl-init dom-csrf.repl
  :exclusions [org.clojure/clojure]
  :dependencies
    [[hdom "1.0.2"]
     [org.clojure/clojure "1.3.0"]]
  :dev-dependencies
    [[auto-reload "1.0.3"]
     [lein-marginalia "0.7.0-SNAPSHOT"]
     [org.clojure/tools.logging "0.2.3"]
     [vimclojure/server "2.3.0-SNAPSHOT"]])
