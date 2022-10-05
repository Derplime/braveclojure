(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

; Stuff from crash course chapter
; Before hooking into REPL in IDE, start REPL in clojure-noob directory with 'lein repl'
; NOTE: The port used is dynamic, so you'll have to update the Remote REPL config with each start
; Can't do a local REPL with this project due to no deps.edn or cljs.jar in working directory
; Source: https://stackoverflow.com/questions/28481272/clojurescript-error-could-not-find-or-load-main-class-clojure-main
(comment
  ; Operation structure examples
  ; (operand arg1 arg2 ... argN)
  (+ 1 2 3) ; = 6
  (str "It was the panda " "in the library " "with a dust buster") ; = "It was the panda in the library with a dust buster"

  ; Control Flow
  ; Ifs
  ; (if condition
  ;   then-something-here
  ;   optional-else-here)
  (if true
    "By Zeus's Hammer!"
    "By Aquaman's Trident!") ; = "By Zeus's Hammer!"
  (if false
    "By Zeus's Hammer!"
    "By Aquaman's Trident!") ; = "By Aquaman's Trident!"
  ; If no else, returns nil
  (if false
    "By Zeus's Hammer!") ; = nil

  ; If you want multiple lines run under a condition, wrap in more parentheses with a do
  (if true
    (do (println "Success!")
        "By Zeus's hammer!")
    (do (println "Failure!")
        "By Aquaman's trident!"))

  ; Or boolean operator: Returns first truthy value, or last value
  (or false nil false "Ha beat true" true "hi")
  ; And boolean operator: Return first falsey value, or last value
  (and false true "der" "p" 12 3412 245 42)
  )
