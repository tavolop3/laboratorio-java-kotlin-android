//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println(unMetodo());
    }
    public static int unMetodo(){
        try {
            System.out.println("Va a retornar 1");
            return 1;
        } finally {
            System.out.println("Va a retornar 2");
            return 2;
        }
    }

}