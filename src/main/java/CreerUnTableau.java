
public class CreerUnTableau {

    int colonne, ligne, mines;
    int[][] jeu;

    CreerUnTableau(String level) {

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
        jeu = new int[ligne][colonne];
        this.setJeu(jeu);

    }

    public int[][] getJeu() {

        while (mines > 0) {
            for (int x = 0, y = 0; x < ligne; y += Math.random() * 10, x++) {
                for (int tmp = 0; tmp < colonne; tmp++) {
                    if (mines == 0) {
                        break;
                    }
                    jeu[x][y] = 1;
                    mines--;
                }
                if (mines == 0) {
                    break;
                }
            }
        }
        return jeu;

    }

    public void setJeu(int[][] jeu) {

        this.jeu = jeu;

    }

}
