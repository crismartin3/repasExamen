package examencristina;

import java.util.Scanner;

/**
 *
 * @author Cristina
 */
public class ExamenCristina {

    static Scanner entrada = new Scanner(System.in);
    static char a, e, i, o, u;

    public static void main(String[] args) {
        boolean pentavolica = false;
        String cadena = "";
        entrarCadena(cadena);
        pentavocaliques(cadena, pentavolica);
    }

    /**
     * ACCIO entrarCadena ==> Llegeix la cadena que entra l'usuari i la guarda
     * en un String. Li entro per pràmetre una cadena buida.
     *
     * @param cadena
     */
    static void entrarCadena(String cadena) {
        System.out.println("Escriu una paraula:");
        cadena = entrada.nextLine();

    }

    /**
     * ACCIO pentavocaliques ==> Li entra una cadena i la passa a una array de
     * caràcters. Tot seguit entra en una cerca que mentre no sigui pentavolica
     * anirà executant el subprograma esVocal, i comprovarà que es guanyador,
     * quan sigui guanyador acabarà el bucle i retorna si és una paraula
     * pentavocàlica o no.
     *
     * @param cadena
     * @param pentavolica
     */
    static void pentavocaliques(String cadena, boolean pentavolica) {
        int p = 0;
        char[] subcadena;
        subcadena = cadena.toCharArray();
        
        while (!pentavolica && p < cadena.length()) {
            esVocal(subcadena);
            if (guanya(a, e, i, o, u) == true) {
                pentavolica = true;
            } else {
                p = p + 1;
            }
            

        }
        // QUAN hagi acabat la cerca escriure SI en cas de que sigui pentavolica, i NO en cas de que no ho sigui.
        if (pentavolica) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * ACCIO esVocal ==> Li entra l'array de caràcters subcadena, en la qual
     * comprovarà mitjançant un bucle cada posició si conté una de les vocals.
     * Quan acabi el vucle tornarà al programa principal que comprovarà si ha
     * trobat o no les 5 vocals.
     *
     * @param subcadena
     */
    static void esVocal(char[] subcadena) {
        for (int j = 0; j <= subcadena.length - 1; j++) {
            if (subcadena[j] == 'a') {
                a = 1;
            } else if (subcadena[j] == 'e') {
                e = 1;
            } else if (subcadena[j] == 'i') {
                i = 1;
            } else if (subcadena[j] == 'o') {
                o = 1;
            } else if (subcadena[j] == 'u') {
                u = 1;
            }
        }

    }

    /**
     * FUNCIO guanya ==> Aquesta funció comprova que la paraula conté les 5
     * vocals diferents i retorna un valor true.
     *
     * @param a
     * @param e
     * @param i
     * @param o
     * @param u
     * @return
     */
    static boolean guanya(int a, int e, int i, int o, int u) {
        if (a == 1 && e == 1 && i == 1 && o == 1 && u == 1) {
            return true;
        }
        return false;
    }
}
