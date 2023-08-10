<template>
    <div id="footer">
        <div>Main</div>
        <div>Search</div>
        <div>Setting</div>
    </div>
</template>

<script>
export default{

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
    background-color: aqua;


}
#footer>div{
    border: 1px solid black;
    height: 100%;
    width: 100%;
}
</style>