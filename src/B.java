public class B {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if((j==0 && i<n)||(i==0 && j<(n-1)&&j!=0)||((j==(n-1) && i< n)&& i!=0 && i!=(n-1))||(i== (n-1)/2 &&j<n)||(i==(n-1) && j<n && j!=(n-1))) {
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
