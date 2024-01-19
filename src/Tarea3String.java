import java.util.Arrays;

public class Tarea3String {
    /**
     * @param nif
     * @return
     */
    public boolean esCorrectoNIF(String nif) {
        boolean nifCorrecto = false;
        String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
        //Convierto el los 8 numeros en un int
        int soloNumeroNif = Integer.parseInt(nif.substring(0, 8));
        //Guardo solo la letra en una variable
        String letra = nif.substring(8);
        //Guardo el resto del DNI en una variable
        int moduloNif = soloNumeroNif % 23;
        //Primero compruebo el largo de la cadena de texto, segundo compruebo que los numeros son números, tercero compruebo que la ultima posicion de dni es una letra, y por ultimo compruebo que la letra es igual que la letra en la posición de el modulo
        if (nif.length() == 9 && nif.substring(0, 8).matches("[0-9]*") && letra.matches("[A-Za-z]*") && letra.equalsIgnoreCase(String.valueOf(letrasNif.charAt(moduloNif)))) {
            //Si el if es correcto cambio la variable a true
            nifCorrecto = true;
        }
        return nifCorrecto;
    }

    /**
     * Método para quitar las vocales
     *
     * @param frase
     * @return Devuelva un String con la frase sin vocales
     */
    public StringBuilder quitaVocales(String frase) {
        StringBuilder fraseSinVocales = new StringBuilder();
        //Creo un String con las letras que quiero quitar
        String listaNegra = "aeiouáéíóúàèìòù";
        //Recorre la lista para ver si la frase introducida tiene letras que esten en la variable listaNegra
        for (int k = 0; k < frase.length(); k++) {
            //Guardo las letras en la variable a
            String a = String.valueOf(frase.charAt(k));
            //Condiciono para saber si existe la letra en la listaNegra, también pongo que todas las letras introducidas sean mayúsculas
            if (listaNegra.contains((a.toLowerCase()))) {
                fraseSinVocales.append("");
            } else {
                fraseSinVocales.append(frase.charAt(k));
            }
        }
        return fraseSinVocales;
    }

    /**
     * Quita espacios y los sustituye por *
     *
     * @param frase
     * @return devuelve el string a, que es la frase sin espacios y con *
     */
    public String quitaEspaciosSobrantes(String frase) {
        //Este método de String sustituye todos los espacios, tabulaciones y retornos por *
        String a = frase.replaceAll("\\s", "*");
        return a;
    }

    /**
     * @param frase
     * @return Devuelve la frase invertida
     */
    public StringBuilder invertir(String frase) {
        StringBuilder fraseInvertida = new StringBuilder();
        //Recorre la frase desde atrás hacia delante y va construyendo el string
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }
        return fraseInvertida;
    }

    /**
     * @param frase
     * @param palabra
     * @return Devuelve la cantidad de veces que la palabra existe en la frase
     */
    public int repeticiones(String frase, String palabra) {
        int cont = 0;
        //Mientras que la palabra exista el bucle continua
        while (frase.indexOf(palabra) > -1) {
            //La frase va eliminando las palabras que les vamos metiendo hasta que no quede ninguna
            //y al volver al bucle, al no haber ninguna, el valor va a ser -1 y saldrá de él
            frase = frase.substring(frase.indexOf(palabra) + palabra.length(), frase.length());
            cont++;
        }
        return cont;
    }

    /**
     * @param frase
     * @return Devuelve si es o no un palindromo
     */
    public boolean palindromo(String frase) {
        boolean esPalindromo = false;
        String fraseInvertida = String.valueOf(invertir(frase.toLowerCase()));
        if (fraseInvertida == frase.toLowerCase()) {
            esPalindromo = true;
        }
        return esPalindromo;
    }

    /**
     * @param frase
     * @return Cibra el texto con el cifrado César
     */
    public StringBuilder cifrar(String frase) {
        StringBuilder textoCifrado = new StringBuilder();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) > 'z') {
                textoCifrado.append((char) (frase.charAt(i) - 26 + 3));

            } else {
                textoCifrado.append((char) (frase.charAt(i) + 3));
            }
        }
        return textoCifrado;
    }

    /**
     * @param frase
     * @return Metodo para descifrar un texto en César
     */
    public StringBuilder descifrar(String frase) {
        StringBuilder textoCifrado = new StringBuilder();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) - 3 < 'a') {
                textoCifrado.append((char) (frase.charAt(i) + 26 - 3));
            } else {
                textoCifrado.append((char) (frase.charAt(i) - 3));
            }
        }
        return textoCifrado;
    }

    public void cuentaCaracteres(String frase) {
        int contador = 0;
        System.out.println("Frase: " + frase + "\nResultado:");
        for (char i = 'a'; i <= 'z'; i++) {
            contador = repeticiones(frase, String.valueOf(i));
            if (contador != 0) {
                System.out.println(i);
                //System.out.println(frase.charAt(i) + ": " + contador + " vez/veces" );
            }
        }
    }
}

