<template>
    <div id="uploadArea" v-on:click="getFile">
        <button v-on:click="send">send</button>
        <input  type="file" accept="image/*" ref="uploadInput" v-on:change="getFile"/>
        <img width="375px"  style="height: 300px; width: 375px;" ref="uploadImg" src=""/>
        <textarea maxlength="255" v-model="content"></textarea>
    </div>
</template>

<script>
import axios from 'axios';
export default{
    data:function(){
        return{
            fileUrl:"",
            file:"",
            content:''
        }
    },
    methods:{
        getFile:function(){
            const input=this.$refs.uploadInput;
            const preview=this.$refs.uploadImg;

            if(input.files[0] ==null){
                return;
            }
            this.file=input.files[0];
            const reader = new FileReader();

            reader.onloadend=()=>{
                preview.src=reader.result;
                this.fileUrl=reader.result;
            }
            reader.readAsDataURL(input.files[0]);
        },
        send:function(){
            const fd = new FormData()
            fd.append("test",this.file);
            fd.append("content",this.content);
            fd.append("userId",sessionStorage.getItem("userId"));
            axios.post('http://localhost:8080/upload',fd,{
                headers:{
                    'Content-Type':'multipart/form-data'
                }
            }).then(()=>{
                console.log(this.fileUrl)
            })
        }
    }
}
</script>

<style scoped>
#uploadArea{
    width: 375px;
    border: 1px solid black;
    height: 400px;
}
textarea{
    resize: none;
    width: 100%;
    box-sizing: border-box;
    font-size: 30px;

}
</style>