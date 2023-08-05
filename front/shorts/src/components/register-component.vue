<template>
    <div id="registerBox">
        <h1>register</h1>
        <input type="text" v-model="userId" v-on:input="print(userId)" placeholder="사용자 아이디"/>
        <input type="password" v-model="userPw" v-on:change="print(userPw)" placeholder="패스워드"/>
        <input type="text" v-model="userNickname" v-on:change="print(userNickname)" placeholder="닉네임"/>
        <input type="button"  value="회원가입"/>
    </div>
</template>

<script>
    export default{
        data(){
            return{
                userId:"",
                userPw:"",
                userNickname:""
            }
        },
        methods:{
            print:function(obj){
                console.log(obj);
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