package rules;

import java.util.ArrayList;
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
	}
	
	private KnowledgeRuntimeLogger inicializarReglas(){
		try {
			KnowledgeBase kbase = readKnowledgeBase();
			ksession = kbase.newStatefulKnowledgeSession();
			KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");

            return logger;

		} 
        catch (Throwable t) {
        	t.printStackTrace();
        	return null;
		}
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		
		
        KnowledgeBuilder kbuilder =  KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("rules/ReglasLesiones.drl"), ResourceType.DRL);
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

	public void AgregarVariableGlobal(Lesion l){
		ksession.setGlobal("lesion", l);
	}
        
	public static void main(String [ ] args){
		ControladorReglas con = new ControladorReglas();
        try {
        	KnowledgeRuntimeLogger logger = con.inicializarReglas();
            Lesion l = new Lesion(new Dolor(Sintoma.Valor.ALTO),new Ruido(Sintoma.Valor.CRUJIENTE), new Zona(Sintoma.Valor.ANTERIOR), new Rigidez(Sintoma.Valor.MEDIO), new Estabilidad(Sintoma.Valor.BAJO), new Inflamacion(Sintoma.Valor.ALTO));
            con.AgregarVariableGlobal(l);
            con.insertarSintoma(l.getDolor());
        	con.insertarSintoma(l.getEstabilidad());
        	con.insertarSintoma(l.getInflamacion());
        	con.insertarSintoma(l.getRigidez());
        	con.insertarSintoma(l.getRuido());
        	con.insertarSintoma(l.getZona());
            con.fireAllRules();
            System.out.println(l.getLesiones().get(Lesion.TipoLesion.LCA));
            logger.close();
        } catch (ValorIncorrectoException ex) {
                
        } catch (NullPointerException ex){
        	System.out.println("A");
            	
        }
            
	}
}

