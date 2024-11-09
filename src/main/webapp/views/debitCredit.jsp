<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Debit/Credit transaction</title>
</head>
<body>

	<div class="container mt-5">

		<form action="transactionform" method="post">

			<!-- 	account number is auto generated please check if any -->
			<div class="form-group">
				<label for="accountNumber">Account Number</label> <input type="text"
					class="form-control" id="accountNumber"
					placeholder="Enter Account Number" name="accountNumber"
					value="${accountNumber}">
			</div>

			<div class="form-group">
				<label for="amount">Amount</label> <input type="text"
					class="form-control" id="amount" placeholder="Enter Your Name"
					name="amount">
			</div>

			<!-- <div class="form-group">
				<label>Transaction Type</label><br> <input type="radio"
					id="debit" name="transactionType" value="debit"> <label
					for="debit">Debit</label> <input type="radio" id="credit"
					name="transactionType" value="credit"> <label for="credit">Credit</label>
			</div> -->

			<div class="form-group">
				<label for="transactionType">Transaction Type</label> <select
					class="form-control" id="transactionType" name="transactionType">
					<option value="" disabled selected>Select Transaction Type</option>
					<option value="debit">Debit</option>
					<option value="credit">Credit</option>
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
	<!-- 
		<script type="text/javascript" src="js/index.js"></script> -->
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