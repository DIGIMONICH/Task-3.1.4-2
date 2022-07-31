fetch("http://localhost:2020/api/about").then(
    res=>{
        res.json().then(
            data=> {
                document.getElementById("userMail").innerText = data.mail;
                document.getElementById("roleUser").innerText = data.rolesName;
            }
        )
    }
)