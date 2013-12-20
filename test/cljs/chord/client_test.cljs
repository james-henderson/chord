(ns chord.client-test
  (:require-macros [cemerick.cljs.test :refer [is deftest run-tests testing test-var]])
  (:require [cemerick.cljs.test :as t]
            [cljs.core.async :refer [unblocking-buffer?]]
            [chord.client :as chord]))

(deftest make-channel-without-buffer
  (let [ch (chord/make-channel)]
    (is (= false (nil? ch)))
    ;(is (= false (unblocking-buffer? ch)))
    ;(dotimes [i 1024]
    ;  (put! ch i))
    ;(is (= true (full? channel)))
    ;(is (= 1024 (count ch)))
    ;(throws? (put! ch 1024))
    ))
    

