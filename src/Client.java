/* Esta � a classe que representa o pedido do cliente para a cria��o do objeto.
 * Ela permite que o cliente receba o produto e suas a��es sem saber detalhes da constru��o do objeto.*/

public class Client {

	public static void main(String[] args) {

		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}

}