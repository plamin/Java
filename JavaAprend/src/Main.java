import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        String pais = "";

        System.out.println("Quantas copas o país tem? ");
        int copa = teste.nextInt();

        if (copa == 5){
            pais = "Brasil";
        } else if (copa == 4) {
            pais = "Alemanha";
        } else if (copa > 5) {
            pais = "inexistente";
        }
        System.out.println("O país é "+ pais);

    }
}
