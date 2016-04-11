(ns sicp.classes.2b)

(defn- numer
  [x]
  (get x 0))

(defn- denom
  [x]
  (get x 1))

(defn- make-rat
  [x y]
  [x y])

(defn sum-rat
  ;; Each parameter is a Vector containing two values. This is
  ;; a simple representation of rational numbers.
  ;; The first value in the Vector is the numerator and the second
  ;; is the denomitator.
  [x y]
  (make-rat
   (+ (* (numer x) (denom y))
      (* (numer y) (denom x)))
   (* (denom x) (denom y))))
