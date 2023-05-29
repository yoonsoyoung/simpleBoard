<template>
    <div id="boardRoot">
        <BoardList />
    </div>
</template>

<script>
import BoardList from '../components/Board/BoardListView.vue'

export default {
    name: 'Board',
    components: {
        BoardList,
    }
}
</script>

<style>

</style>