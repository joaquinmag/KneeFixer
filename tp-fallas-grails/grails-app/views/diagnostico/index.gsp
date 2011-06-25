<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Diagnóstico</title>
    <meta name="layout" content="main" />
  </head>
  <body>
    <style type="text/css">
      .tooltip {
        position: absolute;
        left: 10px;
        top: 10px;
        width: 300px;
        height: 300px;
        background-color: #00ff00;
      }
    </style>

    <script type="text/javascript">
      document.getElementById('diagnostico_li').className = 'active'
    </script>
    <h2>Diagnóstico</h2>

    <div class="question">
      <div class="">
        <h3>Preguntas</h3>
        <g:form enctype="multipart/form-data">
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
              <input type="radio" name="opcion" value="${opcion}" ${i == 0 ? 'checked' : ''}>    ${opcion}</input><br />
            </g:each>
            </p>
          </div>
          <div>
          <div class="menu_nav">
            <ul style="padding-right: 75px;">
              <li id="anterior_li" class="${idPregunta == 1 ? 'invisibleElement' : 'active'}"><g:actionSubmit value="Anterior" name="previous" action="previousQuestion"/></li>
              <li class="${idPregunta != 1 ? 'invisibleElement' : 'active'}" id="anterior_li"><g:actionSubmit style="${idPregunta == 1 ? 'background:gray;' : ''}" disabled="${idPregunta == 1 ? 'true' : 'false'}" value="Anterior" name="previous" action="previousQuestion"/></li>
              <li class="active" id="anterior_li"><g:actionSubmit value="Siguiente" name="next" action="nextQuestion"/></li>              
            </ul>
          </div>
            </div>
        </g:form>
        

      </div>
      
      <div style="text-align: left; padding-top:75px;">
        <h3>Valores de referencia</h3>
        <p>${ayudaPregunta}</p>
      </div>
    </div>

    <div class="injury">
      <div class="">
        <h3>Lesiones</h3>
        <ul class="diagnosisInjuries">
          <g:each in="${lesionesPosibles}" status="i" var="lesion">
            <li>${lesion.getNombre()}</li>
          </g:each>
          <g:each in="${lesionesDescartadas}" status="i" var="lesion">
            <li class="notInjury">${lesion.getNombre()}</li>
          </g:each>
        </ul>
      </div>
    </div>
  </body>
</html>
