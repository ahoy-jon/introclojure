(exercice
  "The map function relates a sequence to another"
  [(= [__ __ __] (map (fn [x] (* 4 x)) [1 2 3]))] 4 8 12)


(exercice
  "You may create that mapping"
  [(= [1 4 9 16 25] (map (fn [x] __) [1 2 3 4 5]))] (* x x))


(exercice

  "Or use the names of existing functions"
  [(= __ (map nil? [:a :b nil :c :d]))] [false false true false false])


(exercice

  "A filter can be strong"
  [(= __ (filter (fn [x] false) '(:anything :goes :here)))] ())


(exercice

  "Or very weak"
  [(= __ (filter (fn [x] true) '(:anything :goes :here)))] [:anything :goes :here])


(exercice

  "Or somewhere in between"
  [(= [10 20 30] (filter (fn [x] __) [10 20 30 40 50 60 70 80]))] (< x 31))



(exercice

  "Maps and filters may be combined"
  [(= [10 20 30] (map (fn [x] __) (filter (fn [x] __) [1 2 3 4 5 6 7 8])))] (* 10 x) (< x 4))


(exercice

  "Reducing can increase the result"
  [(= __ (reduce (fn [a b] (* a b)) [1 2 3 4]))] 24)


(exercice

  "You can start somewhere else"
  [(= 2400 (reduce (fn [a b] (* a b)) __ [1 2 3 4]))] 100)


(exercice

  "Numbers are not the only things one can reduce"
  [(= "longest" (reduce (fn [a b]
                          (if (< __ __) b a))
                  ["which" "word" "is" "longest"])) (* 10 x) (< x 4)] (count a) (count b))
