<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>查询结果</title>
        <style type="text/css">
        body {
               background-image:url("http://desk.fd.zol-img.com.cn/t_s1920x1080c5/g5/M00/07/00/ChMkJ1fpzu2IDQUeAAJMvn5sgAcAAWZIQNNPaAAAkzW691.jpg");
               background-size: 1920px 1080px;
               background-repeat: no-repeat;
               background-attachment:fixed
        }
        </style>
    </head>
    <body>
       <table align="center" border="5" width="500">
            <caption><h1>全部作者</h1></caption>
            <tr>
            <th>索引</th>
            <th>ID</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>国籍</th>
            <th>操作</th>
            </tr>

            <s:iterator value="authors" status="st">
                <tr>
                <td align="center" ><s:property value="#st.getIndex()" /></td>
                <td align="center"><s:property value="authorID"/></td>
                <td align="center"><s:property value="name" /></td>
                <td align="center"><s:property value="age" /></td>
                <td align="center"><s:property value="country" /></td>
                <td align="center">
                <a href=
                     "<s:url action="DeleteAuthor">
                      <s:param name="authorID">
                      <s:property value="authorID"/>
                      </s:param>
                      </s:url>
                      " style="text-decoration:none" >
                                 删除
                </a>
                </td>
                </tr>
            </s:iterator>
            
        </table> 
        <br><br> 
        <div style="width:100%;text-align:center">       
        <form action="ReturnMain">
              <input type="submit" value="返回主页">
        </form>
        </div>       
    </body>
</html>