<template>
    <div class="profile">
        <div>{{ userId }}</div>
        <input type="button" v-on:click="follow"  value="follow" />
    </div>
</template>

<script>
import axios from 'axios';
export default{
    data(){
        return{
            sender:''
        }
    },
    props:['userId'],
    methods:{
        follow:function(){
            axios.post("http://localhost:8080/following/"+this.userId,{
                    userId:this.sender,
            })
            .then((res)=>{
                    console.log(res);
            });
        }
    },
    mounted:function(){
        this.sender=sessionStorage.getItem("userId");
    }
}
</script>

<style scoped>
.profile{
    display: flex;
}
.profile>div{
    margin-right: auto;
}
</style>