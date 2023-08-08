<template>
    <div id="header">
        <div  style="margin-right: auto;" v-on:click="$router.push({ path: '/'})" ><h1>SHORTS</h1></div>
        <div class="buttons" v-if="!hasUserId" >
           <RouterLink to="/login"><input type="button" value="로그인" style="cursor: pointer;"/></RouterLink>
        </div>
        <div class="buttons" v-if="hasUserId">
            <input type="button" value="로그아웃" v-on:click="logout" style="cursor: pointer"/>
        </div>
    </div>
</template>

<script>

export default{
    data:()=>{
        return{
            hasUserId:false,
        }
    },
    methods:{
        setHasUserId:function(value) {
            this.hasUserId=value;
            console.log("renderd");
        },
        logout:function(){
            sessionStorage.clear();
            this.setHasUserId(false);
        }
    },
        mounted:function(){
        if(sessionStorage.getItem('userId')!=null){
            this.setHasUserId(true);
        }
        else{
            this.setHasUserId(false);
        }
        this.emitter.on('userIdCheck',()=>{
            this.setHasUserId(true);
        });
    }

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