public class Main {
    public static void main(String[] args) {
        Exp exp=new Exp();
        try {
            exp.func();
            exp.tryCatch();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}