package mergesort;

public class MergeSort {
	public static void main(String[] args) {
		int vet[] = new int[] {	11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 900, 88, 75, 45, 82 };
		mergeSort(vet, 0, vet.length-1);
		for(int i =0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	private static void mergeSort(int[] vet, int i, int j) {
		if(i<j) {
			int meio = (i+j)/2;
			mergeSort(vet, i, meio);
			mergeSort(vet, meio+1, j);
			merge(vet, i, meio, meio+1, j);
		}
	}

	private static void merge(int[] vet, int inicioA, int fimA, int inicioB, int fimB) {
		int i = inicioA;
		int i2 = inicioB;
		int iaux = inicioA;
		int aux[] = new int[vet.length];
		
		while(i <= fimA && i2 <= fimB) {
			if (vet[i] <= vet[i2]) {
				aux[iaux++] = vet[i++];
			}
			else {
				aux[iaux++] = vet[i2++];
			}
			
		}
		while(i<=fimA) {
			aux[iaux++] = vet[i++];
		}
		while(i2 <= fimB) {
			aux[iaux++] = vet[i2++];
		}
		for(int j = inicioA; j<=fimB; j++) {
			vet[j] = aux[j];
		}
		
	}

}
