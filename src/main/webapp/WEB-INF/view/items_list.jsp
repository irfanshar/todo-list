<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>

<html>
<head>
    <title>Todo Items</title>
</head>
<body>

<%-- div tag used to center table in middle of page --%>
<div align="center">
    <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
    <h2><a href="${addUrl}">New Item</a></h2>


    <table border="1" cellpadding="5">

        <%-- caption tag is used for the String displayed on the tab --%>
        <caption><h2>Todo Items</h2></caption>

        <%-- tr indicates a table row --%>
        <tr>
            <%-- th indicates a table header --%>
            <th>Title</th>
            <th>Deadline</th>
            <th>Details</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <%-- var represents a single item in a collection of items --%>
        <%-- items represents the collection we will loop through --%>
        <c:forEach var="item" items="${todoData.getItems()}">

            <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>

            <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                    <c:param name="id" value="${item.id}"/>
            </c:url>

            <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>

            <tr>
                <td><c:out value="${item.title}"></c:out></td>
                <td><c:out value="${item.deadline}"></c:out></td>
                <td><a href="${viewUrl}">View</a></td>
                <td><a href="${editUrl}">Edit</a></td>
                <td><a href="${deleteUrl}">Delete</a></td>
            </tr>

        </c:forEach>
    </table>
</div>

</body>
</html>