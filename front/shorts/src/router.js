import { createRouter, createWebHistory } from 'vue-router'
import LoginPage from './components/login-component.vue';
import ContentComponent from './components/content-component.vue';
import RegisterComponent  from './components/register-component.vue';
const routes = [
  {
    path:'/',
    component:ContentComponent
  },
  {
    path:'/login',
    component:LoginPage,
  },
  {
    path:'/register',
    component:RegisterComponent
  }

]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
