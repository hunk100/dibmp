$(function(){
	$("button[id^=out-]").each(function(){
		$(this).on("click",function(){
			cid = this.id.split("-")[1] ;
			console.log(cid);
			
			$.ajax({
				type:"POST",
				url:"pages/back/admin/goods/preDelivery",
				data:{mid:mid,gid:gid},
				dataType:"json",
				success:function(data) {
					flag = data;
					console.log(data);
					operateAlert(true,"待出库商品添加成功！","待出库商品添加失败！") ;
				}
			});
		}) ;
	}) ;
	$("span[id^=storage-]").each(function(){
		$(this).on("click",function(){
			mid = this.id.split("-")[1] ;
			$("#goodsRecordInfo").modal("toggle") ; 
		}) ;
	}) ;
	$("span[id^=mid-]").each(function(){
		$(this).on("click",function(){
			mid = this.id.split("-")[1] ;
			$("#memberInfo").modal("toggle") ;
		}) ;
	}) ;
})