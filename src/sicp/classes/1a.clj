(ns sicp.classes.1a)

(defn square
  [x]
  (* x x))

(defn average
  [x y]
  (float (/ (+ x y) 2)))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn abs
  [x]
  (cond
    (< x 0) (- x)
    (= x 0) 0
    :else x))

(defn good-enough?
  [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn make-guess
  "Try a guess for the square root"
  [guess x]
  (if
    (good-enough? guess x) guess
    (make-guess (improve guess x) x)))

(defn sqrt
  [x]
  (make-guess 1 x))
