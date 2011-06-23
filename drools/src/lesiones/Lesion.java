package lesiones;

import sintomas.Sintoma;

public class Lesion {
	private Sintoma dolor;
	private Sintoma ruido;
	private Sintoma zona;
	private Sintoma rigidez;
	private Sintoma estabilidad;
	private Sintoma inflamacion;
	
	public Lesion(){}
	
	public Lesion(Sintoma dolor, Sintoma ruido, Sintoma zona, Sintoma rigidez, Sintoma estabilidad, Sintoma inflamacion){
		setDolor(dolor);
		setRuido(ruido);
		setZona(zona);
		setRigidez(rigidez);
		setEstabilidad(estabilidad);
		setInflamacion(inflamacion);
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
}
