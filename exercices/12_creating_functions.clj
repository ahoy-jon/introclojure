(defn square [x] (* x x))

(exercice
  "One may know what they seek by knowing what they do not seek"
  [(= [__ __ __] (let [not-a-symbol? (complement symbol?)]
                   (map not-a-symbol? [:a 'b "c"])))] true false true)


(exercice

  "Praise and 'complement' may help you separate the wheat from the chaff"
  [(= [:wheat "wheat" 'wheat]
     (let [not-nil? ___]
       (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))] 4)


(exercice

  "Partial functions allow procrastination"
  [(= 20 (let [multiply-by-5 (partial * 5)]
           (___ __)))] :a :b :c :d)


(exercice

  "Don't forget: first things first"
  [(= [__ __ __ __]
     (let [ab-adder (partial concat [:a :b])]
       (ab-adder [__ __])))] :c :d)


(exercice

  "Functions can join forces as one 'composed' function"
  [(= 25 (let [inc-and-square (comp square inc)]
           (inc-and-square __)))] 4)


(exercice

  "Have a go on a double dec-er"
  [(= __ (let [double-dec (comp dec dec)]
           (double-dec 10)))] 8)


(exercice

  "Be careful about the order in which you mix your functions"
  [(= 99 (let [square-and-dec ___]
           (square-and-dec 10)))] (complement nil?)
  multiply-by-5
  (comp dec square))
