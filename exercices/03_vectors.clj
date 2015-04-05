(exercice
  "You can use vectors in clojure as array-like structures"
  [(= __ (count [42]))]1)

  (exercice
  "You can create a vector from a list"
  [(= __ (vec '(1)))][1])

    (exercice
  "Or from some elements"
  [(= __ (vector nil nil))][nil nil])

      (exercice
  "But you can populate it with any number of elements at once"
  [(= [1 __] (vec '(1 2)))] 2)

      (exercice
  "Conjoining to a vector is different than to a list"
  [(= __ (conj [111 222] 333))][111 222 333])

      (exercice
  "You can get the first element of a vector like so"
 [(= __ (first [:peanut :butter :and :jelly]))]:peanut)


(exercice  "And the last in a similar fashion"
  [(= __ (last [:peanut :butter :and :jelly]))]:jelly)

      (exercice
  "Or any index if you wish"
  [(= __ (nth [:peanut :butter :and :jelly] 3))]:jelly)

      (exercice
  "You can also slice a vector"
  [(= __ (subvec [:peanut :butter :and :jelly] 1 3))] [:butter :and])

      (exercice
  "Equality with collections is in terms of values"
  [(= (list 1 2 3) (vector 1 2 __))]3)
