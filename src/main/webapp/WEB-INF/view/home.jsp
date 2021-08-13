<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page import="academy.learnprogramming.util.HyperlinkConstants" %>

<html>
<head>
    <title>Todo List Application</title>
</head>
<body>

<%-- div tag used to center table in middle of page --%>
<div align="center">

    <h1>Welcome to Irfan's Functionality Website</h1>

    <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
    <h3><a href="${itemsLink}">${HyperlinkConstants.TODO_ITEMS}</a></h3>

</div>

</body>
</html>