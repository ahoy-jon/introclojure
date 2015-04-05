(defn hello
  ([] "Hello World!")
  ([a] (str "Hello, you silly " a "."))
  ([a & more] (str "Hello to this group: "
                (apply str
                  (interpose ", " (cons a more)))
                "!")))

(defmulti diet (fn [x] (:eater x)))
(defmethod diet :herbivore [a] __)
(defmethod diet :carnivore [a] __)
(defmethod diet :default [a] __)

(exercice
  "Some functions can be used in different ways - with no arguments"
  [(= __ (hello))] "Hello World!")


(exercice

  "With one argument"
  [(= __ (hello "world"))] "Hello, you silly world."
  )


(exercice

  "Or with many arguments"
  [(= __
     (hello "Peter" "Paul" "Mary"))] "Hello to this group: Peter, Paul, Mary!")


(exercice

  "Multimethods allow more complex dispatching"
  [(= "Bambi eats veggies."
     (diet {:species "deer" :name "Bambi" :age 1 :eater :herbivore}))] (str (:name a) " eats veggies."))


(exercice

  "Animals have different names"
  [(= "Thumper eats veggies."
     (diet {:species "rabbit" :name "Thumper" :age 1 :eater :herbivore}))] (str (:name a) " eats veggies."))


(exercice

  "Different methods are used depending on the dispatch function result"
  [(= "Simba eats animals."
     (diet {:species "lion" :name "Simba" :age 1 :eater :carnivore}))] (str (:name a) " eats animals."))


(exercice

  "You may use a default method when no others match"
  [(= "I don't know what Rich Hickey eats."
     (diet {:name "Rich Hickey"}))] (str "I don't know what " (:name a) " eats."))
