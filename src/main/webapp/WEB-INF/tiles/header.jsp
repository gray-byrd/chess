<%@ page import="games.chess.model.PieceEnum" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="logedIn" scope="session" value="true"/>
<a id="header-logo" href="/"><%=PieceEnum.BLACK_ROOK.getHtml()%></a>
<div id="header-title-frame">
    <a id="header-title" href="/">chess</a>
</div>
<div id="header-link-frame">
    <c:choose>
        <c:when test="${loggedIn}">
            <a id="header-user-link">${email}</a>
        </c:when>
        <c:otherwise>
            <a id="header-signup-link" href="/signup">sign up</a>
            <span>or</span>
            <a id="header-signin-link" href="/signin">sign in</a>
        </c:otherwise>
    </c:choose>
</div>