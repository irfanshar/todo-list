<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page import="academy.learnprogramming.util.HyperlinkConstants" %>

<html>
<head>
    <title>Todo Items</title>
</head>
<body>

<%-- div tag used to center table in middle of page --%>
<div align="center">

    <c:url var="homePage" value="/"/>
    <h4 style="text-align:left "><a href="${homePage}">Home</a></h4>

    <table border="1" cellpadding="5">

        <%-- caption tag is used for the String displayed on the tab --%>
        <caption><h2>${HyperlinkConstants.JOURNAL}</h2></caption>

        <%-- tr indicates a table row --%>
        <tr>
            <%-- th indicates a table header --%>
            <th>Entry Number</th>
            <th>Title</th>
            <th>Date</th>
<%--            <th>Edit</th>--%>
<%--            <th>Delete</th>--%>
        </tr>

        <%-- var represents a single item in a collection of items --%>
        <%-- items represents the collection we will loop through --%>
        <c:forEach var="entry" items="${journal.getJournalEntryList()}">

            <tr>
                <td><c:out value="${entry.getId()}"></c:out></td>
                <td><c:out value="${entry.getTitle()}"></c:out></td>
                <td><c:out value="${entry.getDate()}"></c:out></td>
            </tr>

        </c:forEach>
    </table>

</div>

</body>
</html>