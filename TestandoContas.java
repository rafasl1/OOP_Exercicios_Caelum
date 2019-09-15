import java.util.Scanner;

public class TestandoContas {
	int x = 10;

	public static void main(String[] args) {
		/*// *********EXERCICIO DAS CONTAS BANCARIAS**********
		Conta c1 = new Conta();
		Scanner in = new Scanner(System.in);
		
		c1.setSaldo(3000.00);
		c1.setAgencia("bancos_do_carai_456");
		
		System.out.println("Bom dia usuário! Qual o seu nome?");
		String nome = in.next();
		c1.setTitular(nome);
		
		System.out.println("Obrigado!");
		System.out.println("Agora digite o numero da sua conta: ");
		c1.setNumero(in.nextInt());
		
		System.out.println("Bem vindo, senhor(a) " + c1.getTitular());
		System.out.println("O seu saldo atual eh de R$" + c1.getSaldo());
		System.out.println("A agência da conta eh " + c1.getAgencia());
		
		boolean sistemaOn = true;
		while(sistemaOn){	
			System.out.println("\nAperte 1 para fazer um saque, 2 para fazer um deposito e 3 para sair");
			int comando = in.nextInt();
			switch(comando){
			case 1:
				System.out.println("Digite um valor para sacar: ");
				c1.saca(in.nextDouble());
				System.out.println("Saque bem sucedido!");
				System.out.println("O seu saldo atual eh de R$" + c1.getSaldo());
				break;
			case 2:
				System.out.println("Digite o valor a ser depositado: ");
				c1.deposita(in.nextDouble());
				System.out.println("Deposito bem sucedido!");
				System.out.println("O seu saldo atual eh de R$" + c1.getSaldo());
				break;
			case 3:
				sistemaOn = false;
				System.out.println("Tenha um bom dia!\nSaindo...");
				break;
			default: 
				System.out.println("Comando inválido!");
			}
		}
		
		in.close();
		*/
		
		/* 	// ********EXERCICIO DAS PORTAS************
		Scanner roger = new Scanner(System.in);
		Casa sobradim = new Casa();
		Porta porteira = new Porta();
		Porta portao = new Porta();
		Porta madera = new Porta();
		
		sobradim.porta1 = porteira;
		sobradim.porta2 = portao;
		sobradim.porta3 = madera;
		
		sobradim.porta1.fecha();
		sobradim.porta2.abre();
		sobradim.porta3.fecha();
		
		System.out.print("Vc esta no sobradim, que tem um total de " + sobradim.quantasPortasEstaoAbertas());
		System.out.println(" portas abertas");
		System.out.print("\nDe qual cor vc quer pintar o sobradim? ");
		sobradim.setCor(roger.next());
		System.out.println("A cor do sobradim eh " + sobradim.getCor());
		
		roger.close();
		*/
		
		/*// *******EXERCICIO DAS PESSOAS*******
		Scanner roger = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.print("Qual o nome da pessoa? ");
		p1.setNome(roger.nextLine());
		System.out.print("\nEssa pessoa já fez anivesario quantas vezes? ");
		int nNivers = roger.nextInt();
		for (int i = 0; i < nNivers; i++){
			p1.fazAniversario();
		}
		System.out.print("\nEntao quer dizer que o seu nome eh " + p1.getNome());
		System.out.println(" e vc tem " + p1.getIdade() + " aninhos");
		
		roger.close();
		*/
	}

}
