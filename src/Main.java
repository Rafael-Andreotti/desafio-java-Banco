
public class Main {


	public static void main(String[] args) {
		
	   Conta cc = new ContaCorrente();
	   Conta poupanca = new ContaPoupan�a();
	
	   cc.depositar(100);
	   cc.transferir(50, poupanca);
	   
	   cc.imprimirExtrato();
	   poupanca.imprimirExtrato();
		
	}

}
