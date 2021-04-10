(ns challenges.styling.clojurescript.stylefy.app
  (:require [rum.core :refer [defc reactive mount]]
            [stylefy.core :as stylefy]
            [stylefy.rum :as stylefy-rum]))

(def h1-style
  {:font-size "32px"
   :font-weight "500px"
   :color "#333"})

(defc app < reactive
  []
  [:div (stylefy/use-style h1-style) "hello from stylefy"])

(defn init
  [& args]
  (stylefy/init {:dom (stylefy-rum/init)})
  (mount (app) (.querySelector js/document "#app")))
