<template>
  <img alt="Vue logo" src="./assets/logo.png" />
  <router-view v-slot="{Component}">
    <transition name="slide-fade">
      <component class="child-view" :is="Component"/>
    </transition>
  </router-view>
</template>

<style>

</style>



