(defn get-odds-and-evens [coll]
  (let [{odds true evens false} (group-by __ coll)]
    [odds evens]))

(exercice

  "To categorize a collection by some function, use group-by."
  [(= __ (group-by count ["hello" "world" "foo" "bar"]))] odd?)



(exercice

  "You can simulate filter + remove in one pass"
  [(= (get-odds-and-evens [1 2 3 4 5])
     ((juxt filter remove) odd? [1 2 3 4 5])
     [[1 3 5] [2 4]])] {5 ["hello" "world"] 3 ["foo" "bar"]})


(exercice

  "You can also group by a primary key"
  [(= __
     (group-by :id [{:id 1 :name "Bob"}
                    {:id 2 :name "Mike"}
                    {:id 1 :last-name "Smith"}]))] {1 [{:name "Bob" :id 1}
                                                       {:last-name "Smith" :id 1}]
                                                    2 [{:name "Mike" :id 2}]})


(exercice

  "But be careful when you group by non-required key"
  [(= {"Bob" [{:name "Bob" :id 1}]
       "Mike" [{:name "Mike" :id 2}]
       __ [{:last-name "Smith" :id 1}]}
     (group-by :name [{:id 1 :name "Bob"}
                      {:id 2 :name "Mike"}
                      {:id 1 :last-name "Smith"}]))] nil)


(exercice

  "The true power of group-by comes with custom functions"
  [(= __
     (group-by #(if (:bad %) :naughty-list :nice-list)
       [{:name "Jimmy" :bad true}
        {:name "Jack" :bad false}
        {:name "Joe" :bad true}]))] {:naughty-list [{:name "Jimmy" :bad true}
                                                    {:name "Joe" :bad true}]
                                     :nice-list [{:name "Jack" :bad false}]})
