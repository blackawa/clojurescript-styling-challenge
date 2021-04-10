(ns challenges.styling.clojurescript.cljss.app
  (:require [rum.core :as r]))

(r/defc app
  []
  [:div "Hello from cljss"])

(defn init
  [& args]
  (r/mount (app) (.querySelector js/document "#app")))
