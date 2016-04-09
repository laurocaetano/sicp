(ns sicp.classes.1b-test
  (:use clojure.test
        sicp.classes.1b))

(deftest test-sum-of-squares
  (is (= 18 (sum-of-squares 3 3))))

(deftest test-fib
  (is (= 13 (fib 7))))

(deftest test-non-recursive-fib
  (is (= 13 (fib 7))))

(deftest test-count-change
  (is (= 292 (count-change 100))))

(deftest test-expt
  (is (= 4 (expt 2 2)))
  (is (= 8 (expt 2 3))))

(deftest test-expt-non-recursive
  (is (= 4 (expt-non-recursive 2 2)))
  (is (= 8 (expt-non-recursive 2 3))))

(deftest test-fast-expt
  (is (= 4 (fast-expt 2 2)))
  (is (= 8 (fast-expt 2 3))))

(deftest test-gdc
  (is (= 2 (gdc 206 40))))
