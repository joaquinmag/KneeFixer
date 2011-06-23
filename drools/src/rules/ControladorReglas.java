package rules;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lesiones.*;
import sintomas.*;


import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;




public class ControladorReglas {
	
	ArrayList<Lesion> lesionesPosibles = new ArrayList<Lesion>();
	StatefulKnowledgeSession ksession;
	
	public ControladorReglas(){
		try {
			KnowledgeBase kbase = readKnowledgeBase();
			StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
			KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");

			inicializarLesiones();
            ksession.setGlobal("lesiones", lesionesPosibles);

		} 
        catch (Throwable t) {
        	t.printStackTrace();
		}
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		
		
        KnowledgeBuilder kbuilder =  KnowledgeBuilderFactory.newKnowledgeBuilder();
        System.out.println("ACA");
        kbuilder.add(ResourceFactory.newClassPathResource("ReglasPeriodos.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
	}
	
	public ArrayList<Lesion> getLesionesPosibles() {
		return lesionesPosibles;
	}


	/*public ArrayList<Rebaba> getRebabas() {
		ArrayList<Rebaba> rebabas = new ArrayList<Rebaba>();
		Collection<Object> rebabasInsertadas = ksession.getObjects(new FiltroRebabas());
		
		Iterator<Object> it = rebabasInsertadas.iterator();
		while (it.hasNext())
			rebabas.add((Rebaba)it.next());
		
		return rebabas;
	}
        */

	public void insertarSintoma(Sintoma sintoma){
		ksession.insert(sintoma);
	}

	
	public void fireAllRules() {
            ksession.fireAllRules();
	}
	
	/*public boolean contieneRebaba(String tipo){
		boolean contiene = false;
		Collection<Object> rebabas = ksession.getObjects(new FiltroRebabas());
		
		Iterator<Object> it = rebabas.iterator();
		while (it.hasNext()){
			Rebaba rebaba = (Rebaba)it.next();
			if (rebaba.getTipo().compareTo(tipo) == 0)
				contiene = true;
		}
		return contiene;
	}*/


	private void inicializarLesiones(){
            Lesion l = null;
            try{
                l = new LCA(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.CRUJIENTE), new Zona(Sintoma.Valor.ANTERIOR), new Rigidez(Sintoma.Valor.MEDIO), new Estabilidad(Sintoma.Valor.BAJO), new Inflamacion(Sintoma.Valor.ALTO));
                this.getLesionesPosibles().add(l);
                   
                l = new LCP(new Dolor(Sintoma.Valor.MUYALTO),new Ruido(Sintoma.Valor.CRUJIENTE), new Zona(Sintoma.Valor.POSTERIOR), new Rigidez(Sintoma.Valor.MEDIO), new Estabilidad(Sintoma.Valor.MEDIO), new Inflamacion(Sintoma.Valor.ALTO));
                this.getLesionesPosibles().add(l);
                    
                l = new LCAP(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.CRUJIENTE), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.BAJO), new Estabilidad(Sintoma.Valor.MUYBAJO), new Inflamacion(Sintoma.Valor.MUYALTO));
                this.getLesionesPosibles().add(l);
                l = new LCAP(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.CRUJIENTE), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.BAJO), new Estabilidad(Sintoma.Valor.MUYBAJO), new Inflamacion(Sintoma.Valor.ALTO));
                this.getLesionesPosibles().add(l);
                    
                l = new Artritis(new Dolor(Sintoma.Valor.MEDIO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.MEDIO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                l = new Artritis(new Dolor(Sintoma.Valor.MEDIO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                l = new Artritis(new Dolor(Sintoma.Valor.MEDIO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.MEDIO), new Estabilidad(Sintoma.Valor.BAJO), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                l = new Artritis(new Dolor(Sintoma.Valor.MEDIO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.BAJO), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                    
                l = new Menisco(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.RUIDOSECO), new Zona(Sintoma.Valor.AMBOS), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                    
                l = new Tendon(new Dolor(Sintoma.Valor.MEDIO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.FRONTAL), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                l = new Tendon(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.FRONTAL), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.MEDIO));
                this.getLesionesPosibles().add(l);
                l = new Tendon(new Dolor(Sintoma.Valor.MEDIO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.FRONTAL), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.ALTO));
                this.getLesionesPosibles().add(l);
                l = new Tendon(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.NINGUNO), new Zona(Sintoma.Valor.FRONTAL), new Rigidez(Sintoma.Valor.ALTO), new Estabilidad(Sintoma.Valor.NORMAL), new Inflamacion(Sintoma.Valor.ALTO));
                this.getLesionesPosibles().add(l);      
            }
            catch(ValorIncorrectoException e){}
	}
        
        public static void main(String [ ] args){
            ControladorReglas con = new ControladorReglas();
            /*try {
                con.insertarSintoma(new Dolor(Sintoma.Valor.ALTO));
            } catch (ValorIncorrectoException ex) {
                
            }*/
        }
}

