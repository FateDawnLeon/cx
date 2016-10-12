<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>图书信息</title>
    </head>
    <body>
    <h1 align = center>图书信息</h1>
    <table align = center>
         <tr> 
         <td>ISBN</td> 
         <td><s:property value="isbn" /></td>
         </tr>
         
         <tr>
         <td>Title</td>
         <td><s:property value="title" /></td>
         </tr>
         
         <tr>
         <td>AuthorID</td>
         <td><s:property value="authorID" /></td>
         </tr>
         
         <tr>
         <td>Publisher</td>
         <td><s:property value="publisher" /></td>
         </tr>
         
         <tr>
         <td>PublishDate</td>
         <td><s:property value="publishDate.toString()" /></td>
         </tr>
         
         <tr>
         <td>Price</td>
         <td><s:property value="price" /></td>
         </tr>
         
    </table>
    </body>
</html>