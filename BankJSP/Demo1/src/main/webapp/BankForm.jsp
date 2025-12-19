

<jsp:useBean id="banking" class="app.Components.BankBean" scope="session" />
<jsp:setProperty name="banking" property="person" param="person" />
<jsp:setProperty name="banking" property="principle" />
<jsp:setProperty name="banking" property="years"  />
<html>
	<head>
		<title>simple-web-app</title>
		<style>
			body {
				font-family: Arial, sans-serif;
				background-color: #f4f4f4;
				margin: 0;
				padding: 20px;
			}
			h1 {
				color: #333;
			}
			table {
				width: 100%;
				max-width: 600px;
				margin: auto;
				background: white;
				border-radius: 8px;
				box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
				padding: 20px;
			}
			td {
				padding: 10px;
			}
			input[type="text"], input[type="number"] {
				width: 100%;
				padding: 10px;
				border: 1px solid #ccc;
				border-radius: 4px;
			}
			input[type="submit"] {
				background-color: #5cb85c;
				color: white;
				border: none;
				padding: 10px 15px;
				border-radius: 4px;
				cursor: pointer;
			}
			input[type="submit"]:hover {
				background-color: #4cae4c;
			}
		</style>
	</head>
	<body>
		<h1>Welcome Visitor</h1>
		<!--<b>The interest will be : ${banking.interest} </b> -->
		<form method="post" action="Return.jsp">
			<table>
				<tr>
					<td><b>Enter your name:</b></td>
					<td><input type="text" name="person" required></td>
				</tr>
				<tr>
					<td><b>Amount you want to invest:</b></td>
					<td><input type="number" name="principle" required></td>
				</tr>
				<tr>
					<td><b>Years for investing:</b></td>
					<td><input type="number" name="years" required></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center;">
						<input type="submit" value="Submit">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>




