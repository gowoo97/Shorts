<template>
    <div id="registerBox">
        <h1>register</h1>
        <input type="text" v-model="userId"  placeholder="사용자 아이디"/>
        <input type="password" v-model="userPw"  placeholder="패스워드"/>
        <input type="text" v-model="userNickname"  placeholder="닉네임"/>
        <input type="button" v-on:click="register" value="회원가입"/>
    </div>
</template>

<script>
import axios from 'axios';

    export default{
        data(){
            return{
                userId:"",
                userPw:"",
                userNickname:"",
            }
        },
        methods:{
            register:function(){
                axios.post('http://localhost:8080/register',{
                    memberId:this.userId,
                    memberPw:this.userPw,
                    nickName:this.userNickname
                })
                .then((res) => {
                    console.log(res);
                    this.$router.push( { path: "/"} );
                }).catch(function(err){
                    console.log(err);
                })
            }
        }
    }
</script>

<style scoped>
#registerBox{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    border: 1px solid rgb(179, 170, 170);
    width: 500px;
}
input{
    box-sizing: border-box;
    width: 270px;
    height: 30px;
    margin-bottom: 20px;
    border-radius: 5px;
    border: 1px solid rgb(179, 170, 170);
}
input[type='button']{
    background-color: rgb(18, 140, 240);
    cursor: pointer;
    color: white;

}
</style>