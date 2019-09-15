
public class Conta {
	private String titular;
	private int numero;
	private double saldo;
	private String agencia;
	private String dataAbertura;
	private Data dataDeCriacao;
	
	public Conta(String titular, int numero){
		this.titular = titular;
		this.numero = numero;
	}
	
	public Conta(){
		
	}
	
	void saca(double valor){
		this.saldo -= valor;
	}
	void deposita(double valor){
		this.saldo += valor;
	}
	double calculoRendimento(){
		return this.saldo*0.1;
	}
	
	
	// GETTERS E SETTERS
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Data getDataDeCriacao() {
		return dataDeCriacao;
	}
	public void setDataDeCriacao(Data dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
}
