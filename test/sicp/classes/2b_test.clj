(ns sicp.classes.2b-test
  (:use clojure.test
        sicp.classes.2b))

(deftest test-sum-rat
  (is (= [11 6] (sum-rat [1 3] [3 2])))
  (is (= [8 8] (sum-rat [2 4] [1 2]))))

(deftest test-mult-rat
  (is (= [6 6] (mult-rat [2 3] [3 2])))
  (is (= [10 21] (mult-rat [5 7] [2 3]))))

(deftest test-list-ref
  (is (= 16 (list-ref '(1 4 9 16 25) 3)))
  (is (= 3 (list-ref '(4 3 2 1) 1))))

(deftest test-scale-list
  (is (= '(10 20 30 40) (scale-list '(1 2 3 4) 10))))

(deftest test-scale-tree
  (is (= '(10 (20 (30 40) 50) (60 70)) (scale-tree '(1 (2 (3 4) 5) (6 7)) 10))))
