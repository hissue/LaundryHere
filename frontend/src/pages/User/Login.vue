<template>
  <form class="form-signin">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="name@example.com" v-model="state.form.email"
           required>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="Password" v-model="state.form.password"
           required>
    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" @click="submit()">Sign in</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
  </form>
<!--  https://colorlib.com/etc/lf/Login_v4/index.html -->
</template>
<script>
import {reactive} from "vue";
import axios from "axios";
import store from "@/scripts/store";

export default {
  setup() {
    const state = reactive({
      form: {
        email: "",
        password: ""
      }
    })

    const submit = () => {
      axios.post("/api/account/login", state.form).then((res) => {
        store.commit('setAccount',res.data);
        console.log(res.data);
        window.alert("로그인하였습니다.");
      })
    }
    return {state, submit}
  }
}
</script>

<style scoped>
.form-signin {
  width: 100%;
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}

.form-signin .checkbox {
  font-weight: 400;
}

.form-signin .form-control {
  position: relative;
  box-sizing: border-box;
  height: auto;
  padding: 10px;
  font-size: 16px;
}

.form-signin .form-control:focus {
  z-index: 2;
}

.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

</style>