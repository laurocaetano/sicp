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

(defn mult-rat
  [x y]
  (make-rat
   (* (numer x) (numer y))
   (* (denom x) (denom y))))

(defn list-ref
  [items n]
  (if (= n 0) (first items)
      (list-ref (rest items) (- n 1))))

(defn scale-list
  [list factor]
  (if (empty? list) nil
      (cons (* (first list) factor)
            (scale-list (rest list) factor))))

(defn scale-tree
  [sub-tree factor]
  (cond (and (list? sub-tree) (empty? sub-tree)) nil
        (not (list? sub-tree)) (* sub-tree factor)
        :else (cons (scale-tree (first sub-tree) factor)
                    (scale-tree (rest sub-tree) factor))))
