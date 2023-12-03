<template>
  <header>
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
    <div id="header" class="">
      <section>
        <div id="header-main">
          <a id="header-left" href="/" aria-label="로고" ><svg width="178" height="25" viewBox="0 0 178 25" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M175.306 8.423a2.575 2.575 0 0 0-.932-.765 2.522 2.522 0 0 0-1.17-.25c-.313 0-.621.076-.898.223a.766.766 0 0 0-.336.314.796.796 0 0 0-.101.454.674.674 0 0 0 .449.653c.367.162.749.287 1.14.374l1.476.344a5.534 5.534 0 0 1 1.477.604c.458.26.849.63 1.14 1.076a3.29 3.29 0 0 1 .443 1.813 3.434 3.434 0 0 1-.496 1.921c-.327.497-.762.91-1.27 1.208-.55.317-1.15.534-1.772.64a9.88 9.88 0 0 1-1.914.188 9.2 9.2 0 0 1-2.492-.356 4.652 4.652 0 0 1-2.132-1.275l2.203-2.508a3.56 3.56 0 0 0 1.128.98c.445.232.94.349 1.441.338.386.006.77-.057 1.134-.188a.657.657 0 0 0 .373-.248.689.689 0 0 0 .135-.435.766.766 0 0 0-.117-.422.742.742 0 0 0-.326-.284 4.939 4.939 0 0 0-1.14-.393l-1.477-.35a5.884 5.884 0 0 1-1.476-.557 2.922 2.922 0 0 1-1.22-1.188 3.017 3.017 0 0 1-.369-1.682 3.738 3.738 0 0 1 .425-1.812 3.8 3.8 0 0 1 1.116-1.263 4.678 4.678 0 0 1 1.583-.731 7.137 7.137 0 0 1 1.82-.236c.799 0 1.595.119 2.362.35a4.306 4.306 0 0 1 2.014 1.21l-2.221 2.253Zm-15.982-3.547h3.632V6.81h.053a4.546 4.546 0 0 1 1.377-1.674 3.481 3.481 0 0 1 2.014-.556h.626c.199.017.397.051.59.103v3.39a5.21 5.21 0 0 0-.768-.182 4.612 4.612 0 0 0-.785-.066 3.787 3.787 0 0 0-1.648.302 2.179 2.179 0 0 0-.933.828c-.225.39-.368.824-.419 1.274-.069.543-.103 1.09-.101 1.638v5.051h-3.632l-.006-12.042Zm-5.316 4.659a2.185 2.185 0 0 0-.131-.867 2.131 2.131 0 0 0-.46-.74 2.142 2.142 0 0 0-1.624-.671 2.639 2.639 0 0 0-1.854.707 2.339 2.339 0 0 0-.508.719 2.34 2.34 0 0 0-.201.852h4.778Zm3.077 5.305a5.888 5.888 0 0 1-2.203 1.758 6.488 6.488 0 0 1-2.758.604 7.15 7.15 0 0 1-2.558-.447 6.092 6.092 0 0 1-2.084-1.275 5.934 5.934 0 0 1-1.388-1.994 6.892 6.892 0 0 1-.508-2.601c0-.893.172-1.777.508-2.601a6.027 6.027 0 0 1 1.388-1.994 6.191 6.191 0 0 1 2.084-1.275 7.284 7.284 0 0 1 2.558-.447 5.704 5.704 0 0 1 2.286.447c.678.28 1.285.716 1.772 1.275a5.887 5.887 0 0 1 1.104 1.994c.265.841.394 1.72.384 2.604v1.196h-8.428c.111.66.443 1.26.939 1.698.5.413 1.129.627 1.772.604a2.688 2.688 0 0 0 1.512-.41c.424-.277.795-.631 1.092-1.046l2.528 1.91Zm-31.676-9.964h3.491v1.637h.047c.128-.254.291-.488.485-.694a3.51 3.51 0 0 1 .75-.605 4.176 4.176 0 0 1 2.203-.622 4.543 4.543 0 0 1 2.191.52c.649.362 1.157.94 1.441 1.637.341-.693.87-1.27 1.524-1.661a4.549 4.549 0 0 1 2.203-.496c.689-.02 1.374.12 2.002.411.515.25.957.633 1.282 1.112.326.505.557 1.069.679 1.661.141.671.21 1.356.207 2.043v7.1h-3.632v-7.01a2.83 2.83 0 0 0-.355-1.45 1.337 1.337 0 0 0-.54-.48 1.304 1.304 0 0 0-.706-.124 2.348 2.348 0 0 0-1.051.211 1.784 1.784 0 0 0-.68.605c-.176.26-.3.554-.366.864-.072.341-.107.69-.106 1.039v6.344h-3.632v-7.16a3.357 3.357 0 0 0-.172-.888 1.632 1.632 0 0 0-.472-.72 1.375 1.375 0 0 0-.957-.301 2.266 2.266 0 0 0-1.14.26 1.767 1.767 0 0 0-.662.694 3.023 3.023 0 0 0-.307.98c-.048.378-.072.76-.071 1.141v5.994h-3.632l-.024-12.042Zm-20.536 0h3.491v1.637h.047c.127-.254.29-.488.484-.694.222-.236.475-.44.75-.605a4.2 4.2 0 0 1 .993-.447 4.076 4.076 0 0 1 1.21-.175 4.53 4.53 0 0 1 2.192.52c.648.362 1.156.94 1.441 1.637a3.97 3.97 0 0 1 1.524-1.661 4.572 4.572 0 0 1 2.209-.496 4.43 4.43 0 0 1 1.996.411c.515.25.957.633 1.282 1.112a4.81 4.81 0 0 1 .679 1.661c.14.671.21 1.356.207 2.043v7.1h-3.633v-7.01a2.829 2.829 0 0 0-.354-1.45 1.33 1.33 0 0 0-.54-.481 1.296 1.296 0 0 0-.706-.123 2.371 2.371 0 0 0-1.052.211 1.789 1.789 0 0 0-.679.605c-.176.26-.301.554-.366.864-.072.341-.108.69-.106 1.039v6.344h-3.633v-7.16a3.09 3.09 0 0 0-.171-.888 1.643 1.643 0 0 0-.473-.72 1.37 1.37 0 0 0-.956-.301 2.224 2.224 0 0 0-1.134.26 1.732 1.732 0 0 0-.668.694c-.158.305-.26.637-.301.98a7.93 7.93 0 0 0-.077 1.141v5.994h-3.644l-.012-12.042Zm-5.977 6.767c-.278 0-.59 0-1.034.037-.4.024-.796.095-1.181.211-.355.103-.685.28-.969.52a1.234 1.234 0 0 0-.396.967c-.008.201.04.402.138.577.098.175.243.319.418.413.36.211.767.322 1.181.32a3.47 3.47 0 0 0 1.028-.15c.315-.09.614-.23.886-.418a2.044 2.044 0 0 0 .821-1.686v-.79h-.892Zm.892 3.764h-.048a3.411 3.411 0 0 1-1.612 1.384 5.488 5.488 0 0 1-3.703.188 3.928 3.928 0 0 1-1.341-.707 3.37 3.37 0 0 1-.922-1.16 3.59 3.59 0 0 1-.342-1.614 3.782 3.782 0 0 1 .378-1.758c.242-.478.59-.892 1.016-1.209a5.074 5.074 0 0 1 1.465-.73 10.48 10.48 0 0 1 1.707-.381 15.948 15.948 0 0 1 1.772-.151h1.636a1.965 1.965 0 0 0-.165-.87c-.12-.272-.3-.512-.526-.701a2.465 2.465 0 0 0-1.63-.604 3.519 3.519 0 0 0-1.637.386c-.501.262-.95.62-1.323 1.052l-1.937-2.03a6.6 6.6 0 0 1 2.363-1.45 8.368 8.368 0 0 1 2.811-.484 7.211 7.211 0 0 1 2.628.41 3.76 3.76 0 0 1 1.642 1.21c.435.568.73 1.235.863 1.945.17.875.251 1.766.242 2.658v6.127h-3.343l.006-1.51ZM83.09 4.878h3.633V6.81h.047a4.61 4.61 0 0 1 1.382-1.674c.6-.387 1.3-.58 2.008-.556h.632c.2.016.397.05.59.103v3.39a4.98 4.98 0 0 0-.761-.182 4.702 4.702 0 0 0-.786-.066 3.751 3.751 0 0 0-1.647.302 2.177 2.177 0 0 0-.934.828 3.11 3.11 0 0 0-.419 1.274c-.069.543-.103 1.09-.1 1.638v5.051H83.09V4.876Zm-11.529 5.945a2.96 2.96 0 0 0 .216 1.122c.144.356.356.679.623.95.266.272.578.493.921.652.36.17.75.255 1.146.248a2.6 2.6 0 0 0 1.14-.248c.347-.157.664-.378.933-.652.267-.271.478-.594.623-.949a2.976 2.976 0 0 0-.623-3.19 3.247 3.247 0 0 0-.933-.658 2.688 2.688 0 0 0-1.14-.248 2.66 2.66 0 0 0-1.146.248 3.273 3.273 0 0 0-.921.658c-.267.27-.478.593-.622.947a2.958 2.958 0 0 0-.217 1.12Zm9.155 5.081c0 2.28-.561 4.01-1.683 5.19-1.123 1.18-2.83 1.77-5.121 1.77-1.044 0-2.084-.12-3.101-.356a6.965 6.965 0 0 1-2.806-1.402l2.009-3.075a7.418 7.418 0 0 0 1.772 1.142 4.889 4.889 0 0 0 2.05.423c.442.038.889-.016 1.311-.16a3.266 3.266 0 0 0 1.145-.674 2.91 2.91 0 0 0 .603-.976c.135-.363.197-.75.183-1.139V15.48h-.048a3.394 3.394 0 0 1-1.559 1.209 4.895 4.895 0 0 1-1.772.362 5.988 5.988 0 0 1-2.362-.46 5.315 5.315 0 0 1-1.831-1.286 5.897 5.897 0 0 1-1.181-1.97 7.4 7.4 0 0 1-.414-2.501c.002-.794.13-1.581.378-2.333a6.47 6.47 0 0 1 1.063-2.006 5.383 5.383 0 0 1 1.683-1.401 4.76 4.76 0 0 1 2.257-.532 5.372 5.372 0 0 1 2.563.622c.316.163.61.366.874.604.223.194.421.415.59.659h.048v-1.59h3.36l-.011 11.046Zm-23.39-5.027a3.168 3.168 0 0 0 .763 2.205c.587.541 1.35.84 2.14.84.791 0 1.554-.299 2.142-.84a3.536 3.536 0 0 0 .768-2.205c0-.804-.271-1.583-.768-2.205a3.144 3.144 0 0 0-2.141-.847c-.792 0-1.555.302-2.141.847a3.156 3.156 0 0 0-.762 2.205Zm-3.632 0a6.39 6.39 0 0 1 .508-2.604 6.041 6.041 0 0 1 1.388-1.994 6.199 6.199 0 0 1 2.085-1.275 7.516 7.516 0 0 1 5.11 0c.77.28 1.478.714 2.084 1.275a6.076 6.076 0 0 1 1.394 1.994 6.908 6.908 0 0 1 0 5.202 5.948 5.948 0 0 1-3.479 3.269 7.516 7.516 0 0 1-5.109 0 6.103 6.103 0 0 1-2.085-1.275 5.939 5.939 0 0 1-1.388-1.994 6.359 6.359 0 0 1-.508-2.598Zm-8.452-6.042h3.633v1.933h.047c.32-.665.794-1.24 1.382-1.673.599-.39 1.3-.584 2.008-.556h.626c.2.016.398.05.591.102v3.39a5.326 5.326 0 0 0-1.553-.248 3.74 3.74 0 0 0-1.642.302c-.385.176-.71.464-.934.828-.23.389-.374.824-.425 1.275-.067.543-.098 1.09-.094 1.638v5.093h-3.633l-.006-12.084Zm-11.044 6.042a3.168 3.168 0 0 0 .761 2.205c.59.542 1.353.841 2.144.841.792 0 1.556-.3 2.144-.84a3.56 3.56 0 0 0 .762-2.206 3.56 3.56 0 0 0-.762-2.205 3.155 3.155 0 0 0-2.144-.846c-.792 0-1.556.302-2.144.846a3.155 3.155 0 0 0-.762 2.205Zm-3.343-6.042h3.342v1.589h.048c.172-.241.37-.462.59-.659.25-.234.525-.437.821-.604.326-.188.67-.338 1.028-.447a4.007 4.007 0 0 1 1.181-.175 5.895 5.895 0 0 1 2.363.459c.69.294 1.31.733 1.825 1.287a5.655 5.655 0 0 1 1.181 1.97c.284.801.424 1.649.414 2.501a7.635 7.635 0 0 1-.378 2.417 6.605 6.605 0 0 1-1.064 2.042 5.219 5.219 0 0 1-1.683 1.426 4.639 4.639 0 0 1-2.25.532 6.207 6.207 0 0 1-2.12-.357 3.431 3.431 0 0 1-1.613-1.208h-.047v6.936H30.86l-.005-17.71Z" fill="#1E2A3C"></path><path d="M20.672 0H2.953C1.323 0 0 1.353 0 3.021v18.127c0 1.668 1.322 3.02 2.953 3.02h17.72c1.63 0 2.952-1.352 2.952-3.02V3.02C23.625 1.353 22.303 0 20.672 0Z" fill="#1E2A3C"></path><path fill-rule="evenodd" clip-rule="evenodd" d="M14.576 8.658c-.502.067-2.474-1.208-6.243-3.257-3.283-1.812-2.392.762-2.096 1.463.03.102.03.211 0 .314-.124.501-.201 2.417 3.626 6.574a.4.4 0 0 1 .1.526l-.047.066c-.49.864 5.05-6.006 4.66-5.686Z" fill="#8699B7"></path><path fill-rule="evenodd" clip-rule="evenodd" d="M14.577 8.659c-.485-.109-.632-.218-2.363-4.23-1.27-3.02-2.498-.157-2.469.605a.48.48 0 0 1-.082.296c-.29.429-1.772 2.785.342 8.078.088.289.071.6-.047.876l-.047.067c-.485.858 5.055-6.012 4.666-5.692Z" fill="#54718A"></path><path fill-rule="evenodd" clip-rule="evenodd" d="M14.576 8.658c-.454.06-2.12-.967-5.227-2.695-.454 1.057-.95 3.383.685 7.438.091.286.074.596-.047.87l-.041.072c-.532.858 5.014-6.006 4.63-5.685Z" fill="#9FBED1"></path><path fill-rule="evenodd" clip-rule="evenodd" d="M18.895 8.055c-.538-.049-.969-.973-1.902-.973-.933 0-2.026 1.257-2.41 1.577-.59.357-3.544.38-7.962.7-3.904.279-2.445 1.354-1.996 1.632a.148.148 0 0 1 .083.163c-.036.327.484 1.77 5.073 2.732.431.09.166.459.166.459-.52.864-2.268 3.873-2.824 6.531-.118.538.402-.797 2.546-2.658 2.144-1.861 4.288-1.535 6.196-4.085 1.908-2.55.974-4.32 3.03-4.87l4.725-1.208s-4.672.006-4.725 0Z" fill="#FAFAFA"></path></svg></a>
          <div id="header-right">
            <ul class="menus">
              <li class="menu"><a href="/manual"><span>서비스소개</span></a>
              </li>
              <li class="menu"><a href="/howuse"><span>이용방법</span></a>
              </li>
              <li class="menu"><a href="/price"><span>가격정보</span></a>
              </li>
              <li class="menu"><a href="/order"><span>세탁신청</span></a>
                <div class="header-in" style="height: auto; border-bottom: 1px solid rgb(220, 225, 230)">
                  <div>
                    <nav>
                      <ul>
                        <li class="tit-tx"><strong>블랙라벨</strong>세탁 서비스<br>알아보아요</li>
                        <li>
                          <ul>
                            <li><a><div><span class="">채용 프로그램</span></div></a></li>
                          </ul>
                        </li>
                        <li style="border: none">
                          <ul>
                            <li><a><div><span class="">채용 프로그램</span></div></a></li>
                          </ul>
                        </li>
                      </ul>
                    </nav>
                  </div>
                </div>
              </li>
              <li class="menu"><a href="/uselist"><span>이용내역</span></a>
                <div class="header-in" style="height: auto; border-bottom: 1px solid rgb(220, 225, 230)">
                  <div>
                    <nav>
                      <ul>
                        <li class="tit-tx"><strong>블랙라벨</strong>세탁 서비스<br>알아보아요</li>
                        <li>
                          <ul>
                            <li><a><div><span class="">채용 프로그램</span></div></a></li>
                          </ul>
                        </li>
                        <li style="border: none">
                          <ul>
                            <li><a><div><span class="">채용 프로그램</span></div></a></li>
                          </ul>
                        </li>
                      </ul>
                    </nav>
                  </div>
                </div>
              </li>
            </ul>
            <div class="mypage">
            <!--alter-->
              <button v-on:click="alertFunc" id="alter" type="button" aria-label="알림 팝업">
                <div>
                  <i class="fa fa-bell" aria-hidden="true"></i>
                  <div class="counter"><span>6</span></div>
                </div>
              </button>
              <div id="profile-in" style="display: none">
                <div class="container">
                  <article class="container-in">
                    <header><section><h1 class="">알림</h1></section>
                      <button v-on:click="alertFunc"><svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12 19 6.41Z" fill="#000"></path></svg></button>
                    </header>
                    <section>새로운 알림이 없습니다.</section>
                    <a href="/">전체 알림 보기</a>
                  </article>
                </div>
                <!--            <header class=""><section><h1 class="">알림</h1><button class="">모두 읽기</button></section><button class="NotificationPopupstyle__CloseButton-sc-jzfvpw-4 hAmBPX"><svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12 19 6.41Z" fill="#000"></path></svg></button></header><section class="NotificationPopupstyle__Section-sc-jzfvpw-5 NotificationPopupstyle__ContentSection-sc-jzfvpw-6 jfgcxF geKENK"><div class="NotificationPopupstyle__Scrollable-sc-jzfvpw-7 fBvoIb"><div class="NotificationPopupstyle__NotificationCard-sc-jzfvpw-8 gLxreM"><a href="https://programmers.co.kr/notifications/1040937" class="NotificationPopupstyle__NotificationLink-sc-jzfvpw-9 dapIPl"><div><span></span><h2>과제테스트 알림</h2></div><div><p>과제관 - 영화 좌석 예매 페이지 구축의 답안이 제출되지 않았습니다</p><time datetime="2023-08-30T21:20:03.708+09:00">23년 08월 30일 21:20</time></div></a></div><div class="NotificationPopupstyle__NotificationCard-sc-jzfvpw-8 gLxreM"><a href="https://programmers.co.kr/notifications/1040936" class="NotificationPopupstyle__NotificationLink-sc-jzfvpw-9 dapIPl"><div><span></span><h2>과제테스트 알림</h2></div><div><p>과제관 - 쇼핑몰 SPA의 답안 제출을 확인했습니다</p><time datetime="2023-08-30T21:17:05.821+09:00">23년 08월 30일 21:17</time></div></a></div><div class="NotificationPopupstyle__NotificationCard-sc-jzfvpw-8 gLxreM"><a href="https://programmers.co.kr/notifications/1040869" class="NotificationPopupstyle__NotificationLink-sc-jzfvpw-9 dapIPl"><div><span></span><h2>과제테스트 알림</h2></div><div><p>과제관 - 영화 좌석 예매 페이지 구축 테스트에 응시 하셨습니다</p><time datetime="2023-08-30T18:19:50.918+09:00">23년 08월 30일 18:19</time></div></a></div><div class="NotificationPopupstyle__NotificationCard-sc-jzfvpw-8 gLxreM"><a href="https://programmers.co.kr/notifications/1040865" class="NotificationPopupstyle__NotificationLink-sc-jzfvpw-9 dapIPl"><div><span></span><h2>과제테스트 알림</h2></div><div><p>과제관 - 쇼핑몰 SPA 테스트에 응시 하셨습니다</p><time datetime="2023-08-30T18:16:13.463+09:00">23년 08월 30일 18:16</time></div></a></div><div class="NotificationPopupstyle__NotificationCard-sc-jzfvpw-8 gLxreM"><a href="https://programmers.co.kr/notifications/1004541" class="NotificationPopupstyle__NotificationLink-sc-jzfvpw-9 dapIPl"><div><span></span><h2>과제테스트 알림</h2></div><div><p>과제관 - 프로그래밍 언어 검색의 답안 제출을 확인했습니다</p><time datetime="2023-07-14T19:22:57.498+09:00">23년 07월 14일 19:22</time></div></a></div></div></section><a href="https://programmers.co.kr/notifications" class="">전체 알림 보기</a></article></div>-->
              </div>
              <!--Profile-->
              <button type="button" aria-label="프로필 팝업" class="profile" onclick="location.href='/mypage'">
                <img src="https://res.cloudinary.com/eightcruz/image/upload/c_lfill,h_120,w_120/default_profile_img1_n2v2nx" alt="프로필 이미지">
              </button>
            </div>
            <button v-on:click="sideMenuFunc"><svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M3 18h18v-2H3v2Zm0-5h18v-2H3v2Zm0-7v2h18V6H3Z" fill="#000"></path></svg></button>
          </div>
        </div>
      </section>
    </div>
  </header>
  <!--End Header Section-->
  <div id="sideMenu" style="display: none" class="m_menu">
    <div class="inner">
      <ul class="right_menu">
        <li class="gnb8"><a href="#">블랙라벨</a>
          <ul class="mdepth2" style="display: none;">
            <li><a href="/kr/blacklabel/blackLabel.do">블랙라벨 소개</a></li>
            <li><a href="/kr/blacklabel/blackClothes.do">명품 의류</a></li>
            <li><a href="/kr/blacklabel/blackFootwear.do">명품 신발</a></li>
            <li><a href="/kr/blacklabel/blackBag.do">명품 가방</a></li>
            <li><a href="/kr/blacklabel/blackLeather.do">가죽 모피</a></li>
          </ul>
        </li>
        <li class="gnb1"><a href="#">세탁서비스</a>
          <ul class="mdepth2" style="display: none;">
            <li><a href="/kr/laundry/clothes.do">일반의류</a></li>
            <li><a href="/kr/laundry/shirt.do">와이셔츠</a></li>
            <li><a href="/kr/laundry/blanket.do">이불</a></li>
            <li><a href="/kr/laundry/sneakers.do">운동화</a></li>
            <li><a href="/kr/laundry/outdoor.do">아웃도어</a></li>
            <li><a href="/kr/laundry/school.do">교복</a></li>
            <li><a href="/kr/laundry/cap.do">모자/인형/가방</a></li>
            <li><a href="/kr/laundry/special.do">특수크리닝</a></li>
            <li><a href="/kr/laundry/royal.do">로얄크리닝</a></li>
            <li><a href="/kr/laundry/today.do">당일세탁서비스</a></li>
            <li><a href="/kr/laundry/clothing_storage.do">의류보관서비스</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>

