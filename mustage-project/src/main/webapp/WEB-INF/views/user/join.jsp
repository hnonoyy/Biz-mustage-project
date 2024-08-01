<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="$pageContext.request.contextPath }" var="rootPath" />
<title>뮤스테이션</title>
<form class="user join" method="POST">
	<fieldset>
		<div>
		<p>회원가입</p>
		<c:if test="${JOIN_MSG == 'FAIL' }">
				<h3>회원가입에 실패 했습니다.</h3>
		</c:if>
		</div>
		<input type="text" placeholder="ID" name="id" /> <span>*</span>
		<input type="password" placeholder="PASSWORD" name="password" /> <span>*</span>
		<input type="text" placeholder="이름" name="name" /> <span>*</span> 
		<input type="text" placeholder="닉네임" name="nick" /> <span>*</span>
		<input type="text" placeholder="이메일" name="email" /> <span>*</span>
		<input type="text" placeholder="전화번호" name="tel" /> <span>*</span> 
		<input type="button" value="회원가입" />
	</fieldset>
</form>