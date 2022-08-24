(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

; Stuff from crash course chapter
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
  )
