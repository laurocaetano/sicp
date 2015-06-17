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
