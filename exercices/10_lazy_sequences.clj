(exercice
  "There are many ways to generate a sequence"
  [(= __ (range 1 5))] [1 2 3 4])


(exercice

  "The range starts at the beginning by default"
  [(= __ (range 5))] [0 1 2 3 4])


(exercice

  "Only take what you need when the sequence is large"
  [(= [0 1 2 3 4 5 6 7 8 9]
     (take __ (range 100)))] 10)


(exercice

  "Or limit results by dropping what you don't need"
  [(= [95 96 97 98 99]
     (drop __ (range 100)))] 95)


(exercice

  "Iteration provides an infinite lazy sequence"
  [(= __ (take 20 (iterate inc 0)))] (range 20))


(exercice

  "Repetition is key"
  [(= [:a :a :a :a :a :a :a :a :a :a]
     (repeat 10 __))] :a)


(exercice

  "Iteration can be used for repetition"
  [(= (repeat 100 :foo)
     (take 100 (iterate ___ :foo)))] (fn [x] x))
