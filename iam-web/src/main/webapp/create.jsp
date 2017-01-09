<html>
<head>
<link xmlns="http://www.w3.org/1999/xhtml" rel="stylesheet"
	href="css/bootstrap.min.css" />
</head>

<body>
    <h1>Identity Creation</h1>
	<div class="container">
		<div xmlns="http://www.w3.org/1999/xhtml" class="bs-example">
			<form role="form" method="post" action="IdAction">
				<div class="form-group">
					<label for="exampleInputEmail1">Display Name</label> 
					<input name="displayName" type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Enter Login" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Email</label> 
					<input name="email" type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Enter Login" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">UID</label> 
					<input name="uid" type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Enter Login" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">BirthDate</label> 
					<input name="birthDate" type="date" class="form-control" id="exampleInputEmail1"
						placeholder="Enter Login" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">username</label> 
					<input name="username" type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Enter username" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Password</label> 
					<input name="password" type="password" class="form-control" id="exampleInputEmail1"
						placeholder="Enter password" />
				</div>
				

				<button type="submit" class="btn btn-default">Save</button>
			</form>
		</div>
	</div>
</body>
</html>
