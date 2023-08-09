<template>
    <div id="uploadArea" v-on:click="getFile">
        <input  type="file" accept="image/*" ref="uploadInput" v-on:change="getFile"/>
        <img width="375px"  style="height: 100%; width: 375px;" ref="uploadImg" src=""/>
    </div>
</template>

<script>
export default{
    methods:{
        getFile:function(){
            const input=this.$refs.uploadInput;
            const preview=this.$refs.uploadImg;

            if(input.files[0] ==null){
                return;
            }

            const reader = new FileReader();

            reader.onloadend=()=>{
                preview.src=reader.result;
            }
            reader.readAsDataURL(input.files[0]);
        }
    }
}
</script>


<style scoped>
#uploadArea{
    width: 375px;
    border: 1px solid black;
    height: 100%;
}
</style>