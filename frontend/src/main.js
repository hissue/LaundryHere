import { createApp } from "vue";
import App from './App.vue';
import store from "@/scripts/store";
import { createRouter, createWebHistory } from 'vue-router';

// Components
import Home from "@/pages/User/Home.vue";
import Login from "@/pages/User/Login.vue";
import CustomerSupport from "@/pages/User/customer-support/CustomerSupport.vue";
import Manual from "@/pages/User/Manual.vue";
import Howuse from "@/pages/User/Howuse.vue";
import Price from "@/pages/User/Price.vue";
import Uselist from "@/pages/User/uselist/Uselist.vue";
import MyPage from "@/pages/User/mypage/MyPage.vue";
import Order from "@/pages/User/order/Order.vue";
import Signup from "@/pages/User/Signup.vue";

const routes = [
    // 메인페이지
    { path: '/', component: Home },
    // 로그인
    { path:'/login', component: Login },
    // 회원가입
    { path:'/signin', component: Signup },
    // 고객지원
    { path:'/customer-support', component: CustomerSupport },
    // 서비스소개
    { path:'/manual', component: Manual },
    // 이용방법
    { path:'/howuse', component: Howuse },
    // 가격정보
    { path:'/price', component: Price },
    // 세탁신청
    { path:'/order', component: Order },
    // 이용내역
    { path:'/uselist', component: Uselist },
    // 마이페이지
    { path:'/mypage', component: MyPage }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

const app = createApp(App);

// Use Bootstrap styles
app.use(store).use(router).mount('#app');
