<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <title>Search</title>
    </head>
    <body>
        <h1>图书管理系统</h1>
        <h2>作者图书搜索</h2>
        <form action="ShowBooks">
                       作者名：<input type="text"   name="name" required>
                   <input type="submit" value="搜索">
        </form>
        <h2>添加新的图书</h2>
        <form action="AddBook">
          <table>
            <tr><td>ISBN：</td><td><input type="text"  name="isbn" required></td></tr>
            <tr><td>书名：</td><td><input type="text"   name="title" required></td></tr>
            <tr><td>作者ID：</td><td><input type="text"  name="authorID" required></td></tr>
            <tr><td>出版社：</td><td><input type="text"  name="publisher" ></td></tr>
            <tr><td>出版时间：</td><td><input type="text"  name="publishDate" ></td></tr>
            <tr><td>价格：</td><td><input type="text"   name="price" ></td></tr>
            <tr><td></td><td><input type="submit"  value="添加"></td></tr>
          </table>
        </form>
    </body>
</html>