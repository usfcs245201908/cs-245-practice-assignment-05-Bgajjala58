public class MergeSort implements SortingAlgorithm
{


	public void sort(int [] a){
		int leftpoint = 0;
		int rightpoint = a.length -1;

		sort(a,leftpoint,rightpoint);


		}


	public void sort(int a[], int leftp, int rightp) 
    { 
        if (leftp < rightp) 
        { 
            
            int middle = (leftp+rightp)/2;  
            sort(a, leftp, middle); 
            sort(a , middle+1, rightp); 
            merge(a, leftp, middle, rightp); 
        } 
    } 

	public void merge(int a[], int l, int m, int r) 
    { 
       
       int number1 = m-l+1;
       int number2 = r-m;
        int left[] = new int [number1]; 
        int right[] = new int [number2]; 
  
        for (int i=0; i<number1; ++i) 
            left[i] = a[l + i]; 
        for (int j=0; j<number2; ++j) 
            right[j] = a[m + 1+ j]; 
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < number1 && j < number2) 
        { 
            if (left[i] <= right[j]) 
            { 
                a[k] = left[i]; 
                i++; 
            } 
            else
            { 
                a[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < number1) 
        { 
            a[k] = left[i]; 
            i++; 
            k++; 
        } 
        while (j < number2) 
        { 
            a[k] = right[j]; 
            j++; 
            k++; 
        } 
    } 

	}

