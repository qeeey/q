<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<base href="<%=basePath%>">
<head>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #F8F9FA;
}


-->
</style>

<link href="images/skin.css" rel="stylesheet" type="text/css" />
<script>

//翻页  pageNo:隐藏域控件名  formName：要提交的表单名 pageno:页码
function goto(pageNo,formName,pageno){
	document.getElementById(pageNo).value=pageno;
	submitFrom(formName);
}

//提交form
function submitFrom(formName){
	var _form=document.getElementById(formName);
	_form.submit();
}

</script>
 	
 	

</head>

<body>
<form action="" id="_form" method="post" >
	                <table width="100%" border="1" cellpadding="0" style="margin-top:5px;" cellspacing="0">
	                <tr class="datalist_head" >
	                		<td class="left_bt2" align="center" width="10%">序号</td>
                        	<td class="left_bt2" align="center" width="10%">真实姓名</td>
                      </tr>
                      
					<s:iterator id="us" value="pageInfo.result" status="st">
					 <tr align=center > 
					 	 <td align="center" class="left_txt">${st.index+1}</td>
						 <td align="center" class="left_txt">${us.username}</td>
					</tr>
					</s:iterator>
		
					<tr >
						<td align="center" class="left_txt" colspan="11">
							<div style="float: right;">
							  <input type="hidden" id="pageInfo.currentPage" name="pageInfo.currentPage" value="${pageInfo.currentPage}" />
								共${pageInfo.pages }页(${pageInfo.rows }条记录 )&nbsp;
								当前第 <label > ${pageInfo.currentPage } </label> 页&nbsp;
								<font color=#808080><a  href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.firstPage }')">第一页</a></font>&nbsp;
								<font color=#808080><a  href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.prevPage }')">上一页</a></font>&nbsp;
								<font color=#808080><a  href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.nextPage }')">下一页</a></font>&nbsp;
								<font color=#808080><a  href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.lastPage }')">最后一页</a></font>
							</div>
						</td>
					</tr>
   </table>


</form>


</body>
</html>
