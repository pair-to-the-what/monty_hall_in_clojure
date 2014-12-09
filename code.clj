(ns hiker)

(defn make-random-doors []
  (assoc [:goat :goat :goat] (rand-int 3) :car))
