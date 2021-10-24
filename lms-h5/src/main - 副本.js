// import ElementUI from 'element-ui'
// import 'element-ui/lib/theme-chalk/index.css'
import routes from './router/routes'
import { createApp, h} from 'vue'

const simpleRouter = {
  data: () => ({
    currentRoute: window.location.pathname
  }),
  computed: {
    CurrentComponent() {
      debugger
      // return routes[this.currentRoute] ||
      const matchView = routes[this.currentRoute]
      console.log(`matchView: ${matchView}`)
      console.log(`currentRoute: ${this.currentRoute}`)
      return matchView
          ? require('./pages/' + matchView + '.vue')
          : require('./pages/404.vue')
    }
  },
  render() {
    return h(this.CurrentComponent);
  },
  created() {
    window.addEventListener('popstate', () => {
      this.currentRoute = window.location.pathname;
    })
  }
}

var app = createApp(simpleRouter);
app.mount('#app')
// app.use(ElementUI)
