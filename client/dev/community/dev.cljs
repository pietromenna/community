(ns community.dev
  (:require [weasel.repl :as ws-repl]))

(def ^:private ws-url "ws://localhost:9001")

;; Attempt to auto-connect without displaying any errors
(.log js/console "Attempting to connect to development repl server")
(ws-repl/connect ws-url :verbose false)

(defn repl-connect []
  (ws-repl/connect ws-url :verbose true))
