(ns challenges.styling.clojurescript.tailwindcss.app
  (:require [rum.core :as r]))

(r/defc app
  []
  [:.p-6.max-w-sm.mx-auto.bg-white.rounded-xl.shadow-md.flex.items-center.space-x-4
   [:.frex-shrink-0
    [:img.h-12.w-12 {:src "/img/logo.svg" :alt "ChitChat Logo"}]]
   [:div
    [:.text-xl.font-medium.text-black "ChitChat"]
    [:p.text-gray-500 "You have a new message!"]]])

(defn init
  [& args]
  (r/mount (app) (.querySelector js/document "#app")))
