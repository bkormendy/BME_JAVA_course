import java.util.Scanner;

//Hello, world! a la Java
public class Hello {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hogy hívnak?");
        String nev = input.nextLine();
        System.out.println("Hello, " + nev + "!");
    }
}
