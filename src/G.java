public class G{
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if((j==0 && i<n && i!=0)||(i==0 && j<n)||(i== (n-1)/2 &&j<n && j!=1 && j!=2)||(i==(n-1) && j<n )||(i>(n-1)/2)&& j==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}