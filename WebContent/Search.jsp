<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Search</title>
    </head>
    <body>
        <h1>图书管理系统</h1>
        <h2>作者图书搜索</h2>
        <s:form action="ShowBooks">
            <s:textfield name="name" label="作者名"/>
            <s:submit value="搜索"/>
        </s:form>
        <h2>添加新的图书</h2>
        <s:form action="AddBook">
            <s:textfield name="isbn"  label="ISBN" />
            <s:textfield name="title" label="书名" />
            <s:textfield name="authorID" label="作者ID"/>
            <s:textfield name="publisher" label="出版社"/>
            <s:textfield name="publishDate" label="出版日期"/>
            <s:textfield name="price" label="价格"/>
            <s:submit value="添加"/>
        </s:form>
    </body>
</html>