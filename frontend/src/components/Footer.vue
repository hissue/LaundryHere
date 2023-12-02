<template>
  <footer>
    <div id="footer" class="">
      <div class="copyright">
        <div class="container">
          <div class="row">
            <div class="col-md-6">
              <span>Copyright © 2023, All Right Reserved SueLaundry</span>
            </div>
            <!-- End Col -->
            <div class="col-md-6">
              <div class="copyright-menu">
                <ul>
                  <li>
                    <a href="#">
                      <i class="fa fa-facebook"></i>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-twitter"></i>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-google-plus"></i>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-linkedin"></i>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-instagram"></i>
                    </a>
                  </li>
                </ul>
              </div>
            </div>
            <!-- End col -->
          </div>
          <!-- End Row -->
        </div>
      </div>
      <!-- End Copyright -->
      <div id="back-to-top" class="back-to-top">
        <button class="btn btn-dark" title="Back to Top" style="display: block;">
          <i class="fa fa-angle-up"></i>
        </button>
      </div>
      <!-- End Back to top -->
    </div>
    <!-- End Footer -->
  </footer>
</template>

<script>
export default {
  name: 'Footer'
}
</script>

<style>
.copyright {
  padding: 28px 0;
  margin-top: 55px;
  background-color: rgb(248,249,250);
}
.copyright span, .copyright a {
  color: #878787;
  -webkit-transition: all 0.3s linear;
  -o-transition: all 0.3s linear;
  transition: all 0.3s linear;
}
.copyright a:hover {
  color: #2471c8;
}
.copyright-menu ul {
  text-align: right;
  margin: 0;
}
.copyright-menu li {
  display: inline-block;
  padding-left: 20px;
}
.back-to-top {
  position: relative;
  z-index: 2;
}
.back-to-top .btn-dark {
  width: 35px;
  height: 35px;
  border-radius: 50%;
  padding: 0;
  position: fixed;
  bottom: 20px;
  right: 20px;
  background: #2e84fa;
  border-color: #2e84fa;
  display: none;
  z-index: 999;
  -webkit-transition: all 0.3s linear;
  -o-transition: all 0.3s linear;
  transition: all 0.3s linear;
}
.back-to-top .btn-dark:hover {
  cursor: pointer;
  background: #2471c8;
  border-color: #2471c8;
}
</style>