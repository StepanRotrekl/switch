
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);

        System.out.println("Zadej cislo od 1 do 7");

        int cislo1 = main.nextInt();

        switch (cislo1) {
            case 1:
                System.out.print("dnes je pondeli");
                break;
            case 2:
                System.out.print("dnes je utery");
                break;
            case 3:
                System.out.print("dnes je streda");
                break;
            case 4:
                System.out.print("dnes je ctvrtek");
                break;
            case 5:
                System.out.print("dnes je patek");
                break;
            case 6:
                System.out.print("dnes je sobota");
                break;
            case 7:
                System.out.print("dnes je nedele");
                break;

        }
    }
}