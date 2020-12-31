<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 12/31/2020
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
    <form method="post" action="translate">
    <fieldset>
      <legend>Dictionary</legend>
      <input type="text" placeholder="Enter your word:" name="txtSearch" value="${result}">
      <input type="submit" name="btSearch" value="Search">
    </fieldset>
  </form>
  </body>
</html>
