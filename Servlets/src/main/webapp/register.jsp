<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>User Registration</title></head>
<body>
    <h2>User Registration</h2>
    <form method="post" action="registerUser">
        Full name: <input type="text" name="fullname" required><br>
        E-mail: <input type="email" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        Birthday (yyyy-mm-dd): <input type="date" name="birthday"><br>
        Gender:
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female<br>
        Profession:
        <select name="profession">
            <option>Developer</option>
            <option>Tester</option>
            <option>Manager</option>
        </select><br>
        Married? <input type="checkbox" name="married"><br>
        Note: <textarea name="note"></textarea><br><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
