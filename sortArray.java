public class sortArray {
   
    //input [0,1,0,0,1,1]
    //output[0,0,0,1,1,1]

    public static void sort(int a[], int n) {
        //tentukan nilai indexs of string 0 
        //count setiap indexs yang berniali 0 
        // search value 0 berdasarkan count
        // kemudian mencari value 1 berdasarkan count
       
        int count=0;
        
        for(int i=0;i<n;i++) {
            if(a[i]==0) {
                count++;
            }
        }
        for (int i=0; i<count;i++) {
            a[i]=0;
        }

        for(int i=count;i<n;i++) {
            a[i]=1;
        }

        for (int data : a) {
            System.out.print(" "+data);
            
        }
        
    }

    public static void main(String[] args) {
        int arr[] = new int [] {0,1,0,0,1,1};
        sort(arr, arr.length);
    }
}
