<template>
    <div id="content" class="brd-wr">
      <div class="tit-area">
        <h2>로그인</h2>
        <p class="sub-tx">크린토피아 로그인 페이지 입니다.</p>
      </div><!-- /tit-area -->

      <div class="brd-bx">

        <div class="inner">

          <div class="login-bx">
            <div class="left">
              <h3>로그인</h3>
              <ul class="log-tab">
                <li class="active"><a href="#tc1" id="hom" name="hom">홈페이지 회원</a></li>
                <li class=""><a href="#tc2" id="app" name="app">크린앱 회원</a></li>
              </ul>
              <!-- 홈페이지 회원 -->
              <form name="wform" method="post">
                <div class="tc" id="tc1" style="display: block;">
                  <input type="hidden" name="return_url" id="return_url" value="">
                  <input type="hidden" name="searchType" id="searchType">
                  <p class="inp"><input type="text" name="m_id" id="m_id" value="" class="input id" placeholder="아이디" maxlength="50"></p>
                  <p class="inp"><input type="password" name="m_passwd" id="m_passwd" class="input pw" placeholder="비밀번호" maxlength="20"></p>
                  <label class="chk"> 아이디 저장 <input type="checkbox" name="idSave" id="idSave" value="Y"> </label>
                  <div class="btn-box">
                    <a href="javascript:void(0);" class="btn btn-blue btn-lg" onclick="onLogin('W');">로그인</a>
                  </div>
                </div>
              </form>
              <!-- 크린앱 회원 -->
              <form name="aform" method="post">
                <div class="tc" id="tc2" style="display: none;">
                  <input type="hidden" name="return_url" id="return_url" value="">
                  <input type="hidden" name="searchType" id="searchType">
                  <p class="inp"><input type="text" name="m_id" id="m_id" value="" class="input id" placeholder="아이디" maxlength="50"></p>
                  <p class="inp"><input type="password" name="m_passwd" id="m_passwd" class="input pw" placeholder="비밀번호" maxlength="20"></p>
                  <label class="chk"> 아이디 저장 <input type="checkbox" name="idSave" id="idSave" value="Y"></label>
                  <div class="btn-box">
                    <a href="javascript:void(0);" class="btn btn-blue btn-lg" onclick="onLogin('A');">로그인</a>
                  </div>
                </div>
              </form>
            </div><!-- /left -->
            <div class="right">
              <p class="tx01">안녕하세요.</p>
              <dl>
                <dt>회원가입</dt>
                <dd>
                  가입 후 이벤트 참여 및 다양한 정보를 제공 받으실 수 있습니다.
                  <span class="btnz">
										<a href="/kr/member/join.do" class="btlogin">회원가입</a>
									</span>
                </dd>
              </dl>
              <dl>
                <dt>아이디/비밀번호 찾기</dt>
                <dd>
                  아이디 또는 비밀번호 정보를 찾으실 수 있습니다.
                  <span class="btnz">
										<a href="/kr/infoFind.do" class="btlogin">아이디 찾기</a>
										<a href="/kr/infoFind.do" class="btlogin">비밀번호 찾기</a>
									</span>
                </dd>
              </dl>
            </div><!-- /right -->
          </div><!-- /login-bx-->

        </div><!-- /inner -->

      </div><!-- /brd-bx -->

    </div>

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

<style>

</style>