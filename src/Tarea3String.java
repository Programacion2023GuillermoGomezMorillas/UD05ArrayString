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
     * @param frase
     * @return Devuelva un String con la frase sin vocales
     */
    public StringBuilder quitaVocales(String frase) {
       StringBuilder fraseSinVocales= new StringBuilder();
        //Creo un String con las letras que quiero quitar
       String listaNegra="aeiouáéíóúàèìòù";
       //Recorre la lista para ver si la frase introducida tiene letras que esten en la variable listaNegra
        for (int k=0 ; k<frase.length(); k++){
            //Guardo las letras en la variable a
            String a = String.valueOf(frase.charAt(k));
            //Condiciono para saber si existe la letra en la listaNegra, también pongo que todas las letras introducidas sean mayúsculas
            if(listaNegra.contains((a.toLowerCase()))){
                fraseSinVocales.append("");
        }
            else {
                fraseSinVocales.append(frase.charAt(k));
            }
            }
        return fraseSinVocales;
    }

    /**
     * Quita espacios y los sustituye por *
     * @param frase
     * @return devuelve el string a, que es la frase sin espacios y con *
     */
    public String quitaEspaciosSobrantes(String frase){
        //Este método de String sustituye todos los espacios, tabulaciones y retornos por *
            String a = frase.replaceAll("\\s","*");
        return a;
    }
    public StringBuilder invertir(String frase){
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i=frase.length()-1 ; i>=0 ; i--){
            fraseInvertida.append(frase.charAt(i));
        }
        return fraseInvertida;
    }
    public int repeticiones(String frase, String palabra ) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            String fraseCortada;
            String primeraLetra = String.valueOf(palabra.charAt(i));
            if (frase.contains(primeraLetra));{
                fraseCortada = frase.substring(palabra.length());
                if (fraseCortada.equalsIgnoreCase(palabra)) {
                    cont++;
                }
            }
        }
        return cont;
    }
}
