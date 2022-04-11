<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改界面</title>
    <style type="text/css">
        .s {
            width: 245px;
            height: 30px;
        }

        div {
            margin: 0 auto;
            width: 80%;
            text-align: center;
            border: 1px solid;
        }
    </style>
</head>

<body>
<div>
    请输入你要修改的信息
    <s:form action="userAction_update" method="post" validate="true">
        <input type="hidden" name="user.id" value="<s:property value="#session.user.id"/>"/>
        <p>账&emsp;&emsp;号：<input type="text" name="user.userid" value="<s:property value="#session.user.userid"/>"/></p>
        <p>密&emsp;&emsp;码：<input type="text" name="user.password" value="<s:property value="#session.user.password"/>"/></p>
        <p>真实姓名：<input type="text" name="user.realname" value="<s:property value="#session.user.realname"/>"/></p>
        <p>邮&emsp;&emsp;箱：<input type="text" name="user.email" value="<s:property value="#session.user.email"/>"/></p>
        <p>权&emsp;&emsp;限：<input type="text" name="user.admin" value="<s:property value="#session.user.admin"/>"/></p>
        <p><input type="submit" name="submit" vlaue="确认" class="s"/></p>
        <p><input type="button" value="返回" onclick="history.go(-1)" class="s"/></p>
    </s:form>
</div>
</body>
</html>