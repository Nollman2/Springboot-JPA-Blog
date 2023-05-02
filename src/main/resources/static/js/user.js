//시작
let index ={
	//init() 해당 function()들이 시작됨
	init: function() {
		$("#btn-save").on("click",()=>{					
			this.save();
		});
	},
	
	
	save : function() {
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		};
		
		$.ajax({
			type:"POST",
			url:"/auth/joinProc", 			
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){		
			//정상작동시 리턴된 ResponseDto<Integer>(HttpStatus.OK.value(), 1)를 받음	
			//ResponseDto의 state는 HttpStatus.OK.value()
			//ResponseDto의 data는 1
			console.log(resp.state);				
			alert("회원가입이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	}
	
	
}
//init()의 function()들 종료
index.init();