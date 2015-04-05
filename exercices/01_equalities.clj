
(exercice
  "We shall contemplate truth by testing reality, via equality"
  [(= __ true)] true)

(exercice
  "To understand reality, we must compare our expectations against reality"
  [(= __ (+ 1 1))] 2)

(exercice
  "You can test equality of many things"
  [(= (+ 3 4) 7 (+ 2 __))] 5)

(exercice
  "Some things may appear different, but be the same"
  [(= __ (= 2 2/1))] tru)

(exercice
  "You cannot generally float to heavens of integers"
  [(= __ (= 2 2.0))] false)

(exercice
  "But a looser equality is also possible"
  [(= __ (== 2.0 2))] true)

(exercice
  "Something is not equal to nothing"
  [(= __ (not (= 1 nil)))] true)

(exercice
  "Strings, and keywords, and symbols: oh my!"
  [(= __ (= "foo" :foo 'foo))] false)

(exercice
  "Make a keyword with your keyboard"
  [(= :foo (keyword __))] "foo")

(exercice
  "Symbolism is all around us"
  [(= 'foo (symbol __))] "foo")

(exercice
  "When things cannot be equal, they must be different"
  [(not= :fill-in-the-blank __)] 3)