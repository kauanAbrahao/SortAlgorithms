package quicksort;

public class QuickSort_Pivot_is_Last {
	public static void main(String[] args) {
		int vet[] = new int[] {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78};
		quickSort(vet, 0, vet.length-1);
		for (int i = 0; i<vet.length-1; i++) {
			System.out.println(vet[i]);
		}
		
	}
//	-------------------------------------------------------------------------
	public static void quickSort(int vet[], int l, int r) {
		int p;
		if (l<r) {
			p = particao(vet, l, r);
			quickSort(vet, l, p-1);
			quickSort(vet, p+1, r);
		}		
	}
	
//	-------------------------------------------------------------------------
	private static int particao(int[] vet, int l, int r) {
		int pivo = vet[r];
		int aux;
		int i = l-1;
		for (int j = l; j<r; j++) {
			if(vet[j]<pivo) {
				i++;
				aux = vet[j];
				vet[j] = vet[i];
				vet[i]=aux;
			}
		}
		aux = vet[i+1];
		vet[i+1] = vet[r];
		vet[r] = aux;	
		
		return i+1;

	}
}
