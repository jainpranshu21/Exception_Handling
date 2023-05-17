import java.util.Scanner;

public class Exp {
    public void func() throws Exception{
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a==0)throw new Exception("Not valid");
        int r=10/a;
        System.out.println(r);
    }

    public void tryCatch(){
        try{
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            int []arr=new int[n];
            for (int i=0;i<n+1;i++)
                System.out.print(arr[i]+" ");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
