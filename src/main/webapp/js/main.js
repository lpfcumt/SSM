$.validator.setDefaults({
    submitHandler: function(form) {
		var url="login?"+$('#login_form').serialize();
		var url2="sendLogin?"+$('#login_form').serialize();
		var result=0;
      $.ajax({
			url:url,
			data:{},
			type:'post',
			dataType:'json',
			success:function(data){
				if(data.success){
					form.submit();
					
				}else{
					alert("02");
				}
			}

	  });
     
    }


});
function login(){
	$('#login_form').submit();
}
$().ready(function() {
	$("#login_form").validate({
		  err: {
		            container: 'tooltip'
		        },
		icon: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
		rules: {
			stuents_id: "required",
			password: {
				required: true,
				minlength: 6
			},
		},
		messages: {
			students_id: "请输入姓名",
			password: {
				required: "请输入密码",
				minlength: jQuery.format("密码不能小于{0}个字 符")
			},
		}
	});
	$("#register_form").validate({
		rules: {
			username: "required",
			password: {
				required: true,
				minlength: 5
			},
			rpassword: {
				equalTo: "#register_password"
			},
			email: {
				required: true,
				email: true
			}
		},
		messages: {
			username: "请输入姓名",
			password: {
				required: "请输入密码",
				minlength: jQuery.format("密码不能小于{0}个字 符")
			},
			rpassword: {
				equalTo: "两次密码不一样"
			},
			email: {
				required: "请输入邮箱",
				email: "请输入有效邮箱"
			}
		}
	});
});
$(function() {
	$("#register_btn").click(function() {
		$("#register_form").css("display", "block");
		$("#login_form").css("display", "none");
	});
	$("#back_btn").click(function() {
		$("#register_form").css("display", "none");
		$("#login_form").css("display", "block");
	});
});