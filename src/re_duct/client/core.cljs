(ns re-duct.client.core
  (:require [re-duct.client.events :as events]
            [re-duct.client.views :as views]
            [re-duct.client.config :as config]
            [re-frame.core :as re-frame]
            [reagent.core :as reagent]))

(defn dev-setup []
 (when config/debug?
   (enable-console-print!)
   (println "dev mode")))

(defn mount-root []
 (re-frame/clear-subscription-cache!)
 (reagent/render [views/main-panel]
   (.getElementById js/document "app")))

(defn ^:export init []
 (re-frame/dispatch-sync [::events/initialize-db])
 (dev-setup)
 (mount-root))
