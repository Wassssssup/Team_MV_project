<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<meta name="viewport" content="initial-scale=1, maximum-scale=1" />
<link
	href="resources/style.css"
	rel="stylesheet" />
<title>메인 페이지</title>
</head>
<body>
	<div>
		<h1><img src="resources/logo.jpg" width="160px" height="74px">Movie chart</h1>
	</div>
	<input type="button" id="insert" value="저장">
	<div id="container"></div>
	
	<div id="review">
		<span>review</span>
		<div class="inreview"></div>
		
	<div class="inreview2">
			<input type="hidden" id="mrank"> <input type="text"
				id="username" class="txtreview" maxlength="3"> <input
				type="password" id="userpw" class="txtreview"> <input
				type="text" id="content" class="txtreview">
			<button class="btnreview" onClick="funInsert()">등록</button>
		</div>
	</div>
	
	<div class="right_btn" style="margin-top: 0;">
		<table id="reservation"></table>
	</div>
	
	<div class="right_box">
		<h2>영화검색</h2>
		검색어: <input type="text" id="keyword" value=""> <input
			type="button" value="검색" id="btnsearch">
		<table id="tbl" border=1 width=350></table>
		<!-- <script id="temp2" type="text/x-handlebars-template"> -->
	<div class="ri_btn">
			<button id="btnprev">이전</button>
			<button id="btnnext">다음</button>
		</div>
	</div>
	
</body>
</html>