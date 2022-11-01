<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <link rel = "stylesheet" type = "text/css" href="http://localhost/Team_MV_project/common/css/header.css">

      <div id="header">
        <div id="header-top">
          <div id="left"></div>
          <div id="title"><a href="http://localhost/Team_MV_project/views/movie.jsp">EZEN</a></div>
          <div id="login">
          
          <%
          	if(session.getAttribute("id")==null){
          		%>
          		
            <a href="http://localhost/Team_MV_project/views/login/login.jsp">로그인</a>
            
            <a href="http://localhost/Team_MV_project/views/login/join.jsp">회원가입</a>
          	<% }else{%>
          	<form method ="post" action="main.jsp">
            <a href="http://localhost/Team_MV_project/views/login/logout.jsp">로그아웃</a>
            </form>
            <a href="http://localhost/Team_MV_project/views/mypage/mypage_main.jsp">마이페이지</a>
          	<%
          		}      
          		%>
          </div>
        </div>
        
        <div id="header-bottom">
          <ul class="header-bottom-ul">
          <%
          		if(session.getAttribute("id") != null){
          	%>
            <li>
              <a href="http://localhost/Team_MV_project/views/reservation/reservation.jsp">예매</a>
            </li>
            <%} else{ %>
				<%  } %>
            <li>
              <a href="http://localhost/Team_MV_project/views/movie.jsp">영화정보</a>
            </li>
          </ul>
        </div>
      </div>