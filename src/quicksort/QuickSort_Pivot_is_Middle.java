package quicksort;

public class QuickSort_Pivot_is_Middle {
	public static void main(String[] args) {
		int vet[] = new int[] {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78};
		quickSort(vet, 0, vet.length-1);
		for(int i = 0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	private static void quickSort(int[] vet, int ini, int fim) {
		if(vet == null || vet.length == 0) {
			return;
		}
		
		if(ini >= fim) {
			return;
		}
		
		//Pivo central
		int meio = ini+(fim-ini)/2;
		int pivo = vet[meio];
		
		int i = ini;
		int j = fim;
		
		while(i <= j) {
			while(vet[i]<pivo) {
				i++;
			}
			while(vet[j]>pivo) {
				j--;
			}
			
			if(i<=j) {
				int aux = vet[i];
				vet[i] = vet[j];
				vet[j] = aux;
				i++;
				j--;
			}
			
			
		}
		
		if(ini < j) {
			quickSort(vet, ini, j);
		}
		
		if(fim>i) {
			quickSort(vet, i, fim);
		}
		
	}

}
