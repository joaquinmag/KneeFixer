package lesiones;

public enum TipoLesion {
		
		LCA("Ligamento cruzado anterior"),
		LCP("Ligamento cruzado posterior"),
		LCAP("Ligamento cruzado anterior y posterior"),
		TENDINITIS("Tendinitis rotuliana"),
		MENISCOS("Ruptura de meniscos"),
		ARTRITIS("Artritis"),
		NO_DETERMINADA("No determinada");
		
		private String nombre;
		
		private TipoLesion(String nombre){
			this.nombre = nombre;
		}
		
		public String getNombre(){
			return this.nombre;
		}
	}
