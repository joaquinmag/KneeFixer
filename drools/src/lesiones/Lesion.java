package lesiones;

import java.util.HashMap;

import sintomas.Sintoma;

public class Lesion {
	public Sintoma dolor;
	private Sintoma ruido;
	private Sintoma zona;
	private Sintoma rigidez;
	private Sintoma estabilidad;
	private Sintoma inflamacion;
	private String nombreLesion;
	
	public enum TipoLesion{
		LCA,
		LCP,
		LCAP,
		TENDINITIS,
		MENISCOS,
		ARTRITIS		
	}
	
	private HashMap<TipoLesion,Integer> lesiones;
	
	public Lesion(){
		setLesiones(new HashMap<TipoLesion,Integer>());
	}
	
	public Lesion(Sintoma dolor, Sintoma ruido, Sintoma zona, Sintoma rigidez, Sintoma estabilidad, Sintoma inflamacion){
		setDolor(dolor);
		setRuido(ruido);
		setZona(zona);
		setRigidez(rigidez);
		setEstabilidad(estabilidad);
		setInflamacion(inflamacion);
		setLesiones(new HashMap<TipoLesion,Integer>());
	}
	
	public void setDolor(Sintoma dolor) {
		this.dolor = dolor;
	}
	public Sintoma getDolor() {
		return dolor;
	}
	
	public void setRuido(Sintoma ruido) {
		this.ruido = ruido;
	}
	public Sintoma getRuido() {
		return ruido;
	}
	
	public void setZona(Sintoma zona) {
		this.zona = zona;
	}
	public Sintoma getZona() {
		return zona;
	}
	
	public void setRigidez(Sintoma rigidez) {
		this.rigidez = rigidez;
	}
	public Sintoma getRigidez() {
		return rigidez;
	}
	
	public void setEstabilidad(Sintoma estabilidad) {
		this.estabilidad = estabilidad;
	}
	public Sintoma getEstabilidad() {
		return estabilidad;
	}
	
	public void setInflamacion(Sintoma inflamacion) {
		this.inflamacion = inflamacion;
	}
	public Sintoma getInflamacion() {
		return inflamacion;
	}
        
    public boolean mismaLesion (Lesion otraLesion)
    {
    	return (this.getDolor().mismoSintoma(otraLesion.getDolor()) && this.getEstabilidad().mismoSintoma((otraLesion.getEstabilidad())));
    }
    
    public String toString()
    {
    	return this.nombreLesion;
    }

	public void setLesiones(HashMap<TipoLesion,Integer> lesiones) {
		this.lesiones = lesiones;
	}

	public HashMap<TipoLesion,Integer> getLesiones() {
		return lesiones;
	}
	
	/*En el tipo de lesion suma uno.*/
	public void SumarUnoHash(TipoLesion tipolesion){
		if(this.getLesiones().containsKey(tipolesion))
			this.getLesiones().put(tipolesion,this.getLesiones().get(tipolesion).intValue()+1);
		else
			this.getLesiones().put(tipolesion, 1);
	}
	
}
