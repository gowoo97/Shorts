<template>
    <div id="loginBox">
        <h1>Login</h1>
        <input type="text" v-model="userId" placeholder="사용자 아이디"/>
        <input type="password" v-model="userPw" placeholder="패스워드"/>
        <input type="button" v-on:click="login" value="로그인"/>
        <p>
            아직 회원이 아니신가요? <RouterLink to="/register"><span style="color: blue; font-size: 20px;">회원가입</span></RouterLink>
        </p>
    </div>
</template>

<script>
import axios from 'axios';
    export default{
        data(){
            return{
                userId:'',
                userPw:''
            }
        },
        methods:{
            login:function(){
                axios.post('http://localhost:8080/login',{
                    memberId:this.userId,
                    memberPw:this.userPw
                })
                .then((res)=>{
                    console.log(res);
                    sessionStorage.setItem('userId',res.data.userId);
                    sessionStorage.setItem('nickName',res.data.userNickname);
                    this.emitter.emit('userIdCheck');
                    this.$router.push( { path: "/"} );
                }).catch(function(err){
                    console.log(err);
                })
            }
        }
    }
</script>

<style scoped>
#loginBox{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    border: 1px solid rgb(179, 170, 170);
    width: 500px;
    min-width: 375px;
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