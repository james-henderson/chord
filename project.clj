(defproject jarohen/chord "0.2.2"
  :description "A library to bridge the gap between CLJ/CLJS, web-sockets and core.async"
  :url "https://github.com/james-henderson/chord.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2030"]
                 [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]
                 [http-kit "2.1.10"]] 
  :plugins [[lein-cljsbuild "1.0.1-SNAPSHOT"]
            [com.cemerick/clojurescript.test "0.2.1"]]
  :cljsbuild {:builds [{:source-paths ["src" "test/cljs"]
                        :compiler {:output-to "target/cljs/testable.js"
                                   :optimizations :whitespace
                                   :warnings true
                                   :pretty-print true}}]
             :test-commands {"unit-tests" ["phantomjs" :runner
                                           "window.literal_js_was_evaluated=true"
                                           "target/cljs/testable.js"]}
 
              })
