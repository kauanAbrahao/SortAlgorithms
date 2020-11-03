package quicksort;

public class QuickSort_Pivot_is_First {
	
	public static void main(String[] args) {
		int vet[] = new int[] {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78};
		quickSort(vet, 0, vet.length-1);
		for (int i = 0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
		
	}
//	-------------------------------------------------------------------------
	public static void quickSort(int vet[], int ini, int fim) {
		int p;
		if (ini<fim) {
			p = particao(vet, ini, fim);
			quickSort(vet, ini, p-1);
			quickSort(vet, p+1, fim);
		}		
	}
	
//	-------------------------------------------------------------------------
	private static int particao(int[] vet, int ini, int fim) {
		int pivo = vet[ini]; 
		int i = ini; 
		int f = fim; 
		int aux;
		while(i<=f) {
			while(i <= fim && vet[i] <= pivo) {
				++i;
			}
			while(pivo < vet[f]) {
				--f;
			}
			if(i<f) {
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux;
				++i;
				--f;
			}
		}
		
		if (ini != f) {
			vet[ini] = vet[f];
			vet[f] = pivo;
		}
		
		return f;
	}

}
