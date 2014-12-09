
(ns hiker
  (:use clojure.test))

(def twenty-random-doors (map (fn [_] (make-random-doors)) (range 0 20)))

(deftest life-the-universe-and-everything
  (is (= true (vector? (make-random-doors))))
  (is (= 3 (count (make-random-doors))))
  (is (= 1 (count (filter #( = % :car) (make-random-doors)))))
  (is (= 2 (count (filter #( = % :goat) (make-random-doors)))))
  (is (apply not= twenty-random-doors))
)

(run-all-tests #"hiker")
