package rubiksolver;

/**
 *
 * @author arthu
 */
public class Cube {

    private FaceColor[][] tab;

    private enum FaceColor {
        RED,
        ORANGE,
        YELLOW,
        WHITE,
        BLUE,
        GREEN,
        NO_COLOR
    }

    /**
     * Create a solved cube
     *
     */
    public Cube() {
        // Create the array
        tab = new FaceColor[12][];
        for (int i = 0; i <= 11; i++) {
            tab[i] = new FaceColor[9];
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = FaceColor.NO_COLOR;
            }
        }

        // Place the faces
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                tab[i][j + 3] = FaceColor.GREEN;
                tab[i + 3][j] = FaceColor.RED;
                tab[i + 3][j + 3] = FaceColor.WHITE;
                tab[i + 3][j + 6] = FaceColor.ORANGE;
                tab[i + 6][j + 3] = FaceColor.BLUE;
                tab[i + 9][j + 3] = FaceColor.YELLOW;
            }
        }
    }

    public void print() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (tab[i][j] == FaceColor.NO_COLOR) {
                    System.out.print("    ");
                } else {
                    String color = tab[i][j].toString().substring(0, 3);
                    System.out.print(color + " ");
                }
            }
            System.out.println("");
        }
    }
}
