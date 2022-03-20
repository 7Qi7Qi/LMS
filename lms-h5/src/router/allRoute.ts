import {Router, createRouter, createWebHistory, RouteRecordRaw} from 'vue-router';


import home from '../pages/Home.vue'
import about from '../pages/About.vue'
import notFound from '../pages/404.vue'

const routes: RouteRecordRaw[] = [
  {
    path: "/",
    component: home,
  },
  {
    path: "/about",
    component: about,
    redirect: '',
    children: [

    ]
  },
  {
    path: "/notFound",
    component: notFound,
  }

]


export const router: Router = createRouter({
  history: createWebHistory(),
  routes
})
