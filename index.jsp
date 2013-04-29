<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset=utf-8>
<meta name="viewport" content="width=620">

<style media="screen" type="text/css">
.form {
  width: 400px;
	height: 40px;
	border: 1px solid #686868;
	background-color: #fff;
	padding-left: 5px;
	font-family: georgia;
	text-decoration: none;
	font-size: 23px;
	color: #333333;
	font-weight: 50;
	margin: 100px 0px 3px 5px;
	position:relative;
	left:-6px;
	border:1px solid #adc5cf;
	background: #e4f1f9; /* Old browsers */
	background: -moz-linear-gradient(top, #e4f1f9 0%, #d5e7f3 100%); /* FF3.6+ */
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#e4f1f9), color-stop(100%,#d5e7f3)); /* Chrome,Safari4+ */
	background: -webkit-linear-gradient(top, #e4f1f9 0%,#d5e7f3 100%); /* Chrome10+,Safari5.1+ */
	background: -o-linear-gradient(top, #e4f1f9 0%,#d5e7f3 100%); /* Opera 11.10+ */
	background: -ms-linear-gradient(top, #e4f1f9 0%,#d5e7f3 100%); /* IE10+ */
	background: linear-gradient(top, #e4f1f9 0%,#d5e7f3 100%); /* W3C */
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#e4f1f9', endColorstr='#d5e7f3',GradientType=0 ); /* IE6-9 */
	color:#7da2aa;
	cursor: pointer;
	}
.form2 {
	width: 285px;
	border: 1px solid #686868;
	background-color: #EFEFEF;
	padding-left: 5px;
	font-family: georgia;
	text-decoration: none;
	font-size: 17px;
	color: #333333;
	font-weight: 50;
	margin: 7px 0px 3px 5px;
	}
.form:hover {
	width: 400px;
	height: 40px;
	border: 1px solid #686868;
	background-color: #F8F8F8;
	padding-left: 5px;
	font-family: georgia;
	text-decoration: none;
	font-size: 23px;
	color: #333333;
	font-weight: 50;
	margin: 100px 0px 3px 5px;
	}
h1 {
	font-family: tahoma, sans-serif;
	font-size: 15px;
	color: #294759;
	margin-bottom: -10px;
	border-bottom: dotted 1px #333;
	}	
h2 {
	font-family: tahoma, sans-serif;
	font-size: 15px;
	color: #294759;
	margin-bottom: 0px;
	margin-top:0px;
}
.submit {
	font-size: 25px;
	margin-top:20px;	
	
}
.input-rounded-button {
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 20px;
    border: 1px solid gray;
    padding:8px 10px 8px 10px;
    display:inline-block;
    text-decoration:none;
    background:#888888;
    margin-top:15px;

    color:#FFFFFF;
    cursor:pointer;
    font:17px sans-serif;
}

.input-rounded-button:hover { 
    text-decoration:none;
        background:#D8D8D8; 
    color:#383838; 
    cursor:pointer;
    border:1px solid #F8F8F8;
        margin-top:15px;
    
}
#login {
	width: 568px;
	height: 271px;
	background-image: url(bg2.jpg);
	background-repeat: no-repeat;
	margin-top:200px;	
	
}
#login:hover {
	width: 568px;
	height: 271px;
	background-image: url(bg.jpg);
	background-repeat: no-repeat;
	margin-top:200px;	
	
}

</style>
<title>Search Database</title>

</head>
<body>
<center>
<h1>Search Database</h1>
<div id="login">
<form name="input" action="Controller" method="get" >

<input type="text" name="query" class="form" placeholder="Search away..."> <br />
<input class="input-rounded-button" type="submit" value="SEARCH" />

</form>
</div>
</center>

</body>
</html>

