package aula3;

public class Executavel {

	public static void main(String[] args) {
		int[] vetorA= {2,4,6,8,10,14,22,24,30,32};
		
		int resultado = 0;
		for(int cont=0;cont<vetorA.length;cont++) {
			resultado=resultado+vetorA[cont];
			
		}
		System.out.println("O resultado da soma do VetorA: <"+resultado+">");

	}

}
