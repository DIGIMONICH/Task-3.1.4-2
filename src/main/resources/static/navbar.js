navbar();

function navbar() {
    fetch("http://localhost:2020/api/user").then(response => response.json()).then(user => {
        document.getElementById("navUserEmail").innerHTML = "&nbsp;&nbsp;&nbsp;" + "<b>" + user.username + "</b>" + " with roles: " + user.rolesAsString;
    })
}
