<%@ page contentType="text/html; charset=UTF-8" %>
<html>                      
    <head>
        <title>Search</title>
    </head>
    <body background="http://www.17sucai.com/upload/419920/2015-10-10/ff544162748b2ddf1d362b908737387f.jpg" >
        <h1 style="text-align:center">图书管理系统</h1>
        <hr/>
            
            <fieldset>
            <legend>作者图书搜索</legend>
            <div style="width:100%;text-align:center">
            <br>
                <form action="ShowBooks">
            作者名：
                <input type="text" name="name">
                <input type="submit" value="搜索">
            </form> 
            <br>
            </div>
            </fieldset>

        <fieldset>
        <legend>添加新的图书</legend>
        <br>
        <form action="AddBook">
          <center>
            <table>
            <tr><td>ISBN：</td><td><input type="text"  name="isbn" required /></td></tr>
            <tr><td>书名：</td><td><input type="text"   name="title" required /></td></tr>
            <tr><td>作者ID：</td><td><input type="text"  name="authorID" required/></td></tr>
            <tr><td>出版社：</td><td><input type="text"  name="publisher" /></td></tr>
            <tr><td>出版时间：</td><td><input type="date"  name="publishDate" /></td></tr>
            <tr><td>价格：</td><td><input type="text"   name="price" /></td></tr>
            <tr><td></td><td align="right"><input type="submit" value="添加" /></td></tr>
            </table>
          </center>
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