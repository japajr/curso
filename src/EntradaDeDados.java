import java.util.Scanner;

public class EntradaDeDados {
	
	public static void verificarNumero(double pesoNota) {		
		while (pesoNota < 0) {
			System.out.println("Número invalido digite os Dados Novamente");
			EntradaDeDados();
		}
	}
   public static void verificarNota(double Nota) {
		while (Nota < 0 || Nota > 10) {
			System.out.println("Número invalido digite os Dados Novamente");
			EntradaDeDados();
		}
	}

	static void EntradaDeDados() {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual sua escola");
		String escola = sc.nextLine();
		
		System.out.println("Sala Do Aluno(a)");
		String sala = sc.nextLine();
		
		System.out.println("Qual e o nome do aluno");
		String nome = sc.nextLine();
        //Pedir Peso Para o Aluno
		System.out.println("Qual o peso da nota do primeiro bimestre");
		double pesoNota1 = sc.nextDouble();
		verificarNumero(pesoNota1);		
		System.out.println("Qual o peso da nota do segundo bimestre");
		double pesoNota2 = sc.nextDouble();
		verificarNumero(pesoNota2);
		System.out.println("Qual o peso da nota do terceiro bimestre");
		double pesoNota3 = sc.nextDouble();
		verificarNumero(pesoNota3);		
		System.out.println("Qual o peso da nota do quarto bimestre");
		double pesoNota4 = sc.nextDouble();
		verificarNumero(pesoNota4);
		//Pedir Nota Do Aluno
		System.out.println("Qual a nota do aluno no 1 Bimestre");
		double nota1 = sc.nextDouble();
		verificarNota(nota1);
		System.out.println("Qual a nota do aluno no 2 Bimestre");
		double nota2 = sc.nextDouble();
		verificarNota(nota2);
		System.out.println("Qual a nota do aluno no 3 Bimestre");
		double nota3 = sc.nextDouble();
		verificarNota(nota3);
		System.out.println("Qual a nota do aluno no 4 Bimestre");
		double nota4 = sc.nextDouble();
		verificarNota(nota4);
		
		double pesoNotas = pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4;
		
		double resultado = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3 + nota4 * pesoNota4)/ pesoNotas;
		
		System.out.println("=========" + escola + "=========");
		System.out.println(">Sala:  " + sala + "  <");
		System.out.println("O Aluno(a): " + nome);
		System.out.println("Média: " + resultado);
		
		if(resultado < 5) {
			System.out.println("Reprovado(a)");
		}else {
			System.out.println("Aprovado(a)");
		}
		
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("Registrar Outra Escola?");
		System.out.println("                                        ");
		System.out.println("QualquerOutroNúmero>Sim< || 9>Não<");
		
		
		double repetir = sc.nextDouble();
		if(repetir == 9) {
			System.out.println("Obrigado por Usar o serviço");
			System.out.println("           ****       ****                                ");
			System.out.println("          *||||*     *||||*                                ");
			System.out.println("        *||    ||****||   ||*   ~Corazon te manda um         ");
			System.out.println("        *||     |||||     ||*    abraço  " + nome              );
			System.out.println("        *||   0       0   ||*                                ");
			System.out.println("         *||             ||*                               ");
			System.out.println("          *||   ______  ||*                                ");
			System.out.println("           *||         ||*                                   ");
			System.out.println("            *|||     |||*                                   ");
			System.out.println("              *||  ||*                                      ");
			System.out.println("                *||*                                       ");
			System.out.println("                 **                                      ");
			
			sc.close();
		}else {
			EntradaDeDados();
		}

		
	}

	public static void main(String[] args) {

		EntradaDeDados();
	}
}