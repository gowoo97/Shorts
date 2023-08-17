<template>
    <div id="box">
        <div>
            <input id="searchBar" type="text" v-model="inputData" v-on:input="getUsers" placeholder="유저명을 입력하세요"/>
        </div>
        <div>
            <profile v-for="(item,i) in userList" v-bind:key="i" v-bind:userId="item.memberId"></profile>
        </div>
    </div>
</template>

<script>
import profile from './profile-component.vue';
export default{
    data(){
        return{
            userList:[],
            inputData:''
        }
    },
    components:{
        profile,
    },
    mounted:function(){

    },
    methods:{
        getUsers:function(){
            if(this.inputData == ""){
                return;
            }
            this.$axios.get('http://localhost:8080/member/'+this.inputData)
            .then((res)=>{
                this.userList=res.data;
            });
        }
    }

}
</script>


<style scoped>
#box{
    height: 100%;
    width:100%;
    border: 1px solid black;
}

#searchBar{
    width: 100%;
}
</style>