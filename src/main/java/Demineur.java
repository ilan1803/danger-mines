
import java.util.Arrays;
import java.util.Scanner;

public class Demineur {

    public static void main(String[] args) {

        String level;
        int ligne = 0;
        int colonne = 0;
        int mines = 0;
        int x = 0;
        int y = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("choisie un niveau: \nd = dificile\nm = moyen\nf = facile");
        level = sc.nextLine();

        if (level == "d") {
            colonne = ligne = 15;
            mines = 100;
        }
        if (level == "m") {
            colonne = ligne = 10;
            mines = 30;
        }
        if (level == "f") {
            colonne = ligne = 5;
            mines = 10;
        }

        int[][] jeu = new int[colonne][ligne];

        while (x < ligne) {
            while (y < colonne) {
                jeu[x][y] = 0;
                y++;
            }
            x++;
        }

        while (mines > 0) {
            for (x = 0, y = 0; x < ligne; y += Math.random() * 10, x++) {
                for (int tmp = 0; tmp < colonne; tmp++) {
                    if (mines == 0) {
                        return;
                    }
                    jeu[x][y] = 1;
                    mines--;
                }
                if (mines == 0) {
                    return;
                }
            }
        }
        
        

    }
}
