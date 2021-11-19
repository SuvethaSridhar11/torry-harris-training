<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registeration form</title>
    <link rel="stylesheet" href="Style2.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body>
<div class="container">
    <header>Register Now!</header>
    <form>
        <div class="input-field">
            <input type="text" required>
            <label>First Name</label>
        </div>
        <div class="input-field">
            <input type="text" required>
            <label>Last Name</label>
        </div>
        <div class="input-field">
            <input type="text" required>
            <label>Email or Username</label>
        </div>
        <div class="input-field">
            <input class="pswrd" type="Password" required>

            <label>Password</label>
        </div>
        <div class="input-field">
            <input class="pswrd" type="Password"  required>

            <label>Confirm Password</label>
        </div>

        <div class="button">
            <div class="inner"></div>
            <submit><button><a href="login.jsp">Create Account</a></button></submit>
        </div>
    </form>
    <div class="login">
        Already have an account? <a href="login.jsp">login now</a>
    </div>
</div>
</body>
</html>