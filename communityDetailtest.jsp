<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Exponent by Pixelarity
	pixelarity.com | hello@pixelarity.com
	License: pixelarity.com/license
-->
<html>
	<head>
		<title>커뮤니티상세보기</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<style>
		img#img{
			width:160px;
			height:70px;
		}
		
		select#select {
			width:120px;;		
		}
		
		div#a{
			display:flex;
			margin: 0 auto;
			justify-content: center;
		}
		div#b{
			position:relative;
			display:inline-block;
			padding:3px;
			
		
		}
		div#c{
			position:relative;
			display:inline-block;
			padding:3px;
			
		}
		
		div#d{
			position:relative;
			display:inline-block;
			padding:3px;
			
		}
		
		input#name{
		 	width:100%;
		}
		
		input#btn{
			display: inline-block;
			height:50px;
		}
		table, tr, td{
			text-align:center;
		}
		
		div#reply{
			background-color: f6f6f6;
		}
		
		div#rep{
			border-bottom:1px solid #e2eaec;
		}
		
		div#T{
		background-color: #f6f6f6;
		box-shadow: 3px 3px #f1efef;
		border-radius: 5px;
		}
		
		div#F{
		text-align:left;
		font-color:black;
		}
		
		div#replyBackground{
		background-color: #f6f6f6;
		box-shadow: 3px 3px #f1efef;
		border-radius: 5px;
		
		}

		</style>
		
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<h1><a href="index.html">Exponent</a></h1>
				<nav id="nav">
					<ul>
						<li><a href="#">Sign Up</a></li>
						<li><a href="#">Log In</a></li>
						<li class="special">
							<a href="#menu" class="icon solid fa-bars">Menu</a>
							<div id="menu">
								<ul>
									<li><a href="index.html">Home</a></li>
									<li>
										<span>Layouts</span>
										<ul>
											<li><a href="left-sidebar.html">Left Sidebar</a></li>
											<li><a href="right-sidebar.html">Right Sidebar</a></li>
											<li><a href="no-sidebar.html">No Sidebar</a></li>
											<li><a href="contact.html">Contact</a></li>
										</ul>
									</li>
									<li><a href="elements.html">Elements</a></li>
									<li><a href="#">Sign Up</a></li>
									<li><a href="#">Log In</a></li>
								</ul>
							</div>
						</li>
					</ul>
				</nav>
			</header>

		<!-- Main -->
			<div id="main" class="container medium">
				<header class="major">
					<img src="images/로고1.png"id="img"><br><br>
					
					<div id="">
						<div id="T">
							<h1 style="text-align:left;">제목 : 커뮤니티 공간</h1>
							<div style="text-align:right;">
								<span>구분 : 부모/ </span>
		                 	    <span>작성자 : 커뮤니티 / </span>
		                        <span>2022.03.04 / </span>
		                        <span>추천: 456건 /</span>
		                        <span>조회: 45446회 </span>
                    		</div>
							<span class=""><img src="images/pic01.jpg" alt=""  width="100%" height="100%"/></span>
							<div id="F">
								<p>마미랑 커뮤니티에서 또래의 아기를 키우는 부모님 또는 시터들과 소통해보세요.</p>
								<p>육아를 하면서 겪는 나만의 경험, 다양한 주제의 이야기들을 만나보세요..</p>
								<p>내 아이에게 딱 맞는 마미랑 !</p>
								<p>아이와 엄마가 행복해지는 마미랑 내 아이에게 딱 맞는 우우리 동네 베이비시터, 마미랑으로 만나보세요.</p>
							</div>
						</div>
					</div><br>
				
				<!-- 댓글 -->
				<div id="replyBackground">
					<section class="main accent2" >
	                	<header class="major" style="text-align:left;">
	                         <!-- 댓글 리스트 -->
		                         <div id="reply">
		                         	<div id="rep">
			                         	<span>커뮤니티 (2022.03.24)</span><br>
			                         	커뮤니티 활성화를 위한 여러분들의 협조를 부탁합니다.
		                         	</div><br>
		                         
		                         	<div id="rep">
		                         		<span>감시자 (2022.03.26)</span><br>
		                         		커뮤니티 활성화를 위한 여러분들의 협조를 부탁합니다. 
		                         	</div>
		                         </div>
	                        </header>
	                        
	                        <form method="post" action="#" class="combined" style="width:auto;">
	                        	여러분의 소중한 댓글을 작성해주세요.<br>
	                           <textarea name="content" id="content" placeholder="비속어를 사용하지 말아주세요." class="invert" rows="5" style="border-radius:0; resize:none;"></textarea>
	                           <input id="register" type="button" class="primary" value="등록"/>
	                        </form>
	                        <form action="#" id="replies" class="combined" style="flex-direction:column; margin:0; display:contents;">
	                        </form>
	                    </section>
                    </div>
				
				
					

			</div>

		<!-- Footer -->
			<footer id="footer">
				<div class="container">
					<div class="row">
						<section class="col-4 col-12-medium about">
							<h2>Augue eleifend<br />
							faucibus et cubilia.</h2>
							<p>Arcu porttitor ut massa adipiscing nascetur varius lorem ipsum ante ac vestibulum lacinia ante praesent. Iaculis porttitor turpis orci arcu et orci. Lobortis non commodo ante lorem ipsum porttitor turpis orci. Arcu porttitor massa lorem ipsum dolor amet consequat etiam.</p>
							<ul class="actions">
								<li><a href="#" class="button">Erat vestibulum</a></li>
							</ul>
						</section>
						<section class="col-4 col-6-medium col-12-small">
							<h3>Updates</h3>
							<ul class="updates">
								<li>
									<p><a href="#">Ante ac vestibulum lacinia praesent adipiscing nascetur consequat lorem ipsum dolore.</a></p>
									<span class="timestamp">Posted 2 hours ago</span>
								</li>
								<li>
									<p><a href="#">Mi eu gravida tortor. Commodo lacinia ut ante placerat. In lobortis ac accumsan tortor.</a></p>
									<span class="timestamp">Posted 4 hours ago</span>
								</li>
								<li>
									<p><a href="#">Erat faucibus lacinia orci vestibulum massa accumsan ac vitae turpis praesent non.</a></p>
									<span class="timestamp">Posted 8 hours ago</span>
								</li>
							</ul>
						</section>
						<section class="col-4 col-6-medium col-12-small">
							<h3>Get in touch</h3>
							<ul class="labeled-icons">
								<li>
									<h4 class="icon alt solid fa-home"><span class="label">Address</span></h4>
									<span>1234 Somewhere Road #80486<br />
									Nashville, TN 00000</span>
								</li>
								<li>
									<h4 class="icon alt solid fa-phone"><span class="label">Phone</span></h4>
									<span>(800) 555-0000 x12345</span>
								</li>
								<li>
									<h4 class="icon alt solid fa-envelope"><span class="label">Email</span></h4>
									<a href="#">hello@untitled.tld</a>
								</li>
								<li>
									<h4 class="icon alt brands fa-facebook-f"><span class="label">Facebook</span></h4>
									<a href="#">facebook.com/untitled-tld</a>
								</li>
								<li>
									<h4 class="icon alt brands fa-twitter"><span class="label">Twitter</span></h4>
									<a href="#">twitter.com/untitled-tld</a>
								</li>
							</ul>
						</section>
					</div>
				</div>
				<div class="copyright container">
					<p>&copy; Untitled. All rights reserved.</p>
					<ul class="menu">
						<li><a href="#">Terms of Use</a></li>
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="#">Contact Us</a></li>
					</ul>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>