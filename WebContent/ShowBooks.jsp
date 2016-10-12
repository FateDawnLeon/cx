<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Show Books</title>
    </head>
    <body>
       <h1> <s:property value="name" />的全部著作如下：</h1>
       <table>
            <tr><td>索引</td><td>书名</td><td>作者ID</td><td>操作</td></tr>
            <s:iterator value="books" status="st">
                <tr>
                <td><s:property value="#st.getIndex()" /></td>
                
                <td>
                <a href=
                    "<s:url action="CheckInfo">
                     <s:param name="isbn"><s:property value="isbn"/></s:param>
                     <s:param name="title"><s:property value="title"/></s:param>
                     <s:param name="authorID"><s:property value="authorID"/></s:param>
                     <s:param name="publisher"><s:property value="publisher"/></s:param>
                     <s:param name="publishDate"><s:property value="publishDate"/></s:param>
                     <s:param name="price"><s:property value="price"/></s:param>
                     </s:url>
                    ">
                     <s:property value="title"/>
                </a>
                </td>
                
                <td><s:property value="authorID" /></td>
                
                <td>
                <a href=
                     "<s:url action="Delete">
                      <s:param name="isbn">
                      <s:property value="isbn"/>
                      </s:param>
                      </s:url>
                      ">
                                    删除
                </a>
                </td>
                
                </tr>
            </s:iterator>
        </table>        
    </body>
</html>