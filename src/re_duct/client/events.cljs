(ns re-duct.client.events
  (:require [re-duct.client.db :as db]
          [re-frame.core :as re-frame]))

(re-frame/reg-event-db
 ::initialize-db
 (fn  [_ _]
   db/default-db))
