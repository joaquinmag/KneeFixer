<!DOCTYPE html>
<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}"/>
        
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
            <g:javascript library="prototype"/>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
        <g:javascript>
            $.noConflict();
            // Now jQuery must be accessed with 'jQuery' instead of '$'.
        </g:javascript>
    </head>
    <body>
        <g:layoutBody />
    </body>
</html>