(ns aoc2020.core
  (:require [aoc2020.input2 :refer [input2]])
  (:gen-class))

; day 2
(defn valid-min-max-pw? [[min max letter pw]]
  (<= min (get (frequencies pw) letter 0) max))

(defn solve-2-1 []
  (println ((frequencies (map valid-min-max-pw? input2)) true)))

(defn valid-pos-pw? [[pos1 pos2 letter pw]]
  (let [letter1 (get pw (dec pos1))
        letter2 (get pw (dec pos2))]
    (and (not= letter1 letter2) (or (= letter letter1) (= letter letter2)))))

(defn solve-2-2 []
  (println ((frequencies (map valid-pos-pw? input2)) true)))

(defn -main
  [& args]
  (solve-2-2))
