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


    <div id="artritis" class="invisibleElement">
      <h2>Artritis</h2>
      <div class="clr"></div>
      <img src="${createLinkTo(dir:'images/dr/', file:'artritis.jpg')}" width="180" height="235" alt="" class="fl" />

      <p>Tres tipos básicos de artritis pueden afectar la articulación de la rodilla:</p>
      <ul style="padding-left: 220px;">
        <li>Osteoartritis (también conocida como OA, su sigla en inglés) es la forma más común de artritis de la rodilla. OA suele ser una enfermedad degenerativa lentamente progresiva en que se desgasta gradualmente el cartílago de la articulación. Frecuentemente afecta a la gente de mediana edad y la más vieja.</li>
        <li>Artritis reumatoide (también conocida como RA, su sigla en inglés) es un tipo de artritis inflamatoria que puede destruir el cartílago de la articulación. RA puede ocurrir a cualquier edad. RA generalmente afecta ambas rodillas.</li>
        <li>Artritis postraumática artritis puede desarrollarse después de un daño a la rodilla. Este tipo de artritis es parecida a osteoartritis y puede desarrollarse años después de una fractura, desgarro del menisco o daño al ligamento.</li>
      </ul>
      <p></p>

      <b><ul style="padding-left: 15px;">
          <li>Síntomas </li>
        </ul></b>
      <p>Generalmente, el dolor asociado con la artritis desarrolla gradualmente, aunque la iniciación súbita también es posible. La articulación puede ponerse rigida e hinchada, haciéndole difícil doblar o extender la rodilla. El dolor y la hinchazón son peor por la mañana o después de un período de inactividad. El dolor puede aumentar también después de actividades tales como caminar, subir la escalera o arrodillarse. Frecuentemente el dolor puede ocasionar un sentimiento de debilidad en la rodilla, resultando en inmovilizarse o caerse. Los cambios ambientales (frio o humedad) también afectan el grado de dolor de la artritis.</p>

      <b><ul style="padding-left: 15px;">
          <li>Diagnóstico</li>
        </ul></b>
      <p>Su médico realizará un examen físico que enfoca en su marcha, el arco de movimiento en la extremidad, y la sensibilidad o hinchazón de la articulación. Los rayos-X típicamente muestran una pérdida de espacio en la articulación de la rodilla afectada. Pruebas de sangre y otras pruebas especiales tales como Imágenes por Resonancia Magnética (también conocido como MRI, su sigla en inglés) pueden ser necesarias para hacer el diagnosis.</p>

      <b><ul style="padding-left: 15px;">
          <li>Opciones de tratamiento</li>
        </ul></b>
      <p>En las etapas tempranas, la artritis de la rodilla se trata con medidas conservadoras, no quirúrgicas.</p>

      <ul style="padding-left: 30px;">
        <li>Las modificaciones del estilo de vida pueden incluir la pérdida del peso, cambiando desde ejercicios de correr o saltar a nadar o ciclismo, y minimizando las actividades que agravan la condición, tales como la de subir escaleras.</li>
        <li>Los ejercicios pueden ayudara aumentar el arco de movimiento y flexibilidad así como también ayudan fortalecer los músculos en la pierna.</li>
        <li>Usar utensilios sustentadores tales como un bastón, llevando inserciones amortiguadoras en los zapatos, o llevando una manga de rodilla o ortésis (dispositivo ortopédico) pueden ser útiles.</li>
        <li>Otras medidas pueden incluir aplicaciones de calor o hielo, ejercicios en el agua, linimentos o vendajes elásticos.</li>
      </ul>
      <p></p>

      <p>Varios tipos de drogas pueden usarse para tratarla artritis de la rodilla. Porque cada paciente es diferente, y porque no toda la gente responde de la misma manera a medicaciones, su cirujano ortopédico desarrollará un programa específico para su condición.</p>

      <ul style="padding-left: 30px;">
        <li>Las medicaciones antiinflamatorias pueden incluir aspirina, acetaminofén o ibuprofen para ayudara reducirla hinchazón en la articulación.</li>
        <li>Glucosamina y condroitin sulfato son los suplementos orales que pueden aliviar el dolor de osteoartritis.</li>
        <li>Corticoesteroides son poderosos agentes antiinflamatorios que pueden ser inyectados en la articulación.</li>
        <li>Terapia de hialuronato consiste en una serie de inyecciones destinados para cambiar el carácter del fluido de la articulación.</li>
        <li>Tratamientos médicos especiales para RA incluyen inyecciones de sal de oro y otras drogas que modifican la enfermedad.</li>
      </ul>
      <p></p>

      <b><ul style="padding-left: 15px;">
          <li>Tratamiento quirúrgico</li>
        </ul></b>

      <ul style="padding-left: 30px;">
        <li>Cirugía artroscópica utiliza tecnología de fibra óptica para permitir que el cirujano pueda ver adentro de la articulación y limpiarla de partículas o reparar cartílago desgarrado.</li>
        <li>Un osteotomía corta la tibia o el fémur para mejorar la alineación de la articulación de la rodilla.</li>
        <li>Una artroplastia total o parcial de la rodilla reemplaza el cartílago severamente dañado de la articulación de la rodilla con metal y plástico.</li>
        <li>Injertar el cartílago es posible para algunas rodillas con limitada o contenida pérdida de cartílago debida a trauma o artritis.</li>
        <li>Cirujanos ortopédicos continúan buscando nuevas maneras de tratamiento de la artritis de la rodilla. La investigación actual enfoca en nuevas drogas así como también en trasplantes de cartílago y otras maneras para ayudara demorar el progreso de la artritis.</li>
      </ul>
    </div>


    <div id="tendinitis" class="invisibleElement">
      <h2>Tendinitis</h2>
      <p>  El sufijo itis se refiere a inflamación.  Tendinitis es la inflamación de un tendón, que es una estructura fibrosa que une un músculo con un hueso.</p> 
    </div>

    <div id="meniscos" class="invisibleElement">
      <h2>Meniscos</h2>
      <p></p> 
    </div>

  </body>
</html>
