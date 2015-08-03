(ns clojure-samples.L0)

(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

; Print with double format
(println  (double(average [1 3 4 5])))

; Print with default fraction format
(println  (average [1 3 4 5]))
