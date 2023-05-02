//시작
let index ={
	//init() 해당 function()들이 시작됨
	init: function() {
		$("#btn-save").on("click",()=>{					
			this.save();
		});
	}
	
}
//init()의 function()들 종료
index.init();