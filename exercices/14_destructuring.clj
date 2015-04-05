
(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})

(exercice
  "Destructuring is an arbiter: it breaks up arguments"
  [(= __ ((fn [[a b]] (str b a))
         [:foo :bar]))]":bar:foo")


  (exercice
  "Whether in function definitions"
  [(= (str "First comes love, "
          "then comes marriage, "
          "then comes Clojure with the baby carriage")
     ((fn [[a b c]] __)
      ["love" "marriage" "Clojure"]))](format (str "First comes %s, "
                                                   "then comes %s, "
                                                   "then comes %s with the baby carriage")
                                           a b c))


    (exercice
  "Or in let expressions"
  [(= "Rich Hickey aka The Clojurer aka Go Time aka Macro Killah"
     (let [[first-name last-name & aliases]
           (list "Rich" "Hickey" "The Clojurer" "Go Time" "Macro Killah")]
       __))]  (apply str
                   (interpose " "
                     (apply list
                       first-name
                       last-name
                       (interleave (repeat "aka") aliases)))))


      (exercice
  "You can regain the full argument if you like arguing"
  [(= {:original-parts ["Stephen" "Hawking"] :named-parts {:first "Stephen" :last "Hawking"}}
     (let [[first-name last-name :as full-name] ["Stephen" "Hawking"]]
       __))]{:original-parts full-name
             :named-parts {:first first-name :last last-name}})


        (exercice
  "Break up maps by key"
  [(= "123 Test Lane, Testerville, TX"
     (let [{street-address :street-address, city :city, state :state} test-address]
       __))] (str street-address ", " city ", " state)


          (exercice
  "Or more succinctly"
  [(= "123 Test Lane, Testerville, TX"
     (let [{:keys [street-address __ __]} test-address]
       __))] city state)


            (exercice
  "All together now!"
  [(= "Test Testerson, 123 Test Lane, Testerville, TX"
     (___ ["Test" "Testerson"] test-address))](str street-address ", " city ", " state))
