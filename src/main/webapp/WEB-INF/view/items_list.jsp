<!-- import the taglib to use jstl tag in jsp file -->
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.marinel.util.Mappings" %>

<html>
<head>
<title>Todo Items</title>
<style><%@ include file="/WEB-INF/css/style.css" %></style>
</head>
<body>
    <div>
        <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
        <div class="div_add_link_holder">
        <a href="${addUrl}" class="add_link">Add New Task</a>
        </div>
        <table cellpadding="5">
            <caption><div class="div_title_holder"><h2 class="entry_title_2">Todo Tasks</h2></div></caption>
            <tr class="tr_header">
                <th class="small_th bold">Id</th>
                <th>Title</th>
                <th>Dead Line</th>
                <th>Task Details</th>
                <th>Edit Task</th>
                <th>Delete Task</th>
            </tr>
            <c:forEach var="item" items="${todoData.items}">

                <c:url var="view_Url" value="${Mappings.VIEW_ITEM}">
                    <c:param name="id" value="${item.id}"/>
                </c:url>

                <c:url var="edit_Url" value="${Mappings.ADD_ITEM}">
                  <c:param name="id" value="${item.id}"/>
                </c:url>

                <c:url var="delete_Url" value="${Mappings.DELETE_ITEM}">
                  <c:param name="id" value="${item.id}"/>
                </c:url>
            <tr>
                <td class="white_background bold center th_id_holder"><c:out value="${item.id}"/></td>
                <td class="white_background bold"><c:out value="${item.title}"/></td>
                <td class="white_background bold center"><c:out value="${item.deadLine}"/></td>
                <td class="white_background bold center"><a class="view_item_link" href="${view_Url}">Open</a></td>
                <td class="white_background bold center"><a class="edit_link" href="${edit_Url}">Edit</a></td>
                <td class="white_background bold center"><a class="delete_link" href="${delete_Url}">Delete</a></td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>