<template>
  <Header/>
  <RouterView />
  <Footer/>
</template>

<script>
import Header from "@/components/Header";
import Footer from "@/components/Footer";
export default {
  name: 'App',
  components: {
    Footer,
    Header
  }
}
</script>
<style>
</style>
