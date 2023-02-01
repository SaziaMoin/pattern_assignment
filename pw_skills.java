public class pw_skills 
{
    //S print nhi ho raha h
  public static void main(String[] args) {
    int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1&&j>1&&j<n || j==1&&i>1|| i==5&&j<n ||j==n&&i>1&&i<5) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=1;j<=n;j++)
            {
                if(j==1 || j==n || (i==j &&i>3) || i==5&&j==3)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
              /*for(int j=1;j<=n;j++)
            {
                if(i==1||i==4||i==7||j==1&&i<=4||j==7&&i>=n)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.print(" ");*/
            for(int j=1;j<=n;j++)
            {
                if(j==1||(i+j)==n-2 ||(i-j)==(n-1)/2)
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==4||i==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=1;j<=n;j++)
            {
                if(j==1||i==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=1;j<=n;j++)
            {
                if(j==1||i==n)
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
