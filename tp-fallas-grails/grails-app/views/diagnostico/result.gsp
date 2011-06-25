<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Diagnóstico</title>
    <meta name="layout" content="main" />
  </head>
  <body>
    <script type="text/javascript">
      document.getElementById('diagnostico_li').className = 'active';       
    </script>

    <div class="${lesion.isEmpty() ? 'invisibleElement' : 'article'}">
      <h2>Diagnóstico</h2>
      <div class="clr"></div>
      <img src="${createLinkTo(dir:'images/dr/', file:'sad_doctor.jpg')}" width="100" height="185" alt="" class="fl" />
      <p>Lamentamos informar que el paciente presenta '${lesion}'. Para mayor información consulte la seccion <g:link controller="lesiones" action="index">lesiones</g:link> o a su médico de confianza.</p>
      <p>Muchas gracias por utilizar KneeFixer.</p>
    </div>

    <div class="${!lesion.isEmpty() ? 'invisibleElement' : 'article'}">
      <h2>Diagnóstico</h2>
      <div class="clr"></div>
      <img src="${createLinkTo(dir:'images/dr/', file:'h_doc.jpg')}" width="170" height="185" alt="" class="fl" />
      <p>El paciente no presenta síntomas de una lesión grave. Para mayor información consulte la seccion <g:link controller="lesiones" action="index">lesiones</g:link> o a su médico de confianza.</p>
      <p>Muchas gracias por utilizar KneeFixer.</p>
  </div>

</body>
</html>
