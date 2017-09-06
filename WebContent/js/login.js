function hint() {
    var user = document.getElementById("user").value;
    var pass = document.getElementById("pass").value;

    if (user === "" || pass === "") {
        alert("用户名和密码不能为空！")
        return false;
    }
    
    return true;
}

function hints() {
	document.location.href = "register";
}