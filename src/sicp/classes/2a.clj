(ns sicp.classes.2a)

(defn sum-int
  [a b]
  (if (> a b) 0
      (+ a (sum-int (+ 1 a) b))))

(defn sum
  [term a next b]
  (if (> a b) 0
      (+ (term a)
         (sum term (next a) next b))))

(defn sum-int-with-lambda
  [a b]
  (def identity' (fn [x] x))
  (sum identity' a (fn [y] (+ 1 y)) b))
