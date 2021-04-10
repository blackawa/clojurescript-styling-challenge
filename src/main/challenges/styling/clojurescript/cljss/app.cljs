(ns challenges.styling.clojurescript.cljss.app
  (:require [rum.core :refer [defc defcs mount local]]
            ;; necessary for cljss.rum/defstyled
            [sablono.core :refer [html]]
            [cljss.rum :refer [styled]])
  (:require-macros [cljss.core :refer [defstyles]]
                   [cljss.rum :refer [defstyled]]))

(defstyles preview [bg]
  {:font-size "14px"
   :background-color bg})

(defstyled h1 :h1
  {:font-size :font-size
   :font-weight "500px"
   :color "red"})

(defstyled styled-input :input
  {:border "1px solid #333"})

(defcs app
  <
  (local nil ::n)
  [{n ::n}]
  [:div
   (h1 {:font-size "32px"} "Hello from cljss")
   (styled-input {:type "number"
                  :on-change (fn [e] (reset! n (-> e .-target .-value)))})
   [:pre {:class (preview "#e3e3e3")} "input text:" (some-> n deref)]])

(defn init
  [& args]
  (mount (app) (.querySelector js/document "#app")))
