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
        <g:form action="nextQuestion" enctype="multipart/form-data">
          <g:hiddenField name="idPregunta" value="${idPregunta}" /> 
          <div class="diagnosisQuestions">
            <ol>
              <g:each in="${respuestas}" status="i" var="respuesta">
                <li>${respuesta.descripcion} - ${respuesta.respuesta}</li>
              </g:each>
            </ol>
            
            <p>${pregunta}</p>
            <p style="text-align: left; padding-left: 150px;">
            <g:each in="${posiblesRespuestas}" status="i" var="opcion">
              <input type="radio" name="opcion" value="${opcion}">    ${opcion}</input><br />
            </g:each>
            </p>
          </div>
          <div class="menu_nav">
            <ul style="padding-right: 75px;">
              <li class="active" id="anterior_li"><g:submitButton name="next" value="Siguiente"/></li>
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
