/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Fabian Rodrigo";
        String apellidoEstudiante = "Canar Calva";
        int nacimiento = 2005;
        
        /*System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento;  */
        /*
        nos sirve para dar un asalto 
        */
        System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);   
    }
}
