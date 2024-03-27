//array-in sort edilmesi
public class Main {
    public static void main(String[] args) {
       int [] n={2,4,1,5,3,2,1,21,3,23,21,45,3,46};
        for(int i=0; i<n.length; i++)
        {
            for(int j=0; j<n.length; j++) {
                if(n[i]<n[j])
                {
                    n[i]=n[i]+n[j];
                    n[j]=n[i]-n[j];
                    n[i]=n[i]-n[j];
                }
            }
        }

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }

/*
    *
   ***
  *****
 *******
*********
      int n=5;
  for (int i=0;i<n;i++){
      for (int j = 0; j <= n-i-1; j++) {
          System.out.print(" ");
      }
        for(int k=0; k<2*i+1;k++){
           System.out.print("*");
      }
      System.out.println();
  }
*/
    }
}