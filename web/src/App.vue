<template>
  <NavBar></NavBar>
  <body>hello</body>
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"

export default {
  components: {
    NavBar
  },
  setup(){
  //   $.ajax({
  //     url:"http://localhost:3000/user/account/token/",
  //     type:"post",
  //     data:{
  //       username:'a',
  //       password:'pa',
  //     },
  //     success(resp){
  //       console.log(resp);
  //     },
  //     error(resp){
  //       console.log(resp);
  //     }
  //   })
    
  //   $.ajax({
  //     url:"http://localhost:3000/user/account/register/",
  //     type:"post",
  //     data:{
  //       username:'d',
  //       password:'pd',
  //       confirmedPassword:'pd'
  //     },
  //     success(resp){
  //       console.log(resp);
  //     },
  //     error(resp){
  //       console.log(resp);
  //     }
  //   })
  }
}
</script>

<style>
  body {
    background-image: url(./assets/images/background.png);
    background-size: cover;
  }
</style>
