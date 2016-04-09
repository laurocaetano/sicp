(ns sicp.classes.2a-test
  (:use clojure.test
        sicp.classes.2a))

(deftest test-sum-int
  (is (= 165 (sum-int 10 20))))

(deftest test-sum-int-with-lambda
  (is (= 420 (sum-int-with-lambda 10 30))))
