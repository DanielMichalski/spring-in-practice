<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form action="" modelAttribute="account">
    <h1>Rejestracja nowego użytkownika</h1>

    <table>
        <tr>
            <td>Nazwa użytkownika:</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Hasło:</td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td>Powtórz hasło:</td>
            <td><form:password path="confirmPassword"/></td>
        </tr>
        <tr>
            <td>Adres e-mail:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Imię:</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Nazwisko:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td colspan="2"><form:checkbox path="marketingOk"/> Wysyłaj informacje o produktach</td>
        </tr>
        <tr>
            <td colspan="2"><form:checkbox path="acceptTerms"/> Zgadzam się na <a href="#">zasady użytkownika</a>.</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Zarejestruj"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
