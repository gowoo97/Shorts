import { createRouter, createWebHistory } from 'vue-router'
import LoginPage from './components/login-component.vue';
import RegisterComponent  from './components/register-component.vue';
import MainPage from './pages/Main-page.vue';
import PostPage from './pages/Post-page.vue';
const routes = [
  {
    path:'/',
    component:MainPage
  },
  {
    path:'/login',
    component:LoginPage,
  },
  {
    path:'/register',
    component:RegisterComponent
  },
  {
    path:'/posting',
    component:PostPage
  }

]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
