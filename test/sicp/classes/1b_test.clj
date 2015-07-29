(ns sicp.classes.1b-test
  (:use clojure.test
        sicp.classes.1b))

(deftest test-sum-of-squares
  (is (= 18 (sum-of-squares 3 3))))

(deftest test-fib
  (is (= 13 (fib 7))))

(deftest test-non-recursive-fib
  (is (= 13 (fib 7))))
