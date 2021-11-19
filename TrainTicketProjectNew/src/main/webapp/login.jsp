<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login form</title>
    <link rel="stylesheet" href="Style1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body>

<div class="container">
    <img src="irctc2.png"  style="width:50%">
    <header>Login Form</header>
    <form action="availabletrains.jsp">
        <div class="input-field">
            <input type="text" required>
            <label>Email or Username</label>
        </div>
        <div class="input-field">
            <input class="pswrd" type="password" required>
            <span class="show">SHOW</span>
            <label>Password</label>
        </div>
        <div class="button">
            <div class="inner"></div>
            <submit><button>LOGIN</button></submit>
        </div>
    </form>
    <div class="auth">
        Or login with
    </div>
    <div class="links">
        <div class="facebook">
            <i class="fab fa-facebook-square"><span><a href="https://www.facebook.com/">Facebook</a></span></i>
        </div>
        <div class="google">
            <i class="fab fa-google"><span><a href="https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin">Google</a></span></i>
        </div>
    </div>
    <form action="signup.jsp">
        <div class="signup">
            New account? <submit><button>Signup now</button></submit>
        </div>
    </form>
</div>
<script>
    var input = document.querySelector('.pswrd');
    var show = document.querySelector('.show');
    show.addEventListener('click', active);
    function active(){
        if(input.type == "password"){
            input.type = "text";
            show.style.color = "blue";
            show.textContent = "HIDE";
        }else{
            input.type = "password";
            show.textContent = "SHOW";
            show.style.color = "black";
        }
    }
</script>
</body>
</html>