export default {
  name: 'Header',
  methods: {
    alertFunc: function () {
      let alter_box = document.getElementById('profile-in');
      if (alter_box.style.display === 'none') {
        alter_box.style.display = 'block';
      } else {
        alter_box.style.display = 'none';
      }
    },
    sideMenuFunc: function (){
      let s_menu = document.getElementById('sideMenu');
      if (s_menu.style.display === 'none') {
        s_menu.style.display = 'block';
      } else {
        s_menu.style.display = 'none';
      }
    }
  }
}

</script>
<style>
  button {
    border: 0;
    background: none;
    cursor: pointer;
  }

  a {
    text-decoration: none;
  }

  ul,li {
    list-style: none;
    margin: 0;
    padding: 0;
  }

  #header {
    position: relative;
    background-color: rgb(255, 255, 255);
  }

  .header-top {
    position: relative;
    display: flex;
    align-items: center;
    justify-content: end;
    padding-right: 20px;
    z-index: 5;
  }

  .header-top>ul {
    display: inline-block;
  }

  .header-top>ul>li {
    position: relative;
    display: inline-block;
    list-style:none;
  }

  .header-top>ul>li>a {
    position: relative;
    display: block;
    color: #959595;
    font-size: 12px;
    padding: 0 10px;
    line-height: 26px;
    text-decoration: none;
  }

  .header-top>ul>li>a:hover {
    text-decoration: underline;
  }

  .header-top>ul>li>a:after {
    content: "";
    position: absolute;
    display: block;
    background-color: #eaeaea;
    width: 1px;
    height: 12px;
    top: 50%;
    right: 0;
    margin-top: -6px;
  }

  .header-top>ul>li>ul>li {
    list-style:none;
  }

  .header-top>ul>li>ul>li>a {
    text-decoration: none;
  }

  .header-top .lang li a {
    font-size: 11px;
    line-height: 1;
  }

  .header-top .lang li a.on {
    color: #2471c8;
    font-weight: 700;
  }

  .header-top .lang li a:after {
    content: "";
    position: absolute;
    display: block;
    background-color: #eaeaea;
    width: 1px;
    height: 10px;
    top: 50%;
    right: 0;
    margin-top: -5px;
  }

  .header-top>ul>li:last-child a:after {
    display: none;
  }

  .header-top>ul>li:hover>ul {
    display: block;
  }

  .header-top>ul>li>ul {
    display: none;
    position: absolute;
    top: 24px;
    left: 50%;
    margin: 0 0 0 -70px;
    border: #e5e5e5 1px solid;
    border-radius: 3px;
    width: 140px;
    background-color: #fff;
    padding: 0;
  }

  .header-top>ul>li>ul:before {
    content: "";
    width: 12px;
    height: 6px;
    display: block;
    position: absolute;
    top: 0;
    left: 50%;
    margin: -6px 0 0 -6px;
  }

  .header-top>ul>li>ul li a {
    display: block;
    padding: 10px 0;
    text-align: center;
    font-size: 14px;
    color: #666;
    border-bottom: #e5e5e5 1px solid;
  }

  .header-top>ul>li>ul li a:hover {
    color: #2471c8;
  }

  #header>section {
    display: flex;
    -webkit-box-pack: center;
    justify-content: center;
    border-bottom: 1px solid rgb(220, 225, 230);
  }

  #header-main {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: justify;
    justify-content: space-between;
    width: 100%;
    max-width: 1300px;
    height: 64px;
    padding: 0px 20px;
  }

  #header-main .mypage {
    gap: 8px;
    position: relative;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
  }

  #header-left {
    margin-right: 60px;
    line-height: 0;
  }

  #header-right {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: justify;
    justify-content: space-between;
    width: 100%;
    flex: 1 0 0px;
  }

  #header-right>ul {
    display: flex;
  }

  #header-right>ul>li{
    padding: 20px;
    border-bottom: 0px;
    height: 64px;
    font-size: 16px;
    font-weight: 500;
    line-height: 150%;
    transition-property: border-bottom, color, font-weight;
    transition-duration: 0.2s;
    transition-timing-function: ease-out;
    color: rgb(15, 19, 23);
  }

  // Header
  .menu>a {
    display: inline-block;
    padding: 0 23px;
  }

  .menu>a>span {
    position: relative;
    display: block;
    font-size: 18px;
    font-weight: bold;
    color: #000;
    padding: 0;
    height: 44px;
    text-decoration: none;
  }

  .menu>a>span:hover {
    color: #2471c8;
  }

  .menu>a>span:after {
    content: "";
    position: absolute;
    display: block;
    width: 100%;
    height: 3px;
    background-color: #2471c8;
    bottom: 0;
    left: 0;
    opacity: 0;
    -webkit-transition: all 0.2s ease-in-out;
    -moz-transition: all 0.2s ease-in-out;
    -ms-transition: all 0.2s ease-in-out;
    -o-transition: all 0.2s ease-in-out;
    transition: all 0.2s ease-in-out;
  }

  .menu>a>span:hover:after {
    content: "";
    display: block;
    opacity: 1;
  }

  #alter {
    position: relative;
    display: inline-flex;
    -webkit-box-pack: center;
    justify-content: center;
    -webkit-box-align: center;
    align-items: center;
    padding: 8px;
    background: none;
    border: none;
  }

  #alter .counter {
    position: absolute;
    display: flex;
    -webkit-box-pack: center;
    justify-content: center;
    -webkit-box-align: center;
    align-items: center;
    top: 2px;
    right: 2px;
    height: 16px;
    padding: 3px 4px;
    border-radius: 16px;
    background-color: rgb(240, 61, 12);
  }

  #alter .counter>span {
    color: rgb(255, 255, 255);
    font-size: 10px;
    font-weight: 700;
    line-height: 10px;
    text-align: center;
    min-width: 8px;
  }

  #header-right .profile {
    display: inline-flex;
    -webkit-box-pack: center;
    justify-content: center;
    -webkit-box-align: center;
    align-items: center;
  }

  #header-right .profile>img {
    border-radius: 50%;
    width: 32px;
    height: 32px;
  }


  #header-right .menus>li:nth-child(4):hover .header-in{
    display: block;
  }

  #header-right .menus>li:nth-child(5):hover .header-in{
    display: block;
  }

  #profile-in {
    position: absolute;
    top: calc(100% + 8px);
    right: 0px;
    z-index: 15;
    width: 320px;
    animation: 0.2s ease-out 0s 1 normal forwards running open;
  }

  #profile-in .container {
    display: block;
    width: 100%;
    height: 100%;
  }

  #profile-in .container-in{
    position: relative;
    display: flex;
    flex-direction: column;
    padding-top: 20px;
    border-radius: 8px;
    overflow: hidden;
    background-color: rgb(255, 255, 255);
    box-shadow: rgba(0, 0, 0, 0.1) 0px 8px 40px 0px;
  }

  #profile-in .container-in>header {
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
    -webkit-box-align: center;
    align-items: center;
    padding: 0px 20px 8px;
  }

  #profile-in .container-in>header>section {
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
    -webkit-box-align: center;
    align-items: center;
    width: 100%;
  }

  #profile-in .container-in>header>section>h1 {
    color: rgb(15, 19, 23);
    font-size: 16px;
    font-style: normal;
    font-weight: 700;
    line-height: 150%;
  }

  #profile-in .container-in>header>button {
    padding: 8px;
    line-height: 0;
  }

  #profile-in .container-in>header>button @media (min-width: 992px) {
    display: none;
  }

  #profile-in .container-in>section {
    display: flex;
    -webkit-box-pack: center;
    -webkit-box-align: center;
    justify-content: center;
    align-items: center;
    height: 264px;

  }

  #profile-in a {
    display: flex;
    -webkit-box-pack: center;
    justify-content: center;
    -webkit-box-align: center;
    align-items: center;
    width: 100%;
    height: 48px;
    color: rgb(0, 120, 255);
    font-size: 14px;
    font-style: normal;
    font-weight: 500;
    line-height: normal;
    letter-spacing: -0.14px;
    transition: color 0.2s ease-out 0s;
  }

  .header-in {
    position: absolute;
    top: 100%;
    width: 100%;
    background-color: rgb(255, 255, 255);
    overflow: hidden;
    transition: height 0.3s ease-out 0s;
    z-index: 20;
    left: 0px;
    display: none;
  }

  .header-in>div>nav {
    display: flex;
    -webkit-box-pack: center;
    justify-content: center;
    padding: 24px 0px 24px;
  }

  .header-in>div>nav>ul {
    list-style: none;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    width: 100%;
    max-width: 1250px;
    padding-left: 24px;
  }

  .header-in>div>nav>ul>li {
    list-style: none;
    letter-spacing: -0.009em;
    line-height: 1.6;
    border-right: 1px solid #eaeaeb;
  }

  .header-in>div>nav>ul>li>ul {
    list-style: none;
  }

  .header-in>div>nav>ul>li>ul>li {
    list-style: none;
  }

  .header-in>div>nav>ul>li>ul>li>a {
    display: inline-flex;
    -webkit-box-align: center;
    align-items: center;
    gap: 2px;
    padding: 8px 16px 7px;
    min-width: 60%;
    font-size: 16px;
    font-weight: 700;
    cursor: pointer;
    text-decoration: none;
  }

  .header-in>div>nav>ul>li>ul>li>a>div {
    display: inline-flex;
    -webkit-box-align: center;
    align-items: center;
    gap: 8px;
  }

  .header-in>div>nav>ul>li>ul>li>a>div>span {
    line-height: 150%;
    color: rgb(15, 19, 23);
    transition: color 0.2s ease-out 0s;
  }

  .tit-tx {
    position: relative;
    float: left;
    color: #959595;
  }

  .tit-tx>strong {
    font-size: 24px;
    color: #2471c8;
    line-height: 1;
    display: block;
    margin: 0 0 15px 0;
  }

  @media (max-width: 950px) {
    #header-right {
      width: unset;
      flex: unset;
      margin-right: 8px;
      gap: 4px;
    }

    #header-right>ul {
      display: none;
    }

    .header-top {
      display: none;
    }

  }

  @media (min-width: 950px) {
    #header-right>button {
      display: none;
    }
  }

  @media (max-width: 950px) {
    .m_menu {
      position: fixed;
      top: 65px;
      width: 100%;
      height: 100%;
      z-index: 5;
      background-color: #fff;
    }

    .m_menu .inner {
      position: relative;
      background-color: #fff;
      padding: 0;
      overflow-y: auto;
    }

    .m_menu .right_menu {
      margin: 0;
      padding-left: 0px;
    }

    .m_menu .right_menu > li {
      overflow: hidden;
      border-top: #f6f7fa 1px solid;
    }

    .m_menu .right_menu > li > a {
      position: relative;
      display: block;
      line-height: 41px;
      padding: 0 40px 0 20px;
      background-color: #fff;
      font-size: 13px;
      color: #333;
      margin-top: -1px;
    }

    .m_menu .right_menu > li > ul {
      background-color: #f6f7fa;
      margin: 0 -1px -1px 0;
      overflow: hidden;
    }

    .m_menu .right_menu > li > ul > li {
      float: left;
      width: 50%;
      border-bottom: #eaeaea 1px solid;
      border-right: #eaeaea 1px solid;
    }

    .m_menu .right_menu > li > ul > li > a {
      position: relative;
      padding: 0 40px 0 20px;
      display: block;
      font-size: 11px;
      color: #757575;
      line-height: 33px;
    }
  }

  @media (min-width: 1300px) {
    .header-top {
      right: 50%;
      height: 24px;
      line-height: 24px;
      margin-right: -660px;
      z-index: 5;
    }
  }


</style>