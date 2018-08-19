(ns re-duct.handler.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :re-duct.handler/example [_ options]
  (context "/example" []
    (GET "/" []
      {:body {:example "data"}}(io/resource "re_duct/handler/example/example.html"))))
