<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<link href="/easyui/themes/default/easyui.css" rel="stylesheet">
<link href="/easyui/themes/icon.css" rel="stylesheet">
<script src="/easyui/jquery.min.js"></script>
<script src="/easyui/jquery.easyui.min.js"></script>


<style type="text/css">
	.footer{
		width:100%;
		text-align:center;
		line-hight:35px;
	}
	.top-bg{
		background-color:#d8e4fe;
		height:80px;
	}
</style>

<script>
	
		function addTab(title, url){
	if ($('#tabs').tabs('exists', title)){
		$('#tabs').tabs('select', title);
	} else {
		var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
		$('#tabs').tabs('add',{
			title:title,
			content:content,
			closable:true
		});
	}
}
	
</script>
</head>
<body class="easyui-layout">
	//上侧
	<div region="north" border="true" split="true" style="overflow: hidden;height: 80px;">
		<div class="top-bg"></div>
	</div>

	//下侧
	<div region="south" border="true" split="true" style="overflow: hidden;height: 40px">
		<div class="footer">版权所有：<a href=""></a></div>
    </div>

	//左侧
    <div region="west" split="true" title="导航菜单" style="width: 200px;">
		//导航栏
        <div id="aa" class="easyui-accordion" style="position: absolute; top: 27px; left: 0px; right: 0px; bottom: 0px;">

            <div title="博文管理" iconcls="icon-save" style="overflow: auto; padding: 10px;">
                <ul class="easyui-tree">
                    <li>
                        <span>Folder</span>
                        <ul>
                            <li>
                                <span>Sub Folder 1</span>
                               <ul>
                                    <li>
                                        <span><a onclick="addTab('所有学生','${pageContext.request.contextPath}/index.jsp')" href="#">所有学生</a></span>
                                   </li>
                                    <li>
                                        <span><a target="mainFrame" href="http://www.baidu.com">File 12</a></span>
                                    </li>
                                    <li>
                                        <span>File 13</span>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <span>File 2</span>
                            </li>
                            <li>
                                <span>File 3</span>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <span><a href="#">File21</a></span>
                    </li>
                </ul>
            </div>
            <div title="新闻管理" iconcls="icon-reload" selected="true" style="padding: 10px;">
                content2 
            </div>
            <div title="资源管理">
                content3 
            </div>
        </div>
    </div>

	//中部
    <div id="mainPanle" region="center" style="overflow: hidden;">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">

            <div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">

                <table id="dg" title="My Users" class="easyui-datagrid" style="height:500px"
						url="query"
						toolbar="#toolbar"
						rownumbers="true" fitColumns="true" singleSelect="true">
					<thead>
						<tr>
							<th field="students_id" width="50">First Name</th>
							<th field="name" width="50">Last Name</th>
							<th field="tel" width="50">Phone</th>
							<th field="email" width="50">Email</th>
						</tr>
					</thead>
				</table>
				<div id="toolbar">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
				</div>

            </div>

        </div>
    </div>

	
</body>
</html>