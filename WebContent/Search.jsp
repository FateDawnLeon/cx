<%@ page contentType="text/html; charset=UTF-8" %>
<html>                      
    <head>
        <title>Search</title>
        
        <style type="text/css">
        body {
               background-image:url("http://desk.fd.zol-img.com.cn/t_s1920x1080c5/g5/M00/06/0B/ChMkJ1cZryyILwYoAAoo84eIVEMAAQZVQHj0SoACikL771.jpg");
               background-size: 1920px 946px;
               background-repeat: no-repeat;
               color: white;
        }
        h1 {
             color: black;
             font-family: 微软雅黑;
        }
        </style>
        
    </head>
    <body>
        <h1 style="text-align:center">Leon的图书管理系统</h1>
        <hr/>
            
            <fieldset>
            <legend>作者图书搜索</legend>
            <div style="width:100%;text-align:center">
            <br>
                <form action="ShowBooks">
            作者名：
                <input type="text" name="name" required>
                <input type="submit" value="搜索">
            </form> 
            <br>
            </div>
            </fieldset>

        <fieldset>
        <legend>添加新的图书</legend>
        <br>
        <form action="AddBook">
            <table align="center">
            <tr><td>ISBN：</td><td><input type="text"  name="isbn" required /></td></tr>
            <tr><td>书名：</td><td><input type="text"   name="title" required /></td></tr>
            <tr><td>作者ID：</td><td><input type="text"  name="authorID" required/></td></tr>
            <tr><td>出版社：</td><td><input type="text"  name="publisher" /></td></tr>
            <tr><td>出版时间：</td><td><input type="date"  name="publishDate" /></td></tr>
            <tr><td>价格：</td><td><input type="text"   name="price" /></td></tr>
            <tr><td></td><td align="right"><input type="submit" value="添加" /></td></tr>
            </table>
        </form>
        <br>
        </fieldset>
        
        <fieldset>
        <legend>添加新的作者</legend>
        <br>
        <form action="AddAuthor">
            <table align="center">
            <tr><td>作者姓名：</td><td><input type="text"  name="name" required></td></tr>
            <tr><td>作者年龄：</td><td><input type="text"   name="age" ></td></tr>
            <tr><td>作者国籍：</td><td><input type="text"  name="country" ></td></tr>
            <tr><td></td><td align="right"><input type="submit"  value="添加"></td></tr>
            </table>
        </form>
        <br>
        </fieldset>
        
        <fieldset>
        <legend>其他辅助操作</legend>
        <div style="width:100%;text-align:center">
        <br>
        <form action="ShowAllBooks">
              <input type="submit" value="查看全部图书">
        </form>
        <form action="ShowAllAuthors">
              <input type="submit" value="查看全部作者">
        </form>
        <br>
        </div>
        </fieldset>
        
    </body>
</html>