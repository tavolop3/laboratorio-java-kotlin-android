//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            throw new Excepcion2();
        } catch(Excepcion1 e1) {
            System.out.println("Se capturó la Excepción1");
        } //catch( Excepcion2 e2) {
//            System.out.println("Se capturó la Excepción2");
//        }
    }
}