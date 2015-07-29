(ns sicp.classes.1b)

(defn square
  [x]
  (* x x))

(defn sum-of-squares
  [x y]
  (+ (square x) (square y)))

(defn fib
  [n]
  (if (< n 2) n
      (+ (fib (- n 1))
         (fib (- n 2)))))

(defn fib-iter
  [a b count]
  (if (= count 0) b
      (fib-iter (+ a b) a (- count 1))))

(defn non-recursive-fib
  [n]
  (fib-iter 1 0 n))
