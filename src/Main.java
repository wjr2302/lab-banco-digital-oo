
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Venilton");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		poupanca.depositar(500);
		
		poupanca.exibirSaldo();
		
		poupanca.transferir(500, cc);
		
		cc.exibirSaldo();
		poupanca.exibirSaldo();

	}

}
