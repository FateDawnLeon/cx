<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <title>添加作者</title>
    </head>
    <body>
        <h1>作者不存在，请先添加作者信息！</h1>
        <form action="AddAuthor">
          <table>
            <tr><td>作者姓名：</td><td><input type="text"  name="name" required></td></tr>
            <tr><td>作者年龄：</td><td><input type="text"   name="age" ></td></tr>
            <tr><td>作者国籍：</td><td><input type="text"  name="country" ></td></tr>
            <tr><td></td><td><input type="submit"  value="添加"></td></tr>
          </table>
        </form>
    </body>
</html>