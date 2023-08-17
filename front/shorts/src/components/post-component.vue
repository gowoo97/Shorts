<template>
    <div class="board" style="border: 1px solid black;">
        <div class="title">{{ userId }}</div>
        <div class="imgBox">
            <img class="imgObj" :src="img"/>
        </div>
        <div class="content">
            <p>
                {{ content }}
            </p>
        </div>
    </div>
</template>

<script>
export default{
    props:['userId','img','content'],
}
</script>

<style scoped>
.board{
    height: 200px;

}
.title{
    border-bottom: 1px solid rgb(161, 157, 157);
}
.imgBox{
    width: 375px;
    height: 300px;
}
.content{
    border: 1px solid rgb(161, 157, 157);
    border-radius: 5px;
    margin: 5px;
}
.imgObj{
    width: 100%;
    height: 100%;
    object-fit:contain;
}

</style>