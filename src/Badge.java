import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by michael on 2016-10-08.
 */
public class Badge {
    private static final int WIDTH = 6;
    private static final int HEIGHT = 6;
    private String symbol = "#";
    private String placeHolder = " ";
    private String paint = " ";


    public static void main(String[] args){
        Badge badge = new Badge();
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
                badge.draw(reader.readLine());
            }
        }catch (Exception ex) {
            System.out.println("?");
        }
    }

    /**
     * paints the characters
     * @param text is the input
     */
    public void draw(String text){
        char c[] = text.trim().toUpperCase().toCharArray();

        for (int i = 1; i <= HEIGHT; i++ ) {
            for(int j = 0; j < text.length(); j++){
                switch (c[j]) {
                    case 'A':
                        System.out.print(drawA(i));
                        break;
                    case 'B':
                        System.out.print(drawB(i));
                        break;
                    case 'C':
                        System.out.print(drawC(i));
                        break;
                    case 'D':
                        System.out.print(drawD(i));
                        break;
                    case 'E':
                        System.out.print(drawE(i));
                        break;
                    case 'F':
                        System.out.print(drawF(i));
                        break;
                    case 'G':
                        System.out.print(drawG(i));
                        break;
                    case 'H':
                        System.out.print(drawH(i));
                        break;
                    case 'I':
                        System.out.print(drawI(i));
                        break;
                    case 'J':
                        System.out.print(drawJ(i));
                        break;
                    case 'K':
                        System.out.print(drawK(i));
                        break;
                    case 'L':
                        System.out.print(drawL(i));
                        break;
                    case 'M':
                        System.out.print(drawM(i));
                        break;
                    case 'N':
                        System.out.print(drawN(i));
                        break;
                    case 'O':
                        System.out.print(drawO(i));
                        break;
                    case 'P':
                        System.out.print(drawP(i));
                        break;
                    case 'Q':
                        System.out.print(drawQ(i));
                        break;
                    case 'R':
                        System.out.print(drawR(i));
                        break;
                    case 'S':
                        System.out.print(drawS(i));
                        break;
                    case 'T':
                        System.out.print(drawT(i));
                        break;
                    case 'U':
                        System.out.print(drawU(i));
                        break;
                    case 'V':
                        System.out.print(drawV(i));
                        break;
                    case 'W':
                        System.out.print(drawW(i));
                        break;
                    case 'X':
                        System.out.print(drawX(i));
                        break;
                    case 'Y':
                        System.out.print(drawY(i));
                        break;
                    case ('Z'):
                        System.out.print(drawZ(i));
                        break;
                    default:
                        System.out.print(putWordSpace());
                        break;
                }
                System.out.print(putCharSpace());
            }
            System.out.println();
        }
    }

    /**
     * Draws A
     */
    private String drawA(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1) {
                paint += (i == 3 || i == 4 ? symbol : placeHolder);
            } else if (row == 2) {
                paint += (i == 2 || i == 5 ? symbol : placeHolder);
            } else if (row == 3) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (symbol);
            } else if (row == 5 || row == 6){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws B
     */
    private String drawB(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 3 || row == 6) {
                paint += (i != 6 ? symbol : placeHolder);
            }
            else if (row == 2 || row == 4 || row == 5){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws C
     */
    private String drawC(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6){
                paint += (!(i == 1 || i == 6) ? symbol : placeHolder);
            } else if (row == 2 || row == 5){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 3 || row == 4) {
                paint += (i == 1 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws D
     */
    private String drawD(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6){
                paint += (i != 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 3 || row == 4 || row == 5){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws E
     */
    private String drawE(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6){
                paint += symbol;
            } else if (row == 3){
                paint += (i != 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 4 || row == 5) {
                paint += (i == 1 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws F
     */
    private String drawF(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1){
                paint += symbol;
            } else if (row == 3) {
                paint += (i != 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 4 || row == 5 || row == 6) {
                paint += (i == 1 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws G
     */
    private String drawG(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++){
            if (row == 1 || row == 6) {
                paint += (!(i == 1 || i == 6) ? symbol : placeHolder);
            } else if (row == 2 || row == 5){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 3) {
                paint += (i == 1 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (!(i == 2 || i == 3) ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws H
     */
    private String drawH(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 2 || row == 4 || row == 5 || row == 6){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 3) {
                paint += symbol;
            }
        }
        return paint;
    }

    /**
     * Draws I
     */
    private String drawI(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6){
                paint += (i != 6 ? symbol : placeHolder);
            } else {
                paint += (i == 3 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws J
     */
    private String drawJ(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 2 || row == 3 || row == 4){
                paint += (i == 6 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 6) {
                paint += (!(i == 1 || i == 6) ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws K
     */
    private String drawK(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++){
            if (row == 1 || row == 6) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 5){
                paint += (i == 1 || i == 5 ? symbol : placeHolder);
            } else if (row == 3) {
                paint += (!(i == 5 || i == 6) ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (i == 1 || i == 4 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws L
     */
    private String drawL(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 2 || row == 3 || row == 4 || row == 5) {
                paint += (i == 1 ? symbol : placeHolder);
            } else if (row == 6) {
                paint += symbol;
            }
        }
        return paint;
    }

    /**
     * Draws M
     */
    private String drawM(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 4 || row == 5 || row == 6){
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 2){
                paint += (!(i == 3 || i == 4) ? symbol : placeHolder);
            } else if (row == 3) {
                paint += (!(i == 2 || i == 5) ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws N
     */
    private String drawN(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++){
            if (row == 1 || row == 6) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 2){
                paint += (i == 1 || i == 2 || i == 6 ? symbol : placeHolder);
            } else if (row == 3) {
                paint += (i == 1 || i == 3 || i == 6 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (i == 1 || i == 4 || i == 6 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 1 || i == 5 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws O
     */
    private String drawO(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6) {
                paint += (!(i == 1 || i == 6) ? symbol : placeHolder);
            } else if (row == 2 || row == 3 || row == 4 || row == 5) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws P
     */
    private String drawP(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 4) {
                paint += (i != 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 3) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 5 || row == 6) {
                paint += (i == 1 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws Q
     */
    private String drawQ(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 ) {
                paint += (!(i == 1 || i == 6) ? symbol : placeHolder);
            } else if (row == 2 || row == 3) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (i == 1 || i == 4 || i == 6 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 1 || i == 5 || i == 6 ? symbol : placeHolder);
            } else if (row == 6) {
                paint += (!(i == 1 || i == 5) ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws R
     */
    private String drawR(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 4) {
                paint += (i != 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 3 || row == 6) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 1 || i == 5 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws S
     */
    private String drawS(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 3 || row == 6 ) {
                paint += ( !(i == 1 || i == 6) ? symbol : placeHolder);
            } else if (row == 2) {
                paint += (i == 1 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (i == 6 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws T
     */
    private String drawT(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1) {
                paint += (i != 1 ? symbol : placeHolder);
            }
            else {
                paint += (i == 4 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws U
     */
    private String drawU(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 6) {
                paint += (!(i == 1 || i == 6) ? symbol : placeHolder);
            } else {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws V
     */
    private String drawV(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 2 || row == 3 || row == 4) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 2 || i == 5 ? symbol : placeHolder);
            } else if (row == 6) {
                paint += (i == 3 || i == 4 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws W
     */
    private String drawW(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 2 || row == 3 || row == 6) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (!(i == 2 || i == 5) ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (!(i == 3 || i == 4) ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws X
     */
    private String drawX(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6) {
                paint += (i == 1 || i == 6 ? symbol : placeHolder);
            } else if (row == 2 || row == 5) {
                paint += (i == 2 || i == 5 ? symbol : placeHolder);
            } else if (row == 3 || row == 4) {
                paint += (i == 3 || i == 4 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draws Y
     */
    private String drawY(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1) {
                paint += (i == 2 || i == 6 ? symbol : placeHolder);
            } else if (row == 2) {
                paint += (i == 3 || i == 5 ? symbol : placeHolder);
            } else if (row == 3 || row == 4 || row == 5 || row == 6) {
                paint += (i == 4 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    /**
     * Draw Z
     */
    private String drawZ(int row) {
        paint = "";
        for (int i = 1; i <= WIDTH; i++) {
            if (row == 1 || row == 6) {
                paint += symbol;
            } else if (row == 2) {
                paint += (i == 5 ? symbol : placeHolder);
            } else if (row == 3) {
                paint += (i == 4 ? symbol : placeHolder);
            } else if (row == 4) {
                paint += (i == 3 ? symbol : placeHolder);
            } else if (row == 5) {
                paint += (i == 2 ? symbol : placeHolder);
            }
        }
        return paint;
    }

    private String putCharSpace() {
        return "  ";
    }

    private String putWordSpace() {
        return "     ";
    }
}