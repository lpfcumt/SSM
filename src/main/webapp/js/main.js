

$().ready(function() {
	/*判断账号密码是否正确*/
	function login(){
		var bv=$("#login_form").data('bootstrapValidator');
		bv.validate();
		if(bv.isValid()){
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
						/*提交登录*/
						$('#login_form').submit();
						return true;
						
					}else{
						alert("02");
					}
				}

		  });
			
		}
		return false;
		
	}
	/*设置登录from的表单验证*/
	$("#login_form").bootstrapValidator({
//			message: 'This value is not valid',
			err: {
		            container: 'tooltip'
		        },
	        　		feedbackIcons: {
	            　　　　　　　　valid: 'glyphicon glyphicon-ok',
	            　　　　　　　　invalid: 'glyphicon glyphicon-remove',
	            　　　　　　　　validating: 'glyphicon glyphicon-refresh'
	        　　　　　　　　   },
	        fields: {
	            students_id: {
	                message: '用户名验证失败',
	                validators: {
	                    notEmpty: {
	                        message: '用户名不能为空'
	                    },
	                    stringLength: {
                            min: 6,
                            max: 18,
                            message: '用户名长度必须在6到18位之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '用户名只能包含大写、小写、数字和下划线'
                        }
	                    
	                }
	            },
	            password: {
	                validators: {
	                    notEmpty: {
	                        message: '密码不能为空'
	                    },
	                    stringLength: {
                            min: 6,
                            max: 18,
                            message: '密码长度必须在6到18位之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '密码只能包含大写、小写、数字和下划线'
                        }
	                }
	            }
	        }
	});
	
	
	/*注册form的表单验证*/
	$("#register_form").bootstrapValidator({
		err: {
            container: 'tooltip'
        },
    　		feedbackIcons: {
        　　　　　　　　valid: 'glyphicon glyphicon-ok',
        　　　　　　　　invalid: 'glyphicon glyphicon-remove',
        　　　　　　　　validating: 'glyphicon glyphicon-refresh'
    　　　　　　　　   },
        fields: {
           students_id: {
               message: '用户名验证失败',
               validators: {
                   notEmpty: {
                       message: '用户名不能为空'
                   },
                   stringLength: {
                       min: 6,
                       max: 18,
                       message: '用户名长度必须在6到18位之间'
                   },
                   regexp: {
                       regexp: /^[a-zA-Z0-9_]+$/,
                       message: '用户名只能包含大写、小写、数字和下划线'
                   }
                   
               }
           },
           password: {
               validators: {
                   notEmpty: {
                       message: '密码不能为空'
                   },
                   stringLength: {
                       min: 6,
                       max: 18,
                       message: '密码长度必须在6到18位之间'
                   },
                   regexp: {
                       regexp: /^[a-zA-Z0-9_]+$/,
                       message: '密码只能包含大写、小写、数字和下划线'
                   }
               }
           },
           repassword:{
        	   validators: {
        		   notEmpty:{
        			   message: '确认密码不能为空'
        		   },
        		   stringLength: {
        			   min: 6,
        			   max: 18,
        			   message: '确认密码不正确'
        		   }
        	   }
           },
		   email: {
			   validators: {
				   notEmpty: {
					   message: '邮箱不能为空'
				   },
				   regexp: {
					   regexp:  /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/,
					   message: '邮箱格式有误'
				   }

			   }
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