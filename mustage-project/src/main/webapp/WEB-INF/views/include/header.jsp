<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<script src="https://kit.fontawesome.com/961285c801.js"
	crossorigin="anonymous"></script>
<header>
	<h1>뮤스테이션</h1>
	<input type="text" name="search" />
	<button>
		<i class="fa-solid fa-magnifying-glass"></i>
	</button>
	<div>
		<a href="${rootPath}/user/login">로그인</a> 
		<a href="${rootPath}/user/join">회원가입</a>
	</div>
</header>
<nav>
	<ul>
		<li class="musical">뮤지컬</li>
		<li class="community">커뮤니티</li>
	</ul>
</nav>