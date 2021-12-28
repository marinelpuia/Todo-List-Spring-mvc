<!-- import the taglib to use jstl tag in jsp file -->
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.marinel.util.Mappings" %>

<DOCTYPE html>
<html>
<head>
<title>Todo List Application</title>
<style><%@ include file="/WEB-INF/css/style.css" %></style>
</head>
<body>
    <div class="vertical_and_horizontally_center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}" />
        <h2 class="center"><a class="entry_title" href="${itemsLink}">Show Todo Tasks</a><h2>
    </div>
</body>
</html>