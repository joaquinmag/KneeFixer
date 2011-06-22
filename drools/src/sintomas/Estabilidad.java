package sintomas;

public class Estabilidad extends Sintoma {

	public Estabilidad(Valor valor) throws ValorIncorrectoException{
		if(valor != Valor.MEDIO && valor != Valor.ALTO && valor != Valor.BAJO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}

}
