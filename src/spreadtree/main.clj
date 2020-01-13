(ns spreadtree.main
  (:require [com.stuartsierra.component :as component]
            [reloaded.repl :refer [set-init! go]])
  (:gen-class))

(defn -main [& [port]]
  (let [port (or port 3000)]
    (require 'spreadtree.system)
    (set-init! #((resolve 'spreadtree.system/new-system) {:http {:port port}}))
    (go)))
