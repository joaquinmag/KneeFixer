package sintomas;

public class Inflamacion extends Sintoma {

	public Inflamacion(Valor valor) throws ValorIncorrectoException{
		super();
		if(valor != Valor.MEDIO && valor != Valor.ALTO && valor != Valor.MUYALTO)
			throw new ValorIncorrectoException();
		else
			this.setValor(valor);
	}

}
