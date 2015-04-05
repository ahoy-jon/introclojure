

(defn explain-defcon-level [exercise-term]
  (case exercise-term
        :fade-out          :you-and-what-army
        :double-take       :call-me-when-its-important
        :round-house       :o-rly
        :fast-pace         :thats-pretty-bad
        :cocked-pistol     :sirens
        :say-what?))

(exercice
  "You will face many decisions"
 [ (= __ (if (false? (= 4 5))
          :a
          :b))] :a)


  (exercice
  "Some of them leave you no alternative"
  [(= __ (if (> 4 3)
          []))] [])


    (exercice
  "And in such a situation you may have nothing"
  [(= __ (if (nil? 0)
          [:a :b :c]))]nil)


      (exercice
  "In others your alternative may be interesting"
  [(= :glory (if (not (empty? ()))
              :doom
              __))] :glory)


        (exercice
  "You may have a multitude of possible paths"
  [(let [x 5]
    (= :your-road (cond (= x __) :road-not-taken
                        (= x __) :another-road-not-taken
                        :else __)))] 4 6 :your-road)


          (exercice
  "Or your fate may be sealed"
  [(= 'doom (if-not (zero? __)
          'doom
          'more-doom))]1)


            (exercice
  "In case of emergency, sound the alarms"
 [ (= :sirens
     (explain-defcon-level __))]:cocked-pistol)


              (exercice
  "But admit it when you don't know what to do"
  [(= __
     (explain-defcon-level :yo-mama))] :say-what?)
