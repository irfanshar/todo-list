<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.AttributeNames" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page import="academy.learnprogramming.util.HyperlinkConstants" %>

<html>
<head>
    <title>Add Items</title>
</head>
<body>

<%-- div tag used to center table in middle of page --%>
<div align="center">

    <%--    form is the prefix defined in the top at line 2--%>
    <%--    POST defines the formats using the HTTP Post method--%>
    <%--       benefits of using spring form tag is the ability to define model attributes--%>
    <%--       i.e. bind the entire form to a single parameter in a method--%>
    <%--       all the fields in teh form wil be transferred to the controller as a parameter--%>
    <%--@elvariable id="${AttributeNames.TODO_ITEM}" type="academy.learnprogramming"--%>

    <%-- TODO ADD A CONSTANT FOR THE HOME MAPPING--%>
    <c:url var="homeUrl" value="/"/>
    <h4 style="text-align: left;"><a href="${homeUrl}">Home</a></h4>

    <c:url var="tableUrl" value="${Mappings.ITEMS}"/>
    <h4 style="text-align: left;"><a href="${tableUrl}">${HyperlinkConstants.TODO_ITEMS}</a></h4>

    <h2>Journal Entry</h2>

    <table>

        <tr>
            <td><label>Title</label></td>
            <td><input path="title"/></td>
        </tr>

        <tr>
            <td><label>Date</label></td>
            <td><input path="date"/></td>
        </tr>

        <tr>
            <td><label>Entry</label></td>
            <td><textarea path="textEntry"/></td>
        </tr>

    </table>

</div>

</body>
</html>