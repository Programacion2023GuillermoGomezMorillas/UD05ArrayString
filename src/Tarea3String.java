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

    public StringBuilder quitaVocales(String frase) {
       String listaNegra="aeiouáéíóúàèìòù";
       StringBuilder fraseSinVocales= new StringBuilder();
        for (int k=0 ; k<frase.length(); k++){
            String a = String.valueOf(frase.charAt(k));
            if(listaNegra.contains((a.toLowerCase()))){
                fraseSinVocales.append("");
        }
            else {
                fraseSinVocales.append(frase.charAt(k));
            }
            }
        return fraseSinVocales;
    }
}
