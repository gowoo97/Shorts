<template>
  <div id="app" >
    <headerComponent></headerComponent>
    <div id="content" style="overflow: hidden; ">
      <router-view v-on:userIdCheck="console.log('hello')"></router-view>
    </div>
    <footerComponent></footerComponent>
  </div>
</template>

<script>
import headerComponent from './components/Header-component.vue';
import footerComponent from './components/footer-component.vue';
export default {
  components:{
    headerComponent,
    footerComponent
  },


}
</script>

<style scoped>
#app{

  border: 1px solid black;
  height: 100vh;
}
#content{
  height: 80vh;
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0;
}
</style>
