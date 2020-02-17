var productCode = null;
var productUnit = null;
var productCount = null;
var totalPrice = null;
var customerName = null;
var customerAddress = null;
var productInsurance=null;
var customerTel = null;
var dockPeople = null;
var saleDock = null;
var addBtn = null;
var backBtn = null;
var seliverDate = null;

function priceReg (value,type){
	//value = value.replace(/[^\d.]/g,"");  //清除“数字”和“.”以外的字符
    //value = value.replace(/^\./g,"");  //验证第一个字符是数字而不是.
    //value = value.replace(/\.{2,}/g,"."); //只保留第一个. 清除多余的.
    //value = value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");//去掉特殊符号￥
    console.log(value);
    if(type=='productCount'){
        document.getElementById("totalPrice").value= (value* (document.getElementById("productInsurance").value*100)/100)
        console.log(value* document.getElementById("productInsurance").value);
    }else if(type=='productInsurance'){
        document.getElementById("totalPrice").value= (value*100* (document.getElementById("productCount").value))/100
        console.log(value* document.getElementById("productCount").value);
    }
    if(value.indexOf(".")>0){
        value = value.substring(0,value.indexOf(".")+3);
    }
    console.log(value);
	return value;
}
function accMul(arg1,arg2){
    var m=0,s1=arg1.toString(),s2=arg2.toString();
    try{
        m+=s1.split(".")[1].length;
    }catch(e){
    }
    try{
        m+=s2.split(".")[1].length;
    }catch(e){
    }
    return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m);
}
//获取当前时间  年月日
function getDate() {
    var myDate = new Date();
    //获取当前年
    var year = myDate.getFullYear();
    //获取当前月
    var month = myDate.getMonth() + 1;
    //获取当前日
    var date = myDate.getDate();

    //获取当前时间
    var now = year + conver(month) + conver(date);
    return now;
//日期时间处理
}
function conver(s) {
    return s < 10 ? '0' + s : s;
}
//获取随机数
function randomString(len) {
    len = len || 32;
    var $chars = '0123456789';    /****默认去掉了容易混淆的字符oOLl,9gq,Vv,Uu,I1****/
    var maxPos = $chars.length;
    var pwd = '';
    for (i = 0; i < len; i++) {
        pwd += $chars.charAt(Math.floor(Math.random() * maxPos));
    }
    return pwd;
}

$(function(){
    //获取年月日
    var now=getDate();
    //获取4位随机数
    var num=randomString(6);
    document.getElementById("billCode").value= now+"-"+num;
    productCode = $("#productCode");
	productUnit = $("#productUnit");
	productCount = $("#productCount");
	totalPrice = $("#totalPrice");
    customerName = $("#customerName");
    customerAddress = $("#customerAddress");
    customerTel = $("#customerTel");
    dockPeople = $("#dockPeople");
    saleDock = $("#saleDock");
    productInsurance=$("#productInsurance");

	addBtn = $("#add");
	backBtn = $("#back");
    seliverDate = $("#seliverDate");
	//初始化的时候，要把所有的提示信息变为：* 以提示必填项，更灵活，不要写在页面上
    productCode.next().html("*");
    productInsurance.next().html("*");
	productUnit.next().html("*");
	productCount.next().html("*");
	totalPrice.next().html("*");
    customerName.next().html("*");
    customerAddress.next().html("*");
    customerTel.next().html("*");
    dockPeople.next().html("*");
    saleDock.next().html("*");
    seliverDate.next().html("*");
	
	$.ajax({//获得商品列表
		type:"GET",
		url:path+"/product/all",//请求的url
		//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			if(data != null){
				$("#productCode").html("");
				var options = "<option value=\"0\">请选择</option>";
				for(var i = 0; i < data.length; i++){
					options += "<option value=\""+data[i].productCode+"\">"+data[i].productName+"</option>";
				}
				$("#productCode").html(options);
			}
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			validateTip(productCode.next(),{"color":"red"},imgNo+" 获取供应商列表error",false);
		}
	});
	/*
	 * 验证
	 * 失焦\获焦
	 * jquery的方法传递
	 */
