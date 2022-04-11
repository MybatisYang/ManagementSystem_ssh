<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>主界面</title>
    <style type="text/css">
        div {
            margin: 0 auto;
            width: 80%;
        }

        table {
            border: 2px solid;
        }

        td {
            border: 1px solid;
            text-align: center;
            width: 200px;
            height: 30px;
        }
    </style>
</head>
<body>
<div>
    <table>
        <tr>
            <td colspan="5">用户信息:</td>
            <td>操作</td>
        </tr>
        <tr>
            <td>账号</td>
            <td>密码</td>
            <td>真实姓名</td>
            <td>邮箱</td>
            <td>(Y管理员/N用户)</td>
            <td><a href="add.jsp">添加</a></td>
        </tr>
        <s:iterator value="#session.users">
            <tr>
                <td>${userid}</td>
                <td>${password}</td>
                <td>${realname}</td>
                <td>${email}</td>
                <td>${admin}</td>
                <td>
                    <a href="userAction_del?id=${id}">删除</a>|
                    <a href="userAction_toUpdate?id=${id}">修改</a>
                </td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
