
import java.util.Scanner;

public class Demineur {

    public static void main(String[] args) {

        String level;

        Scanner sc = new Scanner(System.in);
        System.out.println("choisie un niveau:\nd = dificile\nm = moyen\nf = facile");
        level = sc.nextLine();

        CreerUnTableau jeu = new CreerUnTableau(level);
        
    }
}
