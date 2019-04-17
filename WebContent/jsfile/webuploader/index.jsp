<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% 
	StringBuilder sb = new StringBuilder();
	sb.append(request.getScheme()).append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath());
	String path = sb.toString();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>文件上传</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    
	<link rel="stylesheet" href="<%=path%>/jsfile/webuploader/webuploader.css" type="text/css">
	
    <script type="text/javascript">
    	var cxt = "<%=path%>";
    </script>
    
	<script src="<%=path%>/jsfile/jquery/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=path%>/jsfile/webuploader/webuploader.js"></script>
</head>
<body>

	<div id="uploader" class="wu-example">
	    <!--用来存放文件信息-->
	    <div id="thelist" class="uploader-list"></div>
	    <div class="btns">
	        <div id="picker">选择文件</div>
	        <br/>
	        <button id="ctlBtn" class="btn btn-default">开始上传</button>
	    </div>
	</div>
	
	<br/><br/><br/>
	<br/><br/><br/>
	
	<!--dom结构部分-->
	<div id="uploader-demo">
	    <!--用来存放item-->
	    <div id="fileList" class="uploader-list"></div>
	    <div id="filePicker">选择图片</div>
	</div>
	<div style="position: relative;width: 135px;float: left;">
					<a href="javascript:void(0);" onclick="delimg(this" style="float:right;position: absolute;top: 0;right: 20px;background: #ffffff;border-radius: 0px;line-height: 20px;width: 20px;border-radius: 10px;text-align: center;">X</a>
					<img class="headerImg" style="max-width:135px;max-height:75px;width:135;height:75" >
				</div>
	
	<script type="text/javascript" charset="utf-8" src="<%=path%>/jsfile/webuploader/index.js"></script>

</body>
</html>