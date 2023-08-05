<template>
    <div id="loginBox">
        <h1>Login</h1>
        <input type="text" placeholder="사용자 아이디"/>
        <input type="password" placeholder="패스워드"/>
        <input type="button" value="로그인"/>
        <p>
            아직 회원이 아니신가요? <RouterLink to="/register"><span style="color: blue; font-size: 20px;">회원가입</span></RouterLink>
        </p>
    </div>
</template>

<script>
    export default{

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