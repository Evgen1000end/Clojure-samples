(ns clojure-samples.L0)

(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

; Print with double format
(println  (double(average [1 3 4 5])))

; Print with default fraction format
(println  (average [1 3 4 5]))

; simple expression
(+ 1 2)


(def a 1)
(inc a)

; а - не увеличился
(println a)

; а так - правильно!
(println (inc a))

; call Java
(println (Math/pow 2 10))


;Deserialize
(println (read-string "42"))

;Serialize;
(def a (pr-str 2))
(println a)



