(exercice
  "You can create a set by converting another collection"
  [(= #{3} (set __))][3])

  (exercice
  "Counting them is like counting other collections"
  [(= __ (count #{1 2 3}))]3)

    (exercice
  "Remember that a set is a *mathematical* set"
  [(= __ (set '(1 1 2 2 3 3 4 4 5 5)))]#{1 2 3 4 5})

      (exercice
  "You can ask clojure for the union of two sets"
  [(= __ (clojure.set/union #{1 2 3 4} #{2 3 5}))] #{1 2 3 4 5})

        (exercice
  "And also the intersection"
  [(= __ (clojure.set/intersection #{1 2 3 4} #{2 3 5}))] #{2 3})

          (exercice
  "But don't forget about the difference"
  [(= __ (clojure.set/difference #{1 2 3 4 5} #{2 3 5}))]#{1 4})
