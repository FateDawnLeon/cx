<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>查询结果</title>
    </head>
    <body>
       <table align="center" border="6" width="500">
            <caption><h1><s:property value="name" />的全部著作</h1></caption>
            <tr>
            <th>索引</th>
            <th>书名</th>
            <th>作者ID</th>
            <th>操作</th>
            </tr>

            <s:iterator value="books" status="st">
                <tr>
                <td align="center" ><s:property value="#st.getIndex()" /></td>
                
                <td align="center">
                <a href=
                    "<s:url action="CheckInfo">
                     <s:param name="isbn"><s:property value="isbn"/></s:param>
                     <s:param name="title"><s:property value="title"/></s:param>
                     <s:param name="authorID"><s:property value="authorID"/></s:param>
                     <s:param name="publisher"><s:property value="publisher"/></s:param>
                     <s:param name="publishDate"><s:property value="publishDate"/></s:param>
                     <s:param name="price"><s:property value="price"/></s:param>
                     </s:url>
                    " style="text-decoration:none" >
                     <s:property value="title"/>
                </a>
                </td>
                
                <td align="center"><s:property value="authorID" /></td>
                
                <td align="center">
                <a href=
                     "<s:url action="Delete">
                      <s:param name="isbn">
                      <s:property value="isbn"/>
                      </s:param>
                      </s:url>
                      " style="text-decoration:none" >
                      删除
                </a>
                </td>
                
                </tr>
            </s:iterator>
        </table>        
    </body>
</html>