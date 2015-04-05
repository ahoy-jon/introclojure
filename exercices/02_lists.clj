//2_lits

(exercice
  "Lists can be expressed by function or a quoted form"
  [(= '(__ __ __ __ __) (list 1 2 3 4 5))]1 2 3 4 5)

(exercice

  "They are Clojure seqs (sequences), so they allow access to the first"
  [(= __ (first '(1 2 3 4 5)))]1)


(exercice
  "As well as the rest"
  [(= __ (rest '(1 2 3 4 5)))][2 3 4 5])


(exercice
  "Count your blessings"
  [(= __ (count '(dracula dooku chocula)))]3)


(exercice
  "Before they are gone"
  [(= __ (count '()))]0)


(exercice

  "The rest, when nothing is left, is empty"
  [(= __ (rest '(100)))]())


(exercice

  "Construction by adding an element to the front is easy"
  [(= __ (cons :a '(:b :c :d :e)))][:a :b :c :d :e])


(exercice

  "Conjoining an element to a list isn't hard either"
  [(= __ (conj '(:a :b :c :d) :e))] [:e :a :b :c :d])


(exercice

  "You can use a list like a stack to get the first element"
  [(= __ (peek '(:a :b :c :d :e)))]:a)


(exercice

  "Or the others"
  [(= __ (pop '(:a :b :c :d :e)))][:b :c :d :e])


(exercice

  "But watch out if you try to pop nothing"
  [(= __ (try
           (pop '())
           (catch IllegalStateException e
             "No dice!")))]"No dice!")


(exercice

  "The rest of nothing isn't so strict"
  (= __ (try
          (rest '())
          (catch IllegalStateException e
            "No dice!"))) ())
