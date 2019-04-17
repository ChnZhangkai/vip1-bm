
		function showImage(node,cxt) {
			var imageHtml = '<a href="javascript:void(0)" onclick="showImage(this,\''+cxt+'\');"><img id="yanZhengMa" src="'+cxt+'/platform/authImg?rand=' + Math.random() + '" width="120" height="25"/></a>';
			$(node).replaceWith(imageHtml);
		}
		
		function submitFunc(){
			// 验证账号是否存在
			var userName = $("#login_username").val();
			if (userName == "") {
				common_modals.alert("请输入登录账号");
				return;
			}
			
			// 验证账号是否可用
			var data = "";
			$.ajax({
				type : "post",
				url : encodeURI(encodeURI(cxt + "/platform/login/userName/" + userName)),
				headers : {"localePram" : localePram}, // 所有请求加上当前语言标示环境
				data : {},
				dataType : "json",
				contentType: "application/x-www-form-urlencoded; charset=UTF-8",
				async: false,
				cache: false,
				success:function(ret){
					data = ret;
				}
			});
			
			if(data.result == 0){
				common_modals.alert("输入账号不存在");
				return;
				
			} else if(data.result == 1){
				common_modals.alert("账户已停用");
				return;
				
			}  else if(data.result == 2){
				var stopDate = data.stopDate;
				var hour = data.hour;
				common_modals.alert("账号已锁定，锁定时间" + stopDate + "，锁定小时数" + hour);
				return;
			}
			
			// 密钥加密
			var publicKey = data.publicKey;
			var passNode = $("#login_password");
			var passWord = passNode.val();
			var encrypt = new JSEncrypt();
	        encrypt.setPublicKey(publicKey);
	        var passEncode = encrypt.encrypt(passWord);
	        passNode.val(passEncode);
	        
			// 提交表单
			$("#loginForm").submit();
		}

		jQuery(document).ready(function() {
			// 初始化页面焦点
			var userName = $("#login_username");
			var passWord = $("#login_password");
			if (userName.val() == "") {
				userName.focus();
			} else if (passWord.val() == "") {
				passWord.focus();
			} else {
				$("#login_authCode").focus();
			}

			

			// 键盘回车事件
			var tds = $("html");
			tds.keydown(function(event) {
				var myEvent = event || window.event; //解决不同浏览器获取事件对象的差异
				switch (myEvent.keyCode) {
				case 13://回车事件
					submitFunc();
					break;
				}
			});
		});