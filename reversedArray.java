public class reversedArray {
    
    
    
    public static void reversed(int a[], int n) {

        int arr[] = new int[n];
        int b= n;
        for(int i=0; i<n;i++) {
        //nilai indeks array kanan = nilai indeks awal array
        arr[b-1] = a[i];
        b=b-1;

        }
        //Tampilkan nilai 
        for (int data : a) {
            System.out.print(" "+data);
            
        }
            
        }
        
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50};
        reversed(array, array.length);
    }
}
