public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 26;
        int c = 20 ;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is bigger");
            }
            else{
                System.out.println("c is bigger");
            }
        }
        else if (b>a)
        {
            if(b>c)
            {
                System.out.println("b is bigger");
            }
            else
            {
                System.out.println("c is bigger");
            }
        }

    }
}