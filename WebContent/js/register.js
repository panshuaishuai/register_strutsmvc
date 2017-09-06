window.onload = function() {
	var elements = document.getElementsByTagName("form")[0].elements;

	for (var i = 0; i < elements.length; i++) {
		elements[i].oninput = function(event) {
			event.target.setCustomValidity("");
		}

	}
};

function registers(form) {
	var password = form["user.password"];
	var affirmPassword = form["user.affirmPassword"];

	if (password.value != affirmPassword.value) {
		affirmPassword.setCustomValidity("登录密码必须与确认密码相同！");
		return false;
	}
	return true;
}