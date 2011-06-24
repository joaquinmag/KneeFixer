package sintomas;

public class Estabilidad extends Sintoma {

	public Estabilidad(Valor valor) throws ValorIncorrectoException{
		super();
		if(valor != Valor.MUYBAJO && valor != Valor.NORMAL && valor != Valor.BAJO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}

}
