public class InsertionSort implements SortingAlgorithm
{

	public void sort(int [] a){

        int n = a.length; 
        for (int i = 1; i < n; ++i) { 
            int next = a[i]; 
            int x = i - 1; 
  
            while (x >= 0 && a[x] > next) { 
                a[x + 1] = a[x]; 
                x = x - 1; 
            } 
            a[x + 1] = next; 
        } 


}	
}
