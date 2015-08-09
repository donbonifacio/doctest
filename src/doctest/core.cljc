(ns doctest.core
  (:require [clojure.test :refer :all]))

(defmacro doctest
  "Has test definitions"
  [source-ns & body]
  `(deftest doctest#
     ~@body))

(defn- expanded-doctest
  ""
  [source-ns raw]
  (let [ops (read-string raw)]
    (concat (list 'doctest.core/doctest
                  source-ns)
            (rest ops))))

(defn register-doctest
  "Given a doctest raw string will evaluate it"
  [source-ns raw]
  (eval (expanded-doctest source-ns raw)))
