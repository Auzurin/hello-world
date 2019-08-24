/**
 * 
 */



window.onload = function() {
	getEmpInfo();
}


function getEmpInfo() {

	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			let emp = JSON.parse(xhttp.responseText);
			setValues(emp);
		}
	}

	xhttp.open("GET", 'http://localhost:8080/NirojDylanProject/html/employee_reimbursment.do',
			true);
	xhttp.send();
	
}



function setEmployeeUsername(emp){
	document.getElementById("username").innerHTML = "Employee's Username is " + emp.username;
	document.getElementById("password").innerHTML = "Employee's password is " + emp.password;
}

function getFormInfo() {            // for populating forms into Manager dashboard

	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			let form = JSON.parse(xhttp.responseText);
			console.log(xhttp);
			setValues(emp);
		}
	}

	xhttp.open("GET", 'http://localhost:8080/NirojDylanProject/html/employee_reimbursment.do',
			true);
	xhttp.send();
}


function setFormValues(form)





