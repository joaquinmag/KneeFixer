<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Diagnóstico</title>
    <meta name="layout" content="main" />
  </head>
  <body>
    <script type="text/javascript">
      document.getElementById('diagnostico_li').className = 'active'
    </script>
    <h2>Diagnóstico</h2>
  <g:form action="nextQuestion" enctype="multipart/form-data">

    <p>Resultado: ${lesion}</p>
  </g:form>

</body>
</html>
