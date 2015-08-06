(defproject enclog "0.6.6"
  :description "Thin Clojure wrapper for Encog(v3) Machine-Learning framework."
  :url "http://github.com/jimpil/enclog"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.encog/encog-core "3.3.0"]]
  :jvm-opts ["-Xmx1g"]
  :scm  {:name "git"
         :url "https://github.com/jimpil/enclog"}
  :main     enclog.examples
  ;:java-source-paths ["src/encog_java"]

  ;; build https://github.com/encog/encog-java-core and  https://github.com/encog/encog-java-examples on 20150806
  ;; because latest encog-java-examples version available is 3.1.0 (and not 3.3.0)
  :resource-paths ["lib/encog-java-examples.jar"])
