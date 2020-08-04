import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Palindrome {

    public static void main(String[] arrgs) throws java.lang.Exception {
        List<String> palabras = new ArrayList<>(
                Arrays.asList(
                        "civic",
                        "deleveled",
                        "Hannah",
                        "kayak",
                        "level",
                        "examiron",
                        "racecar",
                        "radar",
                        "refer",
                        "reviver",
                        "easywcf",
                        "rotator",
                        "rotor",
                        "sagas",
                        "solos",
                        "stats",
                        "tenet",
                        "Csharpstar",
                        "",
                        null
                ));

        if (!palabras.isEmpty()) {
            for (String palabra : palabras) {
                int init = 0;
                int fin = 0;
                boolean error = false;

                if (null != palabra && palabra.length() > 0) {
                    fin = palabra.length() - 1;

                    while ((init < fin) && (!error)) {
                        if (palabra.toLowerCase().charAt(init) == palabra.toLowerCase().charAt(fin)) {
                            init++;
                            fin--;
                        } else {
                            error = true;
                        }
                    }

                    if (!error) {
                        System.out.println("Es un palindromo : " + palabra);
                    } else {
                        System.out.println("No es un palindromo : " + palabra);
                    }
                } else {
                    System.out.println("Palabra vacia");
                }

            }
        }
    }
}