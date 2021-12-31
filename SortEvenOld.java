public class SortEvenOld {
    
    public static void sort(int arr[], int n ) {


        //Ambil semua data 
        //IF genap maka ubah/swap elemen menjadi indeks diawal dan seterusnya 

        int j = -1;
        int temp;
        
        for(int i=0; i<n;i++) {
            if(arr[i]%2==0) {
                j++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } 
        }
        //nilai genap 

        for (int data : arr) {

            System.out.print(" "+ data);
            
        }


    }

    public static void main(String[] args) {
        int array [] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        sort(array, array.length);

    }
}
