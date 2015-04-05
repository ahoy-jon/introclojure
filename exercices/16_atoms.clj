(def atomic-clock (atom 0))

(exercice
  "Atoms are like refs"
  [(= __ @atomic-clock)] 0)


(exercice

  "You can change at the swap meet"
  [(= __ (do
           (swap! atomic-clock inc)
           @atomic-clock))] 1)


(exercice

  "Keep taxes out of this: swapping requires no transaction"
  [(= 5 (do
          __
          @atomic-clock))] (swap! atomic-clock (partial + 4)))


(exercice

  "Any number of arguments might happen during a swap"
  [(= __ (do
           (swap! atomic-clock + 1 2 3 4 5)
           @atomic-clock))] 20)


(exercice

  "Atomic atoms are atomic"
  [(= __ (do
           (compare-and-set! atomic-clock 100 :fin)
           @atomic-clock))] 20)


(exercice

  "When your expectations are aligned with reality, things proceed that way"
  [(= :fin (do
             (compare-and-set! __ __ __)
             @atomic-clock))] atomic-clock 20 :fin)
