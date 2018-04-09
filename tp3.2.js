

function validation(){
	testchamp();
	nom();
	age();
	tel();
	birth();
}

function testchamp()
{
	if ((document.getElementById("nom").value == "") ||
		(document.getElementById("age").value == "") ||
		(document.getElementById("telephone").value == "") ||
		(document.getElementById("naissance").value == ""))
	{
		alert("Champ vide");
	}
}
