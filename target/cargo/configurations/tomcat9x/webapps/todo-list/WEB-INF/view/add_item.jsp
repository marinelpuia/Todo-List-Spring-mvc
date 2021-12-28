<!-- import the taglib to use jstl tag in jsp file -->
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- import the taglib to use spring form tags in jsp file -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.marinel.util.AttributeNames" %>
<%@ page import="com.marinel.util.Mappings" %>

<html>
<head>
<title>Add Items</title>
<style><%@ include file="/WEB-INF/css/style.css" %></style>
</head>
<body>
    <div class="vertical_and_horizontally_center">
        <div class="div_title_holder">
            <h2 class="center entry_title_2">Enter the task details and then click submit</h2>
        </div>
        <form:form method="POST" modelAttribute="${AttributeNames.TODO_ITEM}">
            <table class="bold" cellpadding="5">
                <tr>
                    <td class="white_background td_medium_size"><label>Id</label></td>
                    <td>
                        <form:input path="id" disabled="true"/>
                    </td>
                </tr>
                <tr>
                    <td class="white_background td_medium_size"><label>Title</label></td>
                    <td><form:input class="input_title" path="title"/></td>
                </tr>
                <tr>
                    <td class="white_background td_medium_size"><label>Dead Line</label></td>
                    <td><form:input path="deadLine"/></td>
                </tr>
                <tr>
                    <td class="white_background td_medium_size"><label>Details</label</td>
                    <td><form:textarea class="textarea" path="details"/></td>
                </tr>
                <tr>
                    <td class="white_background td_medium_size">Action</td>
                    <td class="white_background right td_medium_size">
                       <c:url var="tableUrl" value="${Mappings.ITEMS}" />
                       <span><a class="cancel_add_item_btn" href="${tableUrl}">Cancel</a></span>
                       <span><input class="submit_btn" type="submit" value="Submit"/></span>
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>