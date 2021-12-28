<!-- import the taglib to use jstl tag in jsp file -->
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.marinel.util.Mappings" %>

<html>
<head>
<title>View Single Item</title>
<style><%@ include file="/WEB-INF/css/style.css" %></style>
</head>
<body>
    <div class="div_single_item">
        <div class="single_item_title_holder">
            <h2><c:out value="${todoItem.title}"/></h2>
        </div>
        <table class="bold" cellpadding="5">
            <tr>
                <td class="white_background td_medium_size"><label>Id</label></td>
                <td class="white_background th_id_holder">
                    <c:out value="${todoItem.id}"/>
                </td>
            </tr>
            <tr>
                <td class="white_background td_medium_size"><label>Title</label></td>
                <td class="white_background">
                    <c:out value="${todoItem.title}"/>
                </td>
            </tr>
            <tr>
                <td class="white_background td_medium_size"><label>Dead Line</label></td>
                <td class="white_background">
                    <c:out value="${todoItem.deadLine}"/>
                </td>
            </tr>
            <tr>
                <td class="white_background td_medium_size"><label>Details</label</td>
                <td class="white_background">
                    <c:out value="${todoItem.details}"/>
                </td>
            </tr>
            <tr>
                <td class="white_background td_medium_size"><label>Action</label</td>
                <td class="white_background">
                    <div class="back_div">
                           <c:url var="tableUrl" value="${Mappings.ITEMS}" />
                           <a class="back_link" href="${tableUrl}">Back to Tasks</a>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</body>
</html>