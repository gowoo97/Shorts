<template>
  <div id="app">
    <headerComponent></headerComponent>
    <div id="content">
      <router-view></router-view>
    </div>

  </div>
</template>

<script>
import headerComponent from './components/Header-component.vue';
export default {
  components:{
    headerComponent,
  }
}
</script>

<style scoped>
#app{

  border: 1px solid black;
  height: 100vh;
}
#content{
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0;
}
</style>
