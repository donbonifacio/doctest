(ns doctest.core-test
  (:require [doctest.core :as core]
            [clojure.test :refer :all]))

(def raw-doctest "(doctest.core/doctest
                    (println \"test running\")
                    (is true))")

(deftest run-doctest
  (core/register-doctest 'doctest.core-test raw-doctest))

(run-tests)
