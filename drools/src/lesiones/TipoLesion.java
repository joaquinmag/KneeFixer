package lesiones;

import java.util.Arrays;
import java.util.List;

public enum TipoLesion {
		
		LCA("Ligamento cruzado anterior"),
		LCP("Ligamento cruzado posterior"),
		LCAP("Ligamento cruzado anterior y posterior"),
		TENDINITIS("Tendinitis rotuliana"),
		MENISCOS("Ruptura de meniscos"),
		ARTRITIS("Artritis");
		
		private String nombre;
		
		private TipoLesion(String nombre){
			this.nombre = nombre;
		}
		
		public String getNombre(){
			return this.nombre;
		}
		
		public static List<TipoLesion> asList(){
			return Arrays.asList(TipoLesion.values());
		}
	}
