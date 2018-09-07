(ns radz.test.foo
  (:require radz.test.bar
            radz.test.baz
            radz.test.qux))

(def number 1)

(defn bar-number []
  radz.test.bar/number)

(defn bar-qux-number []
  (radz.test.bar/qux-number))

(defn baz-number []
  radz.test.baz/number)

(defn baz-qux-number []
  (radz.test.baz/qux-number))
