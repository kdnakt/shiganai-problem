<template>
  <div id="app">
    <img src="./assets/logo.png">
    <ShiganaiProblem msg="Click Try Button!"/>
  </div>
</template>

<script>
import ShiganaiProblem from './components/ShiganaiProblem.vue'

export default {
  name: 'app',
  components: {
    ShiganaiProblem
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
