<template>
    <div style="border: 1px solid black;">
        <div>{{ userId }}</div>
        <div>
            <img src={{img}}/>
        </div>
        <div>
            <p>
                {{ comment }}
            </p>
        </div>
    </div>
</template>

<script>
export default{

    props:['userId','img','comment'],
}
</script>

<style scoped>

</style>