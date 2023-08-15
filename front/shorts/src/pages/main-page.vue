<template>
    <div v-if="checkSession" >
        <post v-for="(item , i) in posts" v-bind:key="i" :userId="hello"></post>
        <div>hello</div>
    </div>
    <div v-on:click="test" v-else style="height: 100%; overflow: hidden;">
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
            post,
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
                    console.log(now);
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
            axios.get("http://localhost:8080/posts/10").then((res)=>{
                this.posts=res.data;
                console.log(this.posts);
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
</style>