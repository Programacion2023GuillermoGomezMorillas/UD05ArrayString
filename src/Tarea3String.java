public class Tarea3String {

    public boolean esCorrectoNIF(String nif) {
        boolean nifCorrecto = false;
        String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
        int soloNumeroNif = Integer.parseInt(nif.substring(0,7));
        String letra = nif.substring(8);
        int moduloNif = soloNumeroNif % 23;
        if (nif.length() == 9 && nif.substring(0, 7).matches("[0-9]*") && nif.substring(8).matches("[A-Z]*") && nif.substring(8).equals(String.valueOf(letrasNif.charAt(moduloNif)))) {
            nifCorrecto=true;
            }
        return nifCorrecto;
            }

}
