<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>添加作者</title>
    </head>
    <body>
        <s:form action="AddAuthor">
            <s:textfield name="name" label="作者姓名"/>
            <s:textfield name="age" label="作者年龄"/>
            <s:textfield name="country" label="作者国籍"/>
            <s:submit value="添加"/>
        </s:form>
    </body>
</html>