(ns dom-csrf.repl
  "repl helpers"
  {:author "Naitik Shah"}
  (:require
    [auto-reload.core :only [auto-reload]]
    [clojure.string]
    [clojure.tools.logging])
  (:use
    [dom-csrf.core]))

(auto-reload.core/auto-reload ["src"])
