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
  <div class="header"><a href="#"><img src="" alt="Insert Logo Here" name="Insert_logo" width="180" height="90" id="Insert_logo" style="background: #C6D580; display:block;" /></a> 
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
    <p>&nbsp;</p>
  </div>
  <div class="content">
    <h1>Output</h1>
  <%if(url==null){ %>
    <div></div>
  <%}else{ %>
  	<div><%=url %></div>
  <%} %>
  </div>
  <div class="footer">
    <p><span class="brand">Team Just do IT</span>, formed by Chao HUANG, Chenxu ZHANG, Fengming SHI, Gelin LI, Xinyan MAO</p>
    <p class="small-text">COMP9323 E-Commerce Project Demo</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>