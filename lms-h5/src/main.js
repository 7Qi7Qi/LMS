import { createApp, h} from 'vue'
import routes from './routes'
import App from './App.vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'


//Components
createApp(ElementUI)
// createApp(App).mount('#app')

const simpleRouter = {
  data: () => ({
    currentRoute: window.location.pathname
  }),
  computed: {
    CurrentComponent() {
      const matchView = routes[this.currentRoute] || '404';
      return require(`./pages/${matchView}.vue`).default;
    }
  },
  render() {
    return h(this.CurrentComponent);
  },
  created() {
    window.addEventListener('popstate', () => this.currentRoute = window.location.pathname)
  }
}

createApp(simpleRouter).mount('#app');
