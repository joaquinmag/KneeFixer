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

    <div class="question">
      <div class="">
        <h3>Preguntas</h3>
        <div class="diagnosisQuestions">
          <p>¿Qué grado de rigidez se observa en la rodilla del paciente? Alto</p>

          <p>${pregunta}</p>
          <p style="text-align: left; padding-left: 150px;">
            <g:each in="${posiblesRespuestas}" status="i" var="opcion">
            <input type="radio" name="dolor" value="${opcion}">    ${opcion}</input>
            </g:each>
          </p>
        </div>
        <div class="menu_nav">
          <ul style="padding-right: 75px;">
            <li class="active" id="siguiente_li"><a href="#">Anterior</a></li>
            <li class="active" id="anterior_li"><a href="#">Siguiente</a></li>
          </ul>
        </div>
      </div>
    </div>

    <div class="injury">
      <div class="">
        <h3>Lesiones</h3>
        <ul class="diagnosisInjuries">
          <li class="notInjury">Ruptura del LCA</li>
          <li class="notInjury">Ruptura del LCP</li>
          <li>Ruptura del LCA y LCP</li>
          <li>Ruptura de Menisco</li>
          <li>Artritis de la rodilla</li>
          <li>Tendinitis Rotuliana</li>
        </ul>
      </div>
    </div>

  </body>
</html>
