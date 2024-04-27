/* Esta classe � a classe de f�brica. Ela � respons�vel por criar o objeto a partir da chamada de cliente.
 * Esta classe permite que n�o seja necessario a cria��o de um novo objeto a partir da chamadas diretas.*/

public abstract class CarCreator {

	public void buildCar() {
		Car carro = factoryMethod();
	}

	protected abstract Car factoryMethod();
}