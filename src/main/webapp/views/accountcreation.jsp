<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Account Creation</title>
</head>
<body>


	<div class="container mt-5">

		<form action="createform" method="post">

			<!-- 	account number is auto generated please check if any -->
			<div class="form-group">
				<label for="accountNumber">Account Number</label> <input type="text"
					class="form-control" id="accountNumber"
					placeholder="Enter Account Number" name="accountNumber">
			</div>

			<div class="form-group">
				<label for="accountName">Account Name</label> <input type="text"
					class="form-control" id="accountName" placeholder="Enter Your Name"
					name="accountName">
			</div>

			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="email" placeholder="Enter Email ID"
					name="email">
			</div>
			
			<div class="form-group">
				<label for="balance">Initial Balance</label> <input type="text"
					class="form-control" id="balance" placeholder="Enter Initial Balance"
					name="balance">
			</div>


			<div class="form-group">
				<label for="dateOfBirth">Date Of Birth</label> <input type="text"
					class="form-control" id="dateOfBirth"
					placeholder="Enter Date of Birth" name="dateOfBirth">
			</div>

			<!-- <div class="form-group">
				<label for="gender">Gender</label> <input type="text"
					class="form-control" id="gender" placeholder="Enter Gender"
					name="gender">
			</div> -->
			
			<div class="form-group">
				<label for="gender">Gender</label> <select
					class="form-control" id="gender" name="gender">
					<option value="" disabled selected>Select Gender</option>
					<option value="male">Male</option>
					<option value="female">Female</option>
				</select>
			</div>

			<div class="container text-right">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>

		</form>

	</div>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>