<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.AttributeNames" %>

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
    <form:form method="POST" modelAttribute="${AttributeNames.TODO_ITEM}">

        <table>

            <tr>
                <td><label>ID</label></td>
                <td>
                    <form:input path="id" disabled="true" />
                </td>
            </tr>

            <tr>
                <td><label>Title</label></td>
                <td><form:input path="title"/></td>
            </tr>

            <tr>
                <td><label>Deadline</label></td>
                <td><form:input path="deadline"/></td>
            </tr>

            <tr>
                <td><label>Details</label></td>
                <td><form:textarea path="details"/></td>
            </tr>

            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>

    </form:form>

</div>

</body>
</html>