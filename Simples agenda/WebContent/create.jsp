<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
/***** Conexão com o banco de dados ****/
Connection con = null;
String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://127.0.0.1:3307/dbagenda?userTimezone=true&serverTimezone=UTC";
String user = "root";
String password = "senac@senac";
/***** CRUD - CREATE ****/
try {
	Class.forName(driver);
	con = DriverManager.getConnection(url, user, password);
    //Parâmetros capturados pelo formulário
    String nome=request.getParameter("nome");
    String fone=request.getParameter("fone");
    String email=request.getParameter("email");
    String create = "insert into contatos (nome,fone,email) values('"+nome+"','"+fone+"','"+email+"')";
    con.createStatement().executeUpdate(create);
    //após o insert, redirecionar para o arquivo agenda.jsp
    response.sendRedirect("agenda.jsp");
} catch (Exception e) {
	out.println(e);
} finally {
		con.close();
}
%>

</body>
</html>