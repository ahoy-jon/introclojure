(exercice
  "Don't get lost when creating a map"
  [(= {:a 1 :b 2} (hash-map :a 1 __ __))] :b 2)


(exercice
  "A value must be supplied for each key"
  [(= {:a 1} (hash-map :a __))] 1)


(exercice
  "The size is the number of entries"
  [(= __ (count {:a 1 :b 2}))] 2)

(exercice
  "You can look up the value for a given key"
  [(= __ (get {:a 1 :b 2} :b))] 2)


(exercice
  "Maps can be used as functions to do lookups"
  [(= __ ({:a 1 :b 2} :a))] 1)


(exercice
  "And so can keywords"
  [(= __ (:a {:a 1 :b 2}))] 1)


(exercice
  "But map keys need not be keywords"
  [(= __ ({2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"} 2014))] "Sochi")


(exercice
  "You may not be able to find an entry for a key"
  [(= __ (get {:a 1 :b 2} :c))] nil)


(exercice
  "But you can provide your own default"
  [(= __ (get {:a 1 :b 2} :c :key-not-found))] :key-not-found)


(exercice
  "You can find out if a key is present"
  [(= __ (contains? {:a nil :b nil} :b))] true)


(exercice
  "Or if it is missing"
  [(= __ (contains? {:a nil :b nil} :c))] false)


(exercice
  "Maps are immutable, but you can create a new and improved version"
  [(= {1 "January" 2 __} (assoc {1 "January"} 2 "February"))] "February")


(exercice
  "You can also create a new version with an entry removed"
  [(= {__ __} (dissoc {1 "January" 2 "February"} 2))] 1 "January")


(exercice
  "Often you will need to get the keys, but the order is undependable"
  [(= (list __ __ __)
     (sort (keys {2014 "Sochi" 2018 "PyeongChang" 2010 "Vancouver"})))] 2006 2010 2014)


(exercice
  "You can get the values in a similar way"
  [(= (list __ __ __)
     (sort (vals {2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"})))] "PyeongChang" "Sochi" "Vancouver")


