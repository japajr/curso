import java.util.Scanner;

public class mediadoaluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o nome do Aluno?");
		String nome = sc.nextLine();
		System.out.println("nota do primeiro bimestre do aluno?");
		double nota1 = sc.nextDouble();
		System.out.println("nota do segundo bimestre do aluno?");
		double nota2 = sc.nextDouble();
		System.out.println("nota do terceiro bimestre do aluno?");
		double nota3 = sc.nextDouble();
		System.out.println("nota do quarto bimestre do aluno?");
		double nota4 = sc.nextDouble();

		double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Nome Do Aluno: " + nome);
		System.out.println("Média Do Aluno é: " + resultado);

		if (resultado < 5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		sc.close();

	}

}
