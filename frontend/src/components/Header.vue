<template>
  <header>
    <div id="header" class="">
      <h1 class="logo"><a href="/">런드리</a></h1>

      <!-- Start header-top -->
      <div class="header-top">
        <ul>
          <li><a href="/login">로그인</a></li>
          <li><a href="/signin">회원가입</a></li>
          <li><a href="/customer-support">고객센터</a>
            <ul>
              <li><a href="/customer-support/notice">공지사항</a></li>
              <li><a href="/customer-support/many-question">자주묻는 질문</a></li>
            </ul>
          </li>
        </ul>
      </div>
      <!-- End header-top -->

      <!-- Start Header main -->
      <div id="gnb-wrap">
        <ul id="gnb">
          <li class="gnb1"><a href="/manual">서비스소개</a></li>
          <li class="gnb2"><a href="/howuse">이용방법</a></li>
          <li class="gnb3"><a href="/price">가격정보</a></li>
          <li class="gnb4"><a href="/order">세탁신청</a>
            <div class="subdepth show_menu" style="display: none; height: 200px; padding-top: 40px; margin-top: 0px; padding-bottom: 0px; margin-bottom: 0px;">
              <div class="tit-tx">
                <strong>이용정보</strong>
                이벤트 정보를 <br>소개합니다.
              </div>
              <div class="inner">
                <ul>
                  <li><a href="/kr/useInfo/discount.do">할인정보</a></li>
                  <li><a href="/kr/useInfo/membership.do">멤버쉽</a></li>
                  <li><a href="/kr/useInfo/eventList.do">세일 및 이벤트</a></li>

                </ul>
                <ul>
                  <li><a href="/kr/useInfo/cleanApp.do">크린앱</a></li>
                  <li><a href="/kr/useInfo/group.do">단체세탁</a></li>
                  <li><a href="/kr/useInfo/manless.do">무인세탁함</a></li>
                </ul>
              </div>
              <div class="gnb-brn">

                <a href="http://www.cleantopia.com/kr/useInfo/discount.do">
                </a>

              </div>
            </div>
          </li>
          <li class="gnb5"><a href="/uselist">이용내역</a>
            <div class="subdepth show_menu" style="display: none; height: 200px; padding-top: 40px; margin-top: 0px; padding-bottom: 0px; margin-bottom: 0px;">
              <div class="tit-tx">
                <strong>이용정보</strong>
                이벤트 정보를 <br>소개합니다.
              </div>
              <div class="inner">
                <ul>
                  <li><a href="/kr/useInfo/discount.do">할인정보</a></li>
                  <li><a href="/kr/useInfo/membership.do">멤버쉽</a></li>
                  <li><a href="/kr/useInfo/eventList.do">세일 및 이벤트</a></li>

                </ul>
                <ul>
                  <li><a href="/kr/useInfo/cleanApp.do">크린앱</a></li>
                  <li><a href="/kr/useInfo/group.do">단체세탁</a></li>
                  <li><a href="/kr/useInfo/manless.do">무인세탁함</a></li>
                </ul>
              </div>
              <div class="gnb-brn">

                <a href="http://www.cleantopia.com/kr/useInfo/discount.do">
                </a>

              </div>
            </div>
          </li>
          <li class="gnb6"><a href="/mypage">마이페이지</a>
            <div class="subdepth show_menu" style="display: none; height: 200px; padding-top: 40px; margin-top: 0px; padding-bottom: 0px; margin-bottom: 0px;">
              <div class="tit-tx">
                <strong>회사소개</strong>
                크린토피아는 고객만족을<br>위해 항상 노력합니다.
              </div>
              <div class="inner">
                <ul>
                  <li><a href="/kr/company/intro.do">CEO인사말</a></li>
                  <li><a href="/kr/company/history.do">회사개요 및 연혁</a></li>
                  <li><a href="/kr/company/clean01.do">크린토피아 세탁</a></li>
                  <li><a href="/kr/company/cfList.do">홍보센터</a></li>
                </ul>
                <ul>
                  <li><a href="/kr/company/reportList.do">보도자료</a></li>
                  <li><a href="/kr/company/society.do">사회공헌</a></li>
                  <li><a href="/kr/company/recruit.do">인재채용</a></li>
                  <li><a href="/kr/company/location.do">찾아오시는길</a></li>
                </ul>
              </div>
              <div class="gnb-brn">

                <a href="http://www.cleantopia.com/kr/company/intro.do">
                  <!--<img src="/_tempupdata/2018/01/10/20180110102204925754.jpg" alt="2011년 ~ 2014년:4년 연속 대한민국 명품 브랜드 대상">-->
                </a>

              </div>
            </div>
          </li>
        </ul><!-- /gnb -->

      </div>
      <!-- End Header main -->
    </div>
  </header>
</template>

<script>

export default {
  name: 'Header',
  setup(){
  }
}

</script>
<style>
  @import '../style/common-styles.css';

</style>