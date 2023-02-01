public class triangle2
{
   public static void main(String[] args) {
    int n=11;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if((j-i)==(n-1)/2||(i+j)==n-5||i==6)
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
