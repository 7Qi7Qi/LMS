import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import routes from './router/routes'
import { createApp } from 'vue'
import App from './App.vue'


//Components
createApp(ElementUI)
createApp(App).mount('#app')

const {createApp, h} = Vue

const simpleRouter = {
  data: () => ({
    currentRoute: window.location.pathname
  }),
  computed: {
    CurrentComponent() {
      return routes[this.currentRoute] || 
      const matchView = routes[this.currentRoute];
      return matchView
          ? require('./pages/' + matchView + '.vue')
          : require('./pages/404.vue')
    }
  },
}

window.addEventListener('popstate', () => {
  app.currentRoute = window.location.pathname;
})
