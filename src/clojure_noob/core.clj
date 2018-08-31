(ns clojure-noob.core
  (:gen-class))

(defn fibo
  [last, penultimate, stop]
  (println (str last ""))
  (if (> (+ last penultimate) stop)
    (println (str ""))
    (recur (+ last penultimate) last stop)
  )
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (fibo 1 1 10000))


