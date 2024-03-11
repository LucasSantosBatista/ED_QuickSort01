package controller;

public class QuickSort {

	public QuickSort() {
		super();
	}

	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int pivoFixo = dividir(vetor, inicio, fim); // Subvetor esquerda
			quickSort(vetor, inicio, pivoFixo - 1); // Subvetor direita
			quickSort(vetor, pivoFixo + 1, fim);
		}

		return vetor;
	}

	private int dividir(int[] vetor, int inicio, int fim) {
			int pivo = vetor[inicio];
			int ponteiroEsquerda = inicio + 1;
			int ponteiroDireita = fim;
			
			while (ponteiroEsquerda <= ponteiroDireita) {
				while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <  pivo) {
					ponteiroEsquerda++;
				}
				while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] >  pivo) {
					ponteiroDireita--;
				}
				if (ponteiroEsquerda < ponteiroDireita) {
					troca(vetor, ponteiroEsquerda, ponteiroDireita);
					ponteiroEsquerda++;
					ponteiroDireita--;
				}
			}
			troca(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}

	private void troca(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
