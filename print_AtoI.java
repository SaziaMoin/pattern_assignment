public class print_AtoI
{
    public static void main(String[] args) {
    int n=10;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1&&j>1&&j<7 || j==1&&i>1|| i==5&&j<=7 || j==7&&i>1) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=1;j<=8;j++)
            {
                if(j==1||(i==1||i==5||i==10)&&j%2==1||j==8&&i!=1&& i!=5 && i!=10)
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
                if(i==1&&j>1&&j<7||j==1&&i>1&&i<10||i==10&&j>1&&j<7
                ||j==7&&i>1&&i<3||j==7&&i==9)
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
                if(i==1&&j<7 ||j==1 ||i==10&&j<7 || j==7&&i>1&&i<10)
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
                if(i==1||j==1||i==5||i==10)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=1;j<=n;j++)
        {
            if(i==1||j==1||i==5)
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
            //if(i==1||j==1||i==5&&j>3||(i==7&&j==10)||i==10)
            if(i==1&&j>1&&j<7||j==1&&i>1&&i<10||i==10&&j>1&&j<7||i==5&&j>3
            ||j==7&&i>1&&i<3||j==7&&i>=5)
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
                if(j==1||j==10||i==5)
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
                if(i==1||i==10||j==5)
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
