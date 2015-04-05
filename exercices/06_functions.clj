(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(exercice
  "Calling a function is like giving it a hug with parentheses"
  [(= __ (square 9))] 81)


(exercice
  "Functions are usually defined before they are used"
  [(= __ (multiply-by-ten 2))] 20)


(exercice
  "But they can also be defined inline"
  [(= __ ((fn [n] (* 5 n)) 2))] 10)


(exercice
  "Or using an even shorter syntax"
  [(= __ (#(* 15 %) 4))] 60)


(exercice
  "Even anonymous functions may take multiple arguments"
  [(= __ (#(+ %1 %2 %3) 4 5 6))] 15)


(exercice
  "Arguments can also be skipped"
  [(= __ (#(* 15 %2) 1 2))] 30)


(exercice
  "One function can beget another"
  [(= 9 (((fn [] ___)) 4 5))] +)


(exercice
  "Functions can also take other functions as input"
  [(= 20 ((fn [f] (f 4 5))
           ___))] *)


(exercice
  "Higher-order functions take function arguments"
  [(= 25 (___
           (fn [n] (* n n))))] (fn [f] (f 5)))


(exercice
  "But they are often better written using the names of functions"
  [(= 25 (___ square))] (fn [f] (f 5)))
