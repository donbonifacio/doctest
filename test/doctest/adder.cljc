(ns doctest.adder)

(defn adder
  "Adds two numnbers.

  (doctest
    (= 2 (adder 1 1)))
  "
  [n1 n2]
  (+ n1 n2))

(meta #'adder)
