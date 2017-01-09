<%@page import="fr.tbr.iamcore.datamodel.Identity"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<% Collection<Identity> idList = (Collection<Identity>)session.getAttribute("idList");
  session.removeAttribute("idList");
%>

<head>
<link xmlns="http://www.w3.org/1999/xhtml" rel="stylesheet"
	href="css/bootstrap.min.css" />
</head>

<body>


	<div class="container">
		<h2 class="text-info">Identity Search</h2>
		<a href="welcome.jsp">&lt;&lt; back</a>

		<h3 class="text-info">Search Criteria</h3>
	</div>


	<form class="form-horizontal" role="form" method="GET" action="Search">
		<div class="form-group">
			<label for="displayName" class="col-sm-2 control-label">Displayname</label>

			<div class="col-sm-10">
				<input name="displayName" type="text" class="form-control" id="displayName"
					placeholder="Display Name" />
			</div>
		</div>
		<div class="form-group">
			<label for="email" class="col-sm-2 control-label">Email</label>

			<div class="col-sm-10">
				<input name="email" type="text" class="form-control" id="email"
					placeholder="Email" />
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10 text-right">
				<button type="submit" class="btn btn-primary">Search</button>
			</div>
		</div>
	</form>
	<div class="container">
		<h3 class="text-info">Search Results</h3>

		<form class="form-horizontal">
			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr>
							<th>UID</th>
							<th>Display Name</th>
							<th>Email</th>
							<th>Login</th>
						</tr>
					</thead>
					<tbody>
						<%
							if(idList==null||idList.isEmpty())
							{
							} 
							else 
							{ 
								for(Identity identity: idList){
						%>
						<tr>
			
							<td><%=identity.getUid()%></td>
							<td><%=identity.getDisplayName()%></td>
							<td><%=identity.getEmail()%></td>
							<td><%=identity.getUsername()%></td>
					    	<td><div>
					    	<a class="btn btn-success"
							     href="Update?id=<%=identity.getId()%>">Update</a> 
							 <a	href="Delete?id=<%=identity.getId()%>"
										class="btn btn-success" onclick="return confirm('To delete click ok ?');"> Delete</a>
								</div></td>
						</tr>
						<%}}
						%>
					</tbody>
				</table>
			</div>
			
		</form>
		
	</div>
</body>
</html>