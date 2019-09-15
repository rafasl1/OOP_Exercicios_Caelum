
public class Porta {
	public boolean aberta = false;
	public String cor;
	public int dimensaox, dimensaoy, dimensaoz;
	
	public void abre(){
		if (this.aberta == true){
			System.out.println("A porta já está aberta!");
		}else{
			this.aberta = true;
		}	
	}
	public void fecha(){
		if (this.aberta == false){
			System.out.println("A porta já estava fechada.");
		}else{
			this.aberta = false;
		}
	}
	public void pinta(String cor){  // = SETCOR
		this.cor = cor;
	}
	boolean estaAberta(){   // = GETABERTA
		return this.aberta;
	}
}
