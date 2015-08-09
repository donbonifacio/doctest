(ns doctest.core-test
  (:require [doctest.core :as core]
            [clojure.test :refer :all]))

(def raw-doctest "(doctest
                    (println \"test running\")
                    (println adder)
                    (is (= 2 (adder 1 1)))
                    (is true))")

(deftest run-doctest
  (core/register-doctest 'doctest.core-test raw-doctest))

(run-tests)
