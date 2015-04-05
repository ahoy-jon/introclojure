(def the-world (ref "hello"))
(def bizarro-world (ref {}))

(exercice
  "In the beginning, there was a word"
  [(= __ (deref the-world))] "hello")


(exercice

  "You can get the word more succinctly, but it's the same"
  [(= __ @the-world)] "hello")


(exercice

  "You can be the change you wish to see in the world."
  [(= __ (do
           (dosync (ref-set the-world "better"))
           @the-world))] "better")

(exercice

  "Alter where you need not replace"
  [(= __ (let [exclamator (fn [x] (str x "!"))]
           (dosync
             (alter the-world exclamator)
             (alter the-world exclamator)
             (alter the-world exclamator))
           @the-world))] "better!!!")


(exercice

  "Don't forget to do your work in a transaction!"
  [(= 0 (do __
          @the-world))] (dosync (ref-set the-world 0)))


(exercice

  "Functions passed to alter may depend on the data in the ref"
  [(= 20 (do
           (dosync (alter the-world ___))))] (map :jerry [@the-world @bizarro-world]))


(exercice

  "Two worlds are better than one"
  [(= ["Real Jerry" "Bizarro Jerry"]
     (do
       (dosync
         (ref-set the-world {})
         (alter the-world assoc :jerry "Real Jerry")
         (alter bizarro-world assoc :jerry "Bizarro Jerry")
         __)))] (fn [x] (+ 20 x)))
