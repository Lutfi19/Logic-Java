public class negatifLoop{
    
    public static void loop(int n) {
    for(int i=0; i<=n;i++) {
        if(i % 2==0) {
          System.out.print(-i+" ");
           }
        else {
            System.out.print(i+" ");
        }
       }
      }
  
      public static void main(String[] args) {
          loop(10);
      }
  
  }