<template>
    <div id="footer">
        <div v-on:click="$router.push({ path: '/'})">Main</div>
        <div v-on:click="$router.push({ path: '/search'})">Search</div>
        <div v-on:click="$router.push({ path: '/mypage'})">mypage</div>
    </div>
</template>

<script>
export default{

    methods:{

    }
}
</script>


<style scoped>
#footer{
    position: fixed;
    height: 7vh;
    bottom: 0px;
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: row;
}
#footer>div{
    border: 1px solid black;
    height: 100%;
    width: 100%;
}

</style>