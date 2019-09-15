
public class Data {
	int dia, mes, ano;
	
	String formatada(){
		String dataFormatada = this.dia; 
		dataFormatada += "\";
		dataFormatada += this.mes;
		dataFormatada += "\";
		dataFormatada += this.ano;
		return dataFormatada;
	}
}
