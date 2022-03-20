import {createRouter, createWebHistory, Router} from "vue-router";

// @ts-ignore
const modules = import.meta.glob('../pages/*.vue');
const routes = [];

for (let i in modules) {
  let item = modules[i];
  const routePath = item.name.replace(/(.*\/)*([^.]+).*/ig, '$2');
  routes.push({
    path: '/' + routePath,
    name: routePath,
    title: routePath,
    // @ts-ignore
    component: () => import(item.name),
  })
}

export const router = createRouter({
  history: createWebHistory(),
  routes
})



router.beforeEach((form, to, next) => {
  debugger
//   const store = useStore()
//   const noAuths = ['/login', '/login/gitee', '/home.html']
//   if (store.isLogin) {
//     if (noAuths.includes(form.path)) {
//       next('/new')
//       return
//     }
//     next()
//   } else {
//     if (noAuths.includes(form.path)) {
//       next()
//     } else {
//       window.location.href = '/home.html'
//     }
//   }
})

