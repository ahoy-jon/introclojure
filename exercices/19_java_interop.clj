(exercice
  "You may have done more with Java than you know"
  [(= __ (class "warfare"))]java.lang.String)


  (exercice
  "The dot signifies easy and direct Java interoperation"
  [(= __ (.toUpperCase "select * from"))]"SELECT * FROM")


    (exercice
  "But instance method calls are very different from normal functions"
  [(= ["SELECT" "FROM" "WHERE"] (map ___ ["select" "from" "where"]))]10)


      (exercice
  "Constructing might be harder than breaking"
  [(= 10 (let [latch (java.util.concurrent.CountDownLatch. __)]
          (.getCount latch)))]1024)


        (exercice
  "Static methods are slashing prices!"
  [(== __ (Math/pow 2 10))]#(.toUpperCase %))
