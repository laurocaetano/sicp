(ns sicp.classes.1a-test
  (:use clojure.test
        sicp.classes.1a))

(deftest test-sqrt
  (is (= 2.0 (sqrt 4))))
