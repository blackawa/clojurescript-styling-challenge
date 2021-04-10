# ClojureScript Styling Challenge

## [Tailwindcss](https://tailwindcss.com/)

```
npm run build:tailwindcss
npm run watch:tailwindcss-app
# visit http://localhost:8080 and you can see it.
```

## Evaluation
### Summary
Utilities is usefull.
`@apply` may connect various utilities and short class names for your app.
However, so what is the difference with other styling tools?

### Pros
- You need no custom css
- You need no `foo-bar-inner-wrapper` class.

### Cons
- You get very ugly DOM structure(== React component).
- You may need custom css(and some build systems) for some reasons in production.
  - Tone and manners
  - Shorthand class names like `card`
  - Beautiful css animations

## [cljss](https://github.com/clj-commons/cljss)

```
npm run watch:cljss
# visit http://localhost:8081 and you can see it.
```

## Evaluation
### Summary
The most [styled-components](https://styled-components.com/) like library in candidates.

### Pros
- Easy to use.

### Cons
- You need to write styles in clojurish way.

## [stylefy](https://github.com/Jarzka/stylefy)

```
npm run watch:stylefy
# visit http://localhost:8082 and you can see it.
```

## Evaluation
### Summary
The most [garden](https://github.com/noprompt/garden) like library in candidates.

### Pros
- Styles are just a sequence.
- Garden like grammer.

### Cons
- You need to write styles in VERY clojurish way.
- You need to study many special grammers.
