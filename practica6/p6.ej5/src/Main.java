//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int suma=0;
        for(int i=0;i<args.length;i++)
            try {
                suma += Integer.parseInt(args[i]);
            } catch(NumberFormatException e) {
                System.out.println(args[i]);
            }
        System.out.print("La suma es:"+suma);
    }
}