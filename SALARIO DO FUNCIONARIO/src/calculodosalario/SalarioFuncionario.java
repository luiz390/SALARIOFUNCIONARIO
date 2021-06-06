package calculodosalario;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		// FAZER CALCULO DE SALRIO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor_hora=sc.nextInt();
		double salario;
		
		salario = valor_hora * horas;
		
		System.out.println("O NUMERO DO FUNCIONARIO É "+ numero);
		System.out.println("O SALARIO DO FUNCIONArio é " + salario);

	}

}
