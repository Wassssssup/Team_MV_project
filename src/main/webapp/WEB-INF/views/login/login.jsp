<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
     
 <style type="text/css">
body{font-family: "Noto Sans KR", sans-serif;}
h1{text-align: center}
#main {     /* margin: auto 0; */  background-color : #FFFFFF ;    padding-right : 150px;  width : 1200px;       margin : 0px auto      }
#login_table{ height: 180px; ;margin: 0px auto ; }
#login_button{   height: 100px; width: 100px; margin-left: 30px ;   }
input{height : 35px; }
</style>

<script type="text/javascript">
$(function(){
	$("#id").keydown(function(evt){ 
		if(evt.which == 13){
			chkNull();
		}//end if
	});	
	$("#pass").keydown(function(evt){ 
		if(evt.which == 13){
			chkNull();
		}//end if
	});	
	$("#login_button").click(function(){ 
		chkNull();
	});	
});
function chkNull(){
	if( $("#id").val() ==""){
		alert("아이디는 필수 입력");
		$("#id").focus();
		return;
	}//end if
	if( $("#pass").val() ==""){
		alert("비밀번호는 필수 입력");
		$("#pass").focus();
		return;
	}//end if
	$("#loginFrm").submit();
}//chkNull
</script>
</head>
<body>
   <div id="wrap">
   <%@ include file="../header.jsp" %>
   <form method="post" id="loginFrm"  action ="login_process">
		<div id ="main">
			<div  style ="background-color : #E4E4E4 ; width : 100%;  ;height : 300px; padding : 80px;  ">
			<h1 >회원 로그인</h1>
			<br/>
            <table id ="login_table">
               <tr>
                  <td style="height : 60px; width : 100px; font-size: 20px; ">아이디</td>
                  <td><input  type ="text"  id=id name="id" value ="" placeholder="아이디 입력"/></td>
                  <td rowspan ="2"><input type="button"  class="btn btn-default btn-lg"  id= "login_button"  tabindex="3" value="로그인"/></td>
               </tr>
               <tr>
                   <td style="height : 60px; width : 100px; font-size: 20px; ">비밀번호</td>
                  <td> <input  type ="password"  id ="pass" name="pass"value ="" placeholder="비밀번호 입력"/></td>
               </tr>   
               <tr>
               		<td colspan="3"  style="text-align : center"><a href="login/find"> 아이디 비밀번호 찾기</a> | <a href="login/join"> 회원가입</a> </td>
               </tr>   
            </table>   
         </div>
         </div>
         </form>
   <%@ include file="../footer.jsp" %>
   </div>
</body>
</html>