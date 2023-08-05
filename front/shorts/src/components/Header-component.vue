<template>
    <div id="header">
        <div  style="margin-right: auto;"><h1>SHORTS</h1></div>
        <div id="buttons">
           <RouterLink to="/login"><input type="button" value="로그인" style="cursor: pointer;"/></RouterLink>
        </div>
    </div>
</template>

<script>
export default{

}
</script>

<style scoped>
#header{
    display: flex;
    justify-content: flex-start;
    align-items: center;
    border-bottom: 1px solid rgb(161, 157, 157);
}
#header > div{
    margin: 10px;
}
input{
    height: 50px;
    width: 150px;
    border: none;
    background-color: rgb(18, 140, 240);
    border-radius: 10px;
    color: white;
    font-size: 20px;
}

</style>