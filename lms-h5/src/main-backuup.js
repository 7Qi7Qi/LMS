// import ElementUI from 'element-ui'
// import 'element-ui/lib/theme-chalk/index.css'
import routes from './router'
import { createApp, h} from 'vue'


//Components

const simpleRouter = {
  data: () => ({
    currentRoute: window.location.pathname
  }),
  computed: {
    CurrentComponent() {
      const matchView = routes[this.currentRoute]
      return matchView
          ? import(`./pages/${matchView}.vue`)
          : import(`./pages/404.vue`)
    }
  },
  created() {
    window.addEventListener('popstate', () => {
      this.currentRoute = window.location.pathname;
    })
  },
  render() {
    this.CurrentComponent.then(res => {
      return h(res);
    })
  }
}

const app = createApp(simpleRouter);
app.mount('#app')


