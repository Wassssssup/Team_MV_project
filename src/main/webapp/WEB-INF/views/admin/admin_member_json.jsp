<%@page import="org.json.simple.JSONObject"%>
<%@page import="kr.co.ezenac.VO.AdminMemberVO"%>
<%@page import="kr.co.ezenac.DAO.AdminMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	AdminMemberDAO amDAO = new AdminMemberDAO();
	String id = request.getParameter("id");
	AdminMemberVO amVO = new AdminMemberVO();
	JSONObject json = new JSONObject();
	
	json.put("id",id);
	json.put("num", amVO.getMemNo());
	json.put("name", amVO.getMemName());
	json.put("birth", amVO.getMemBirth());
	json.put("gender", amVO.getMemGender());
	json.put("email", amVO.getMemEmail());
	json.put("phone", amVO.getMemPhone());
	json.put("regdate",amVO.getMemRegdate());
	
	String jsonString = json.toJSONString();
	out.println(jsonString);
%>