<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
  <head>
    <title><g:layoutTitle default="KneeFixer" /></title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/></div>
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}"/></div>

  
  <script type="text/javascript" src="${createLinkTo(dir:'js/custom', file:'cufon-yui.js')}"></script>
  <script type="text/javascript" src="${createLinkTo(dir:'js/custom', file:'arial.js')}"></script>
  <script type="text/javascript" src="${createLinkTo(dir:'js/custom', file:'cuf_run.js')}"></script>
  <script type="text/javascript" src="${createLinkTo(dir:'js/custom', file:'jquery-1.3.2.min.js')}"></script>
  <script type="text/javascript" src="${createLinkTo(dir:'js/custom', file:'radius.js')}"></script>
  <g:javascript>
    $.noConflict();
  </g:javascript>
</head>
<body>
  <div class="main">
    <div class="header">
      <g:render template="/layouts/header"/>
    </div>

    <div class="content">
      <div class="content_resize">
        <div class="mainbar">
          <g:layoutBody/>
        </div>

        <div class="sidebar">
          <g:render template="/layouts/rightPanel"/>
        </div>

        <div class="clr"></div>
      </div>
    </div>

    <div id="footer">
      <g:render template="/layouts/footer"/>
    </div>
  </div>

</body>
</html>