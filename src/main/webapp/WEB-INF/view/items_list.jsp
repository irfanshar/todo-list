<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>

<%-- div tag used to center table in middle of page --%>
<div align="center">

    <table border="1" cellpadding="5">

        <%-- caption tag is used for the String displayed on the tab --%>
        <caption><h2>Todo Items</h2></caption>

        <%-- tr indicates a table row --%>
        <tr>
            <%-- th indicates a table header --%>
            <th>Title</th>
            <th>Deadline</th>
        </tr>

        <%-- var represents a single item in a collection of items --%>
        <%-- items represents the collection we will loop through --%>
        <c:forEach var="item" items="${todoData.getItems()}">

            <tr>
                <td><c:out value="${item.title}"></c:out></td>
                <td><c:out value="${item.deadline}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>