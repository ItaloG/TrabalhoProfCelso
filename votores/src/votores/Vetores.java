package votores;

public class Vetores {

	public static void main(String[] args) {
		
		double notas[] = {8.5, 9.3, 7.2, 9.7};
		
		System.out.println("Média = " + media(notas) + "\n");
		
		System.out.println("soma das notas = " + soma(notas) + "\n");
		
		notas[2] = 8;
		
		System.out.println("Média = " + media(notas) + "\n");
		System.out.println("soma das notas = " + soma(notas) + "\n");
		
		//////////////////////////////////////////
		
		double idades[] = {
				17, 17, 16, 17, 
				17 ,17, 16, 17, 
				22, 17, 19, 16, 
				16, 17, 16, 16};
		
		
		System.out.println("Média das idades é: " + media(idades) + "\n");
		
		System.out.println("soma das idades = " + soma(idades) + "\n");
//		
//		String nome = "Celso";
//		int repeticao = 10;
//		
//		for(int i = 0; i < repeticao; i++) {
//			System.out.println((i) + "-" + nome);
//		}
		/////////////////////////////////////////
		
		String[] nomes = {"Ana", "Pedro", "Fabiana", "Luiz"};
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println( nomes[i]);
		}
	}
	
	private static double media(double vetor[]) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		return soma / vetor.length;
	}
	
	private static double soma(double vetor[]) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		return soma;
	}

	

}
