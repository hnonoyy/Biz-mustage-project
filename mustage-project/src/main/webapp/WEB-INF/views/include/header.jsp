<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<header>
	<h1>뮤스테이션</h1>
	<input type="text" name="search" /> <input type="button" value="검색">
	<div>
		<a href="#">로그인</a> 
		<a href="#">회원가입</a>
		<a href="#">마이페이지</a>
	</div>
</header>
<nav>
	<ul>
		<li>뮤지컬</li>
		<li>커뮤니티</li>
	</ul>
</nav>