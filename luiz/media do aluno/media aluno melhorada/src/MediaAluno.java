import java.util.Scanner;

public class MediaAluno {

	
	static void mediaAluno() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual Sua escola");
		String escola = sc.nextLine();
		
		System.out.println("Qual Sua sala");
		String sala = sc.nextLine();
		
		System.out.println("Qual o nome do Aluno");
		String nome = sc.nextLine();
		
		System.out.println("Qual o peso da nota do primeiro Bimestre");
		double pesoNota1 = sc.nextDouble();
		while (pesoNota1 > 10 || pesoNota1 < 0) {
			System.out.println("Número invalido digite a Nota do peso1 novamente");
		}
		System.out.println("Qual o peso da nota do segundo Bimestre");
		double pesoNota2 = sc.nextDouble();
		while (pesoNota2 > 10 || pesoNota2 < 0) {
			System.out.println("Número invalido digite a Nota do peso2 novamente");
		}
		System.out.println("Qual o peso da nota do terceiro Bimestre");
		double pesoNota3 = sc.nextDouble();
		while (pesoNota3 > 10 || pesoNota3 < 0) {
			System.out.println("Número invalido digite a Nota do peso3 novamente");
		}
		System.out.println("Qual o peso da nota do quarto Bimestre");
		double pesoNota4 = sc.nextDouble();
		while (pesoNota4 > 10 || pesoNota4 < 0) {
			System.out.println("Número invalido digite a Nota do peso4 novamente");
		}
		// ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
		
		System.out.println("Qual a nota do " + nome + " no primeiro bimestre");
		double nota1 = sc.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("Número invalido digite a 1 nota novamente");
			nota1 = sc.nextDouble();
		}
		System.out.println("Qual a nota do " + nome + " no segundo bimestre");
		double nota2 = sc.nextDouble();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("Número invalido digite a 2 nota novamente");
			nota2 = sc.nextDouble();
		}
		System.out.println("Qual a nota do " + nome + " no terceiro bimestre");
		double nota3 = sc.nextDouble();
		while (nota3 > 10 || nota1 < 0) {
			System.out.println("Número invalido digite a 3 nota novamente");
			nota3 = sc.nextDouble();
		}
		double nota4 = sc.nextDouble();
		System.out.println("Qual a nota do " + nome + " no quarto bimestre");
		while (nota4 > 10 || nota1 < 0) {
			System.out.println("Número invalido digite a 4 nota novamente");
			nota4 = sc.nextDouble();
		}
		
		double pesoNotas = pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4;
		
		double resultado = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3 + nota4 * pesoNota4)/ pesoNotas;
		
		System.out.println("------" + escola + "-------");
		System.out.println("> Sala:" + sala + "< ");
		System.out.println("O Aluno(a): " + nome);
		System.out.println("Média: " + resultado);
		
		if(resultado < 5) {
			System.out.println("Reprovado(a)");
		}else {
			System.out.println("Aprovado(a)");
		}
		
		System.out.println("                       ");
		System.out.println("                       ");
		System.out.println("Registrar outra Escola?");
		System.out.println("                       ");
		System.out.println("9>Não< || QualquerOutroNúmero>Sim<");
		
		double repetir = sc.nextDouble();	
		sc.close();
		if(repetir == 9) {
	
			System.out.println("                         ");
			System.out.println("           oo   oo          ");
			System.out.println("          o  o o  o   Obrigado por usar o Serviço     ");
			System.out.println("          o   o   o        ");
			System.out.println("          o       o        ");
			System.out.println("           o     o         ");
			System.out.println("            o   o          ");
			System.out.println("             o o           ");
			System.out.println("              o           ");
			System.out.println("                         ");
			
	
		}else {
			mediaAluno();
					}
		
	}
	public static void main(String[] args) {
		
		mediaAluno();
	}
}
