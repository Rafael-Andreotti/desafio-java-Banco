public abstract class Conta implements IConta {

	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int Agencia;
	protected int numero;
	protected double saldo; 
	
	public Conta() {
		this.Agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
	   saldo -= valor;			
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;		
		
				}
	@Override
	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor);	
		contadestino.depositar(valor);
	}

	
	public int getAgencia() {
		return Agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	protected void imprimirinfocomuns() {
		System.out.println(String.format("Agencia: %d", this.Agencia));
		System.out.println(String.format("numero: %d", this.numero));
		System.out.println(String.format("saldo: %.2f", this.saldo));

	}
	
}