/*	billCode.on("blur",function(){
		if(billCode.val() != null && billCode.val() != ""){
			validateTip(billCode.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(billCode.next(),{"color":"red"},imgNo+" 编码不能为空，请重新输入",false);
		}
	}).on("focus",function(){
		//显示友情提示
		validateTip(billCode.next(),{"color":"#666666"},"* 请输入订单编码",false);
	}).focus();*/

    productCode.on("focus",function(){
		validateTip(productCode.next(),{"color":"#666666"},"* 请选择商品名称",false);
	}).on("blur",function(){
		if(productCode.val() != null && productCode.val() > 0){
			validateTip(productCode.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(productCode.next(),{"color":"red"},imgNo+" 商品名称不能为空，请重新输入",false);
		}
		
	});
	
	productUnit.on("focus",function(){
		validateTip(productUnit.next(),{"color":"#666666"},"* 请输入商品单位",false);
	}).on("blur",function(){
		if(productUnit.val() != null && productUnit.val() != ""){
			validateTip(productUnit.next(),{"color":"green"},imgYes,true);
		}else{
			validateTip(productUnit.next(),{"color":"red"},imgNo+" 单位不能为空，请重新输入",false);
		}
		
	});

    productCount.on("focus",function(){
        validateTip(productCount.next(),{"color":"#666666"},"* 请输入商品数量",false);
    }).on("blur",function(){
        if(productCount.val() != null && productCount.val()  != ""){
            var pattern=/^\+?[1-9][0-9]*$/;
            if (pattern.test(productCount.val())==false) {
                validateTip(productCount.next(), {"color": "red"}, imgNo + " 商品数量格式不对，请重新输入", false);
            } else{
                this.value = priceReg(this.value, 'productCount');
                validateTip(productCount.next(),{"color":"green"},imgYes,true);
            }
        }else{
            validateTip(productCount.next(),{"color":"red"},imgNo+" 商品数量不能为空，请重新输入",false);
        }

    });
    productInsurance.on("focus",function(){
        validateTip(productInsurance.next(),{"color":"#666666"},"* 请输入商品单价",false);
    }).on("blur",function(){
        if(productInsurance.val() != null && productInsurance.val()  != ""){
            var pattern = /^(([^0][0-9]+|0)\.([0-9]{1,2})$)|^([^0][0-9]+|0)$/;
            console.log(pattern.test(productInsurance.val()));
            if (pattern.test(productInsurance.val())==false) {
                validateTip(productInsurance.next(),{"color":"red"},imgNo+" 商品单价格式不对，请重新输入",false);
            } else {
                validateTip(productInsurance.next(),{"color":"green"},imgYes,true);
                if( productCount.val()!= null && productCount.val()  != ""){
                    this.value = priceReg(this.value,'productInsurance');
                }
            }
        }else{
            validateTip(productInsurance.next(),{"color":"red"},imgNo+" 商品单价不能为空，请重新输入",false);
        }

    });
	
	/*totalPrice.on("focus",function(){
		validateTip(totalPrice.next(),{"color":"#666666"},"* 请输入大于0的正自然数，小数点后保留2位",false);
	}).on("keyup",function(){
		this.value = priceReg(this.value);
	}).on("blur",function(){
		this.value = priceReg(this.value);
	});*/


    customerName.on("focus",function(){
        validateTip(customerName.next(),{"color":"#666666"},"* 请输入客户名称",false);
    }).on("blur",function(){
        if(customerName.val() != null && customerName.val() != ""){
            validateTip(customerName.next(),{"color":"green"},imgYes,true);
        }else{
            validateTip(customerName.next(),{"color":"red"},imgNo+" 客户名称不能为空，请重新输入",false);
        }

    });
    customerAddress.on("focus",function(){
        validateTip(customerAddress.next(),{"color":"#666666"},"* 请输入客户地址",false);
    }).on("blur",function(){
        if(customerAddress.val() != null && customerAddress.val() != ""){
            validateTip(customerAddress.next(),{"color":"green"},imgYes,true);
        }else{
            validateTip(customerAddress.next(),{"color":"red"},imgNo+" 客户地址不能为空，请重新输入",false);
        }

    });
    customerTel.on("focus",function(){
        validateTip(customerTel.next(),{"color":"#666666"},"* 请输入联系方式",false);
    }).on("blur",function(){
        if(customerTel.val() != null && customerTel.val() != ""){
            validateTip(customerTel.next(),{"color":"green"},imgYes,true);
        }else{
            validateTip(customerTel.next(),{"color":"red"},imgNo+" 联系方式不能为空，请重新输入",false);
        }

    });
    dockPeople.on("focus",function(){
        validateTip(dockPeople.next(),{"color":"#666666"},"* 请输入对接人",false);
    }).on("blur",function(){
        if(dockPeople.val() != null && dockPeople.val() != ""){
            validateTip(dockPeople.next(),{"color":"green"},imgYes,true);
        }else{
            validateTip(dockPeople.next(),{"color":"red"},imgNo+" 对接人不能为空，请重新输入",false);
        }

    });

    saleDock.on("focus",function(){
        validateTip(saleDock.next(),{"color":"#666666"},"* 请输入销售对接人",false);
    }).on("blur",function(){
        if(saleDock.val() != null && saleDock.val() != ""){
            validateTip(saleDock.next(),{"color":"green"},imgYes,true);
        }else{
            validateTip(saleDock.next(),{"color":"red"},imgNo+" 销售对接人不能为空，请重新输入",false);
        }

    });
    seliverDate.bind("focus",function(){
        validateTip(seliverDate.next(),{"color":"#666666"},"* 点击输入框，选择日期",false);
    }).bind("blur",function(){
        if(seliverDate.val() != null && seliverDate.val() != ""){
            validateTip(seliverDate.next(),{"color":"green"},imgYes,true);
        }else{
            validateTip(seliverDate.next(),{"color":"red"},imgNo + " 选择的日期不正确,请重新输入",false);
        }
    });
	
	addBtn.on("click",function(){
		if(productCode.attr("validateStatus") != "true"){
            productCode.blur();
		}else if(productCount.attr("validateStatus") != "true"){
            productCount.blur();
        }else if(productCount.attr("validateStatus") != "true"){
            productCount.blur();
        }else if(customerName.attr("validateStatus") != "true"){
            customerName.blur();
        }else if(customerAddress.attr("validateStatus") != "true"){
            customerAddress.blur();
        }else if(customerTel.attr("validateStatus") != "true"){
            customerTel.blur();
        }else if(dockPeople.attr("validateStatus") != "true"){
            dockPeople.blur();
        }else if(saleDock.attr("validateStatus") != "true"){
            saleDock.blur();
        }else{
			if(confirm("是否确认提交数据")){
				$("#billForm").submit();
			}
		}
	});
	
	backBtn.on("click",function(){
		if(referer != undefined 
			&& null != referer 
			&& "" != referer
			&& "null" != referer
			&& referer.length > 4){
		 window.location.href = referer;
		}else{
			history.back(-1);
		}
	});
});