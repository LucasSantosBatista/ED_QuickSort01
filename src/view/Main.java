package view;

import controller.QuickSort;

public class Main {

	public static void main(String[] args) {
		int tamanho = 7;
		int[] vetor = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = (int) ((Math.random()*100)+1);	//Preenche vetor com valores aleatórios
		}
		
		QuickSort qCont = new QuickSort();
		vetor = qCont.quickSort(vetor, 0, tamanho -1);
		
		for (int i: vetor) {
			System.out.print(i + " ");
		}
	}

}
