<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lesiones</title>
    <meta name="layout" content="main" />
  </head>
  <body>

    <script type="text/javascript">
      
      document.getElementById('lesiones_li').className = 'active'
      var curr_element = 'ligamento';
        
      function visibility(new_element)
      {
          document.getElementById(curr_element).className = 'invisibleElement'
          document.getElementById(new_element).className = 'visibleElement'
          
          document.getElementById(curr_element + '_li').className = ''
          document.getElementById(new_element + '_li').className = 'active'
            
          curr_element = new_element
      }
    </script>

    <div class="menu_nav" style="float: none">
      <ul>
        <li id="ligamento_li" class="active"><a href="#" onmouseover="visibility('ligamento');">Ligamentos</a></li>
        <li id="tendinitis_li"><a href="#" onmouseover="visibility('tendinitis');">Tendinitis</a></li>
        <li id="meniscos_li"><a href="#" onmouseover="visibility('meniscos');">Meniscos</a></li>
        <li id="artritis_li"><a href="#" onmouseover="visibility('artritis');">Artritis</a></li>
      </ul>
    </div>

    <div id="ligamento" class="article">
      <h2>Ligamentos</h2>
      <div class="clr"></div>
      <img src="${createLinkTo(dir:'images/dr/', file:'pix1_1.jpg')}" width="170" height="185" alt="" class="fl" />

      <b><ul style="padding-left: 210px;">
          <li>¿Qué es una lesión de ligamentos cruzados?</li>
        </ul></b>
      <p>Se llama ligamento cruzado a cada una de las dos cuerdas que unen el hueso del fémur con el hueso de la tibia, en la profundidad de la articulación de la rodilla. El cruzado anterior comienza en la parte trasera del fémur y acaba en la parte delantera de la tibia. El cruzado posterior tiene una dirección contraria, es decir, comienza en la parte delantera del hueso femoral, y acaba en la parte trasera del tibial. En cambio, los ligamentos colaterales se disponen por fuera de la articulación.</p>
      <p>La función de estas cuerdas es dar estabilidad a la rodilla, evitando que la pierna se mueva hacia delante o hacia atrás, cuando la sometemos a un esfuerzo.</p> 
      <p>Las lesiones de los ligamentos se llaman esguinces, y constituyen un desgarro de éstos. Pueden ser de alguna de sus fibras (rotura parcial) o de todas (rotura completa). La gravedad del esguince la indica el grado de movilidad anormal de la rodilla al explorarla.</p>

      <b><ul style="padding-left: 15px;">
          <li>¿Por qué se produce la lesión de ligamentos cruzados?</li>
        </ul></b>
      <p>El cruzado anterior es el que con más frecuencia se rompe, y se produce normalmente en los deportistas que sufren una torcedura, muchas veces por desplazar el cuerpo respecto a la pierna que está fija en el suelo: aterrizar de un salto, bloquearse un esquí, entrada fuerte de un contrario en el fútbol, etc.</p>
      <p>El cruzado posterior se rompe menos a menudo, y es más frecuente por accidentes de tráfico, en los que la parte delantera del hueso tibial se golpea. La tibia se desplaza hacia atrás y rompe el cruzado que intenta frenar ese movimiento: por ejemplo, en impactos contra el parachoques del automóvil, o contra el salpicadero; o en caídas de moto. </p>

      <b><ul style="padding-left: 15px;">
          <li>¿Qué síntomas se producen? </li>
        </ul></b>
      
      <ul style="padding-left: 30px;">
        <li>Los desgarros se notan en el momento como un chasquido, seguido de dolor. Se puede tener la sensación de desencajamiento, aunque luego desaparece. </li>
        <li>Es habitual que se produzca un derrame, al ser estructuras interiores de la articulación. El derrame del cruzado anterior aparece en las tres primeras horas, y suele ser importante. </li>
        <li>Las roturas del cruzado posterior pueden provocar un hematoma en la zona del pliegue de la rodilla (hueco poplíteo). </li>
        <li>Si la rotura es escasa, no suele provocar la sensación de inestabilidad, es decir, de que la rodilla se mueve de forma anormal y no la controla, al andar. </li>
        <li>En las roturas graves del cruzado anterior, esta sensación mejora hasta aparentemente desaparecer, pero cuando el paciente retorne a la actividad deportiva volverá a sentirla, definiéndola como si la rodilla se fuera hacia delante. </li>
        <li>En las roturas graves del cruzado posterior, la sensación de inestabilidad es mucho más rara. </li>
        <li>El dolor de la rotura de un cruzado desaparece en días o semanas. Si no se trata adecuadamente, la inestabilidad residual provocará dolor, pero ya por roce de cartílagos o roturas meniscales. </li>
      </ul>
      <p></p>
      
      <b><ul style="padding-left: 15px;">
         <li>¿Qué hace el médico cuando sospecha un esguince de ligamentos cruzados?</li>
      </ul></b>
      <p>Debe realizar una exploración completa de ambas rodillas, para comparar los hallazgos y descartar otras lesiones asociadas.</p>
      <p>Si el derrame abomba mucho la rodilla, el líquido deberá extraerse. En el 95% de los casos de derrame que contiene sangre (el llamado hemartros), se encuentra una rotura de ligamento cruzado anterior.</p>
      <p>Recién producida la lesión, la rodilla puede doler demasiado para permitir la exploración. En este caso, se puede anestesiar localmente la rodilla y proseguir la exploración, o bien inmovilizar la rodilla con una o dos bandas de yeso (férulas), durante unos 10 días aproximadamente, para que disminuya el dolor.</p>
      
      <b><ul style="padding-left: 15px;">
        <li>Test exploratorios para el cruzado anterior </li>
      </ul></b>
      <p>El test que se obtiene habitualmente es la maniobra de Lachmann: el médico flexiona ligeramente la rodilla y tira de la tibia hacia adelante. Si la tibia se desplaza hacia adelante respecto a la pierna sana, el test es positivo. Con esta prueba, se puede evaluar el grado de inestabilidad clínica o laxitud, que es la cantidad de desplazamiento anormal que el médico detecta.</p>
      <p>Sin embargo el test más específico es el pivot shift: el médico tensa la rodilla, realizando un movimiento de presión y giro. Si la rodilla se desencaja, el test es positivo e indica una laxitud grave del cruzado. El problema es su dificultad en obtenerlo, ya que es doloroso, y el paciente tensa los músculos del muslo de manera inconsciente, para protegerse. </p>
      
      <b><ul style="padding-left: 15px;">
        <li>Test exploratorios para el cruzado posterior </li>
      </ul></b>
      <p>El más específico es el cajón posterior: con el paciente tumbado y la cadera y rodilla dobladas en ángulo recto, el médico presiona la pierna hacia abajo. Si se desplaza más que la pierna sana, el test es positivo. Permite también evaluar el grado de inestabilidad clínica. </p>
      
      <b><ul style="padding-left: 15px;">
        <li>Tratamiento </li>
      </ul></b>
      
      <p>Para las roturas graves es radicalmente diferente para el anterior y el posterior.</p>

      <p>El anterior: debe operarse en pacientes jóvenes, pero los resultados son mejores si se espera a que desaparezca el derrame y la movilidad de la rodilla sea total e indolora. Hay dos técnicas básicas para reconstruirlo y cada una tiene sus detractores y defensores, pero ambas son efectivas: utilizando parte del tendón rotuliano y sus anclajes en hueso o utilizando los tendones llamados isquiotibiales, sin pastillas de hueso. </p>
      <p>El posterior: debe de tratarse mediante un alza de talón y un ciclo de fisioterapia, para muscular la extremidad. Sólo en los casos de inestabilidades graves y que además provoquen dolor, se pensará en cirugía, implantando tendón rotuliano con sus anclajes de hueso. El problema es que siempre queda una inestabilidad residual tras la cirugía, además de ser una técnica muy compleja. </p>
      <p>La cirugía se realiza habitualmente con anestesia epidural, es decir, desde la región lumbar hasta los pies, permitiendo al paciente estar consciente.</p>
      <p>El implante de tendones se coloca siguiendo la misma dirección y puntos de anclaje que el ligamento roto. Debido a la forma del cruzado posterior, esto no se puede conseguir al 100%, de ahí los resultados, a menudo pobres, de la operación. </p>

    </div>

    <div id="tendinitis" class="invisibleElement">
      <h2>Tendinitis</h2>
      <p>  El sufijo itis se refiere a inflamación.  Tendinitis es la inflamación de un tendón, que es una estructura fibrosa que une un músculo con un hueso.</p> 
    </div>

    <div id="meniscos" class="invisibleElement">
      <h2>Meniscos</h2>
      <p></p> 
    </div>

    <div id="artritis" class="invisibleElement">
      <h2>Artritis</h2>
      <p></p> 
    </div>

  </body>
</html>
