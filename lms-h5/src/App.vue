<template>
  <div id="app">
    <el-button>1111</el-button>
    <el-calendar>calendar</el-calendar>
    <router-view> </router-view>
  </div>
</template>
<script>
export default {
  name: 'App',

  mounted() {
    debugger;
    console.log('App')
  }
}
</script>

<style>
</style>
