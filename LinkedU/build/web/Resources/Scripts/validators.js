function testStrength(passwordElement) {

    var passTxt = passwordElement.value;
    var mdiv = document.getElementById("passwordMessage");
        if (passTxt.length > 0 && passTxt.length < 3) {
            mdiv.style.display = "inline";
            mdiv.innerHTML = "<span style=\"color:red\">Password needs to be greator than 2 characters</span>";
        }
        if (passTxt.length > 24) {
            mdiv.style.display = "inline";
            mdiv.innerHTML = "<span style=\"color:red\">Password needs to be less than 25 characters</span>";
        }
        else {
            mdiv.style.display = "none";
        }
}
