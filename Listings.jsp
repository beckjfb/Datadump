<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<meta charset=utf-8>
<meta name="viewport" content="width=620">

<link href="css/common.css" type="text/css" rel="stylesheet" />
<link href="css/index.css" type="text/css" rel="stylesheet" />
</head>

<body>
<div class="topBar"></div>


<!-- Begin container -->
<div id="container">
  
    <!-- Begin grey separator -->
    <!--/ End grey separator -->    
    
    
    <!-- Begin intro -->
    <div class="intro">
    	<form name="input" action="Controller" method="get" >

    	<h1><span class="highlight">Search:</span>

		<input type="text" name="query" class="form" placeholder="${prevQuery}"> 
 </h1>

</form>
    	<!-- Begin grey separator -->
    	<!-- Begin grey separator -->
    	<!-- Begin grey separator -->
    	
    	
    </div>
    <!--/ End intro -->
    
    
    <!-- Begin grey separator thick -->
    <div class="greySeparatorThick"></div>
    <!--/ End grey separator thick -->
    
    <c:forEach var="results" items="${list}">

    <!-- Begin featured work -->
    <div id="lis">
    <div class="featuredWork">
    <form name="input" action="Controller" method="get" >
    <input type="hidden" name="id" value="${results.id}">
    <div id="add"><input type="image" src="css/plus.png" /></div>
    </form>
    	<h1>${results.title}</h1>
     
        <ul class="title">
        	<li><b>Date:</b> ${results.date} </li>
        	<li><b>Rating:</b> ${results.score} </li>
        </ul>
        <div class="clear"></div>
       
        <ul class="description">
        	<li><b>Tags:</b>
        	 <c:forEach var="tagsss" items="${results.tags}">
        	 <a href=""> ${tagsss} </a> 
             </c:forEach>
        	 
        	 </li>

        </ul>
    </div>
   
    <!--/ End featured work -->

    <!-- Begin grey separator -->
    <div class="greySeparator"></div>
    <!--/ End grey separator -->
    </div> 
    </c:forEach>
    
    
    <!-- Begin footer -->
    <div class="footer">
    	Copyright &copy; 2013. Shivan & Jason 
    </div>
    <!--/ End footer -->
</div>
<!--/ End container -->





</body>
</html>
