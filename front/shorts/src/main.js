import { createApp } from 'vue'
import App from './App.vue'
import router from './router.js'
import axios from 'axios';
import mitt from 'mitt';

const app = createApp(App);
const emitter = mitt();
app.config.globalProperties.$axios=axios;
app.config.globalProperties.emitter=emitter;
app.use(router);
app.mount('#app');
