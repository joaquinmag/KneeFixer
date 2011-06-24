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
        <g:form action="save" enctype="multipart/form-data">
          <div class="diagnosisQuestions">
            <p>¿Qué grado de rigidez se observa en la rodilla del paciente? Alto</p>
            <p>${pregunta}</p>
            <p style="text-align: left; padding-left: 150px;">
              <g:each in="${posiblesRespuestas}" status="i" var="opcion">
              <input type="radio" name="opcion" value="${opcion}">    ${opcion}</input><br />
              </g:each>
            </p>
          </div>
          <div class="menu_nav">
            <ul style="padding-right: 75px;">
              <li class="active" id="siguiente_li"><g:link controller="diagnostico" action="index" params="${idPregunta-1}">Anterior</g:link></li>
            <!-- TODO ver si cambiando el submitButton por un link que use de parametros lo que tiene que pasar aca y que use controller y action los de el boton.
                 se logra que la UI vuelva a como estaba antes -->
              <li class="active" id="anterior_li"><a href="#"><g:submitButton name="next" class="save" value="Siguiente"/></a></li>
            </ul>
          </div>
        </g:form>
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
