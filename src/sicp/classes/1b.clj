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

(defn first-denomination
  [kinds-of-coins]
  (case kinds-of-coins
    1 1
    2 5
    3 10
    4 25
    5 50))

(defn cc
  [amount kinds-of-coins]
  (cond
    (= amount 0) 1
    (or (< amount 0) (= kinds-of-coins 0)) 0
    :else (+ (cc amount
                 (- kinds-of-coins 1))
             (cc (- amount
                    (first-denomination kinds-of-coins))
                 kinds-of-coins))))

(defn count-change
  [amount]
  (cc amount 5))

(defn expt
  [b n]
  (if (= n 0) 1
      (* b (expt b (- n 1)))))

(defn expt-iter
  [b counter product]
  (if (= counter 0) product
      (expt-iter b (- counter 1) (* b product))))

(defn expt-non-recursive
  [b n]
  (expt-iter b n 1))

(defn fast-expt
  [b n]
  (cond
    (= n 0) 1
    (even? n) (square (fast-expt b (/ n 2)))
    :else (* b (fast-expt b (- n 1)))))
