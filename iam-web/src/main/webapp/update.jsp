<%@page import="fr.tbr.iamcore.datamodel.Identity"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<link xmlns="http://www.w3.org/1999/xhtml" rel="stylesheet"
	href="css/bootstrap.min.css" />
<title>IAM - Update</title>
</head>

<body>

<%
Identity identity = (Identity) session.getAttribute("identity");
%>
<div class="container">
    <div class="jumbotron">
          <h2 class="text-info">Identity Management System </h2>
		 <h4 class="text-info">>>Please give the new details to update an identity </h4>
		 <a href="index.jsp">Logout</a>
		 
    </div>
    </div>
<div class="container">
     <form class="form-horizontal" action="Update" method="post" role="form">
        <div class="form-group">
            <label for="displayName" class="col-sm-2 control-label">First Name</label>
            <div class="col-sm-10">
                <input class="form-control" name="displayName" value="<%=identity.getDisplayName() %>" id="displayName" placeholder="displayName" />
            </div>
        </div>
        <div class="form-group">
            <label for="uid" class="col-sm-2 control-label">Uid</label>
            <div class="col-sm-10">
                <input class="form-control" name="uid" value="<%=identity.getUid() %>" id="uid" placeholder="uid" />
            </div>
        </div>
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">Username</label>
            <div class="col-sm-10">
                <input class="form-control" name="username" value="<%=identity.getUsername() %>" id="uid" placeholder="login" />
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-2 control-label">Email</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" value="<%=identity.getEmail() %>" readonly="true" name="email" id="email" placeholder="Email" />
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success btn-lg">Modify</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>