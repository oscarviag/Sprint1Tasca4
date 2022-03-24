package n1exercici2;

public class CalculoDni {
	
	public static char calcularLletra(String dniCaracter){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroDni = Integer.parseInt(dniCaracter);
        int resto = numeroDni%23;
        return caracteres.charAt(resto);
   }
	
	

}
