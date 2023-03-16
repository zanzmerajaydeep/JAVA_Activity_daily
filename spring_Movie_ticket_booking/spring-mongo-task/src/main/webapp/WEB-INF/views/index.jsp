<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MovieFrom</title>
<style type="text/css">
input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
	-webkit-appearance: none;
	margin: 0;
}
 body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            padding: 20px;
        }

        /* Add styles for the h1 element */
        h1 {
            text-align: center;
            color: #008080;
        }

        /* Add styles for the form element */
        form {
            max-width: 500px;
            margin: 0 auto;
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
        }

        /* Add styles for the input and select elements */
        input[type="text"],
        input[type="date"],
        input[type="number"],
        select {
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        /* Add styles for the radio buttons */
        input[type="radio"] {
            margin-right: 10px;
        }
        
        input[type="submit"] {
            background-color: #008080;
            color: #fff;
            border: none;
            border-radius: 2px;
            box-sizing: border-box;
            width:200px;
            height:40px;
            }
            
           alert{
           background-color: pink;
           }
</style>
</head>
<body>
	<h1>Welcome to Movie Ticket Booking</h1>
	<form  method="get"  action="add" >
		Mobile Number : <input type="text" name="mno" id="mno"> <br> <br>
		Movie Name : <select name="movielist">
			<option value="tjmm">Screen 1 - Tu Jhoothi Main Makkaar</option>
			<option value="pathaan">Screen 2 Pathaan</option>
			<option value="vash">Screen 3 Vash</option>
			<option value="antman">Screen 4 Antman</option>
		</select> <br> <br> Show Date : <input type="date" name="mdate">
		<br> <br> Show Time : <select name="mtime">
			<option value="morning">Morning - 10:00</option>
			<option value="noon">Afternoon - 2:30</option>
			<option value="evening">Evening - 6:00</option>
			<option value="night">Night - 10:00</option>
		</select> <br> <br> Ticket Type : Economy Rs.150 <input type="radio"
			name="seatType" value="economy"> Platinum Rs.250 <input
			type="radio" value="platinum" name="seatType"> <br> <br>
		Number of Tickets : <input type="number" name="nseats"> <br>
		 <br> <input type="submit" value="Check Availability" id="check"> <br>
		 <div id="paymentForm" style="visibility:hidden">
		<br> Payment Type : <select name="ptype">
			<option value="card">Card</option>
			<option value="cash">Cash</option>
			<option value="upi">UPI</option>
		</select> <br> <br> Transaction Number : <input type="text"
			name="tid"> <br> <br>
			<input type="submit"
			value="Book Now" id="add"> 
	</div>
	
	</form>

	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
	<script>
	
/* 	date functionality */
	
	
	
	
	/* ajex code for data transfer */
	$(document).ready(function(){  
		  $("#check").click(function(e){ 
			  e.preventDefault();
		jQuery.ajax({  
		url: 'check', 
		type: 'GET', 
		data:{
			mno : document.getElementsByName("mno")[0].value,
			movielist :document.getElementsByName("movielist")[0].value,
			mdate :document.getElementsByName("mdate")[0].value,
			mtime :document.getElementsByName("mtime")[0].value,
			seatType :document.getElementsByName("seatType")[0].value,
			nseats:document.getElementsByName("nseats")[0].value
			
		},
		  success: function(data) { 
			 if(data == "true"){
				 document.querySelector("#paymentForm").style.visibility="visible";
				
		}
			 else{
				 alert("sorry babu no tickit for you!!");
			 }
				 }
			 }
			 );  
		  });
		  
		  
		});  	</script> 
</body>
</html>