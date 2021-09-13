// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.

import Vue from 'vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import routes from './router/routes'


//Components
import App from './App'


Vue.config.productionTip = false
Vue.use(ElementUI);

/* eslint-disable no-new */
const app = new Vue({
  el: '#app',
  components: { App },
  render: h => h(this.ViewComponent),
  data: {
    currentRoute: window.location.pathname,
  },
  computed: {
    ViewComponent() {
      const matchView = routes[this.currentRoute];
      return matchView
        ? require('./pages/' + matchView + '.vue')
        : require('./pages/404.vue')
    }
  },
})

window.addEventListener('popstate', () => {
  app.currentRoute = window.location.pathname;
})
