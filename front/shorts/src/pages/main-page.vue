<template>
    <div v-if="checkSession" v-on:click="nextPage"  style="height: 100%; overflow: hidden; width: 375px;">
        <post class="post" v-for="(item,i) in postList" v-bind:key="i" v-bind:userId="item.userId"
        v-bind:content="item.content" v-bind:img="getPath(item.image.path,item.image.fileName)" ref="posts"> </post>
    </div>
    <div v-else v-on:click="test"  style="height: 100%; overflow: hidden;">
        <introducing class="titles"  v-for="content in msg" ref="msgs" v-bind:msg="content" v-bind:key="content"></introducing>
    </div>
</template>

<script>
import introducing from '../components/introducing-component.vue';
import post from '../components/post-component.vue';
import axios from 'axios';
    export default{
        components:{
            introducing,
            post
        },
        data:function(){
            return{
                msg:[
                    "위로 스와이프 해보세요",
                    "환영합니다!",
                    "Shorts는 짧은 글 SNS입니다.",
                ],
                hasUserId:false,
                postList:[]

            }
        },
        methods:{
            test:function(){
                const size=this.$refs.msgs.length;
                const objs=this.$refs.msgs;

                for(var i=0;i<size;i++){
                    let now=objs[i].$el.style.bottom;
                    now=now.replace(/[^0-9]/g,'');
                    now=((+now)+100)%300;
                    objs[i].$el.style.bottom=now+"%";
                }

            },
            getPath(path,filename){
                return "http://localhost:8080"+path+"/"+filename;
            },
            nextPage:function(){
                const size=this.$refs.posts.length;
                const objs=this.$refs.posts;

                for(var i=0;i<size;i++){
                    let now=objs[i].$el.style.bottom;
                    now=now.replace(/[^0-9]/g,'');
                    now=((+now)+100)%300;
                    objs[i].$el.style.bottom=now+"%";
                }

            }
        },
        computed:{
            checkSession:function(){
                return sessionStorage.getItem("userId");
            }
        },
        mounted:function(){
            axios.get("http://localhost:8080/posts/"+sessionStorage.getItem("userId")).then((res)=>{
                this.postList=res.data;
                console.log(this.postList);
            });
        }

    }
</script>

<style scoped>
.titles{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 100%;
    position: relative;
    transition: all 2s;
}
.post{
    display: flex;

    flex-direction: column;
    height: 100%;
    position: relative;
    transition: all 2s;
}
</style>