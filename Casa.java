
public class Casa {
	String cor;
	Porta porta1, porta2, porta3;
	
	void pinta(String s){
		this.cor = s;
	}
	int quantasPortasEstaoAbertas(){
		int contador = 0;
		if(this.porta1.estaAberta()){
			contador++;
		}
		if (this.porta2.estaAberta()){
			contador++;
		}
		if (this.porta3.estaAberta()){
			contador++;
		}
		return contador;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
