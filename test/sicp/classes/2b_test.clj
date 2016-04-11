(ns sicp.classes.2b-test
  (:use clojure.test
        sicp.classes.2b))

(deftest test-sum-rat
  (is (= [11 6] (sum-rat [1 3] [3 2])))
  (is (= [8 8] (sum-rat [2 4] [1 2]))))
