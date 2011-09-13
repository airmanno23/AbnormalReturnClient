<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Abnormal Returns Service</title>
<link href="css/twoColFixRtHdr.css" rel="stylesheet" type="text/css">
</head>
<%
String url = request.getParameter("url");
%>
<body>
<div class="container">
  <div class="header"> 
    <!-- end .header --></div>
  <div class="sidebar1">
    <form action="controller" method="post">
      <ul class="nav">
        <li class="title">Import Settings</li>
        <li>Message Type:
          <select name="messageType">
            <option value="0">End of Day</option>
            <option value="1">Time and Sales</option>
          </select>
        </li>
        <li>RIC:
          <input type="text" class="text" name="ric" />
        </li>
        <li>Start Time:
          <input type="text" class="text" name="startTime" />
        </li>
        <li>End Time:
          <input type="text" class="text" name="endTime" />
        </li>
        <li>Start Date:
          <input type="text" class="text" name="startDate" />
        </li>
        <li>End Date:
          <input type="text" class="text" name="endDate" />
        </li>
        <li>Use GMT:<br/>
          Yes: <input type="radio" name="useGMT" value="1"/>
          No: <input type="radio" name="useGMT" value="0" />
        </li>
        <li>Use CA:<br/>
          Yes: <input type="radio" name="useCA" value="1"/>
          No: <input type="radio" name="useCA" value="0" />
        </li>
        <li style="text-align: center;"><input name="Import" type="submit"></li>
      </ul>
    </form>
  </div>
  <div class="content">   
  <%if(url == null){ %>
    <div><h1 class="left-top">Welcome</h1>
    </div> 
    <div class="clear"></div>
    <div id="output">
	    <p class="intro">
	    In stock market trading, abnormal returns are the differences between a single stock or 
	    portfolio's performance and the expected return over a set period of time.[1] Usually a 
	    broad index, such as the S&P 500 or a national index like the Nikkei 225, is used as a 
	    benchmark to determine the expected return.
	    </p>
	    <p class="intro"> 
	    For example if a stock increased by 5% because of some news which affected the stock price, 
	    but the average market only increased by 3% and the stock has a beta of 1, then the abnormal
	    return was 2% (5% - 3% = 2%). If the market average performs better (after adjusting for 
	    beta) than the individual stock then the abnormal return will be negative.
	    </p>
    </div>
  <%}else{ %>
  	<div><h1 class="left-top">Output</h1>
      <a href="<%=url %>" id="download">Download Report Data</a>
    </div>
    <div class="clear"></div>
    <div id="output"><img src="stockpic.jpg" width="700px" /></div>
  <%} %>
  </div>
  <div class="footer">
    <p><span class="brand">Team Just do IT</span>, formed by Chao HUANG, Chenxu ZHANG, Fengming SHI, Gelin LI, Xinyan MAO</p>
    <p class="small-text">COMP9323 E-Commerce Project Demo</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>