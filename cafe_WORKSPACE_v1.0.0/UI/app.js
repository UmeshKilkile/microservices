$(document).ready(function(){
    
	const ZUUL_URL = "http://localhost:8006";
	
	$('#b1').click(function(){
		$('#renderList1').empty();
        $.get(ZUUL_URL + "/api/rest/hallimane/items", function(data, status){
        	
        	var arr = new Array(data.data.length);
        	for(var i = 0; i < data.data.length; i++){
        		arr[i] = data.data[i].name;
        	}
        	
        	var ul = document.createElement('ul');
            ul.setAttribute('id','proList');
          
            productList = arr;

            document.getElementById('renderList1').appendChild(ul);
            productList.forEach(renderProductList);

            function renderProductList(element, index, arr) {
                var li = document.createElement('li');
                li.setAttribute('class','item');
                ul.appendChild(li);
                li.innerHTML=li.innerHTML + element;
            }
        });
    });
	
	$('#b2').click(function(){
		$('#renderList2').empty();
        $.get(ZUUL_URL + "/api/rest/hallimane/itemsWithPrice", function(data, status){
        	
        	var arr = new Array(data.data.length);
        	for(var i = 0; i < data.data.length; i++){
        		arr[i] = data.data[i].name + " - <span>&#8377;</span> " + data.data[i].price;
        	}
        	
        	var ul = document.createElement('ul');
            ul.setAttribute('id','proList');
          
            productList = arr;

            document.getElementById('renderList2').appendChild(ul);
            productList.forEach(renderProductList);

            function renderProductList(element, index, arr) {
                var li = document.createElement('li');
                li.setAttribute('class','item');
                ul.appendChild(li);
                li.innerHTML=li.innerHTML + element;
            }
        });
    });
	
	$('#b3').click(function(){
		$('#renderList3').empty();
        $.get(ZUUL_URL + "/api/rest/growfit/items", function(data, status){
        	
        	var arr = new Array(data.data.length);
        	for(var i = 0; i < data.data.length; i++){
        		arr[i] = data.data[i].name;
        	}
        	
        	var ul = document.createElement('ul');
            ul.setAttribute('id','proList');
          
            productList = arr;

            document.getElementById('renderList3').appendChild(ul);
            productList.forEach(renderProductList);

            function renderProductList(element, index, arr) {
                var li = document.createElement('li');
                li.setAttribute('class','item');
                ul.appendChild(li);
                li.innerHTML=li.innerHTML + element;
            }
        });
    });
	
	$('#b4').click(function(){
		$('#renderList4').empty();
        $.get(ZUUL_URL + "/api/rest/growfit/itemsWithPrice", function(data, status){
        	
        	var arr = new Array(data.data.length);
        	for(var i = 0; i < data.data.length; i++){
        		arr[i] = data.data[i].name + " - <span>&#8377;</span> " + data.data[i].price;
        	}
        	
        	var ul = document.createElement('ul');
            ul.setAttribute('id','proList');
          
            productList = arr;

            document.getElementById('renderList4').appendChild(ul);
            productList.forEach(renderProductList);

            function renderProductList(element, index, arr) {
                var li = document.createElement('li');
                li.setAttribute('class','item');
                ul.appendChild(li);
                li.innerHTML=li.innerHTML + element;
            }
        });
    });
	
	$('#b5').click(function(){
		$('#renderList5').empty();
        $.get(ZUUL_URL + "/api/rest/ovenfresh/items", function(data, status){
        	
        	var arr = new Array(data.data.length);
        	for(var i = 0; i < data.data.length; i++){
        		arr[i] = data.data[i].name;
        	}
        	
        	var ul = document.createElement('ul');
            ul.setAttribute('id','proList');
          
            productList = arr;

            document.getElementById('renderList5').appendChild(ul);
            productList.forEach(renderProductList);

            function renderProductList(element, index, arr) {
                var li = document.createElement('li');
                li.setAttribute('class','item');
                ul.appendChild(li);
                li.innerHTML=li.innerHTML + element;
            }
        });
    });
	
	$('#b6').click(function(){
		$('#renderList6').empty();
        $.get(ZUUL_URL + "/api/rest/ovenfresh/itemsWithPrice", function(data, status){
        	
        	var arr = new Array(data.data.length);
        	for(var i = 0; i < data.data.length; i++){
        		arr[i] = data.data[i].name + " - <span>&#8377;</span> " + data.data[i].price;
        	}
        	
        	var ul = document.createElement('ul');
            ul.setAttribute('id','proList');
          
            productList = arr;

            document.getElementById('renderList6').appendChild(ul);
            productList.forEach(renderProductList);

            function renderProductList(element, index, arr) {
                var li = document.createElement('li');
                li.setAttribute('class','item');
                ul.appendChild(li);
                li.innerHTML=li.innerHTML + element;
            }
        });
    });
});