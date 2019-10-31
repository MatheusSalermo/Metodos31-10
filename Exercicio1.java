import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int entrada = 1;
		while(entrada!=5) {
		System.out.println("Digite o programa que você quer executar\n 1-Fatorial \n 2-Tabuada \n 3-Sexo e Idade \n 4-Potência \n 5-Sair");
		 entrada = ler.nextInt();
		 if(entrada == 1) {
			Fatorial(); 
		 }
		 else if(entrada == 2) {
			System.out.println("Digite o valor que você deseja ver a tabuada");
			int a = ler.nextInt();
			Tabuada(a);
		 }
		 else if(entrada == 3) {
			 System.out.println("Digite seu sexo: \n M ou m para Masculino \n F ou f para feminino");
			 String sexo = ler.next();
			 System.out.println("Digite sua idade");
			 int idade = ler.nextInt();
			 Idade(sexo,idade);
		 }
		 else if(entrada == 4) {
			 System.out.println("Digite o número que você deseja saber a potência");
			int numero = ler.nextInt();
			System.out.println("Digite o Expoente da potência");
			int ex = ler.nextInt();
			 Potencia(numero,  ex);
			 
		 }
		 else if(entrada >=6) {
			 System.out.println("Numero invalido");
		 }
		}
	
	
	}
	public static void Fatorial() {
		int fatorial=1,valor;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número que você deseja saber o fatorial");
		valor = ler.nextInt();
		for( int i = 2; i <= valor; i++ ){
		fatorial *= i;
		}

		System.out.println( "O fatorial de " + valor + " é igual a " + fatorial+ "\n");
		}
	public static void Tabuada(int a) {
		int res;
		int i = 0;
		while(i<=10) {
			res=a*i;
			System.out.println(a+"*"+i+"="+res);
			i++;
		}
	}
	public static void Idade(String sexo,int idade) {
		int tempoAposentar;
		switch(sexo) {
		case "m":
		case "M":
				tempoAposentar = 65 - idade;
				if(tempoAposentar<=0) {
					System.out.println("Você ja pode se aposentar");
					break;
				}
			System.out.println("Falta(m) "+tempoAposentar+" ano(s) para você se aposentar");
			break;
		case "f":
		case "F":
				tempoAposentar = 60 - idade;
				if(tempoAposentar<=0) {
					System.out.println("Você ja pode se aposentar");
					break;
				}
			System.out.println("Falta(m) "+tempoAposentar +" ano(s) para você se aposentar");
			
		break;
		}
	}
	public static void Potencia(int numero, int ex) {
		int pot = numero;
		int exAtual=1;
		while(exAtual < ex) {
			pot=pot*numero;
			exAtual++;
		
		}
		System.out.println(pot);
	}
	
}

