/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("""
                               Menu
                               1. Registrar Cliente
                               2. Registrar agente inmobiliario
                               3. Registrar propiedad (Casa, departamento o terreno)
                               4. Asignar agente a propiedad
                               5. Listar propiedades por estado o tipo
                               6. Registrar contrato de venta
                               7. Registrar contrato de alquiler
                               8. Agendar visita
                               9. Listar visitas programadas por cliente
                               10. Generar reporte de propiedad de propiedades vendidas y alquiladas
                               11. Calcular comisiones por agente
                               12. Salir
                               """);
            System.out.println("Elija una opción: ");
            op=sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1://Pendiente revisar
                    System.out.printf("Ha elegido la opción de registrar cliente%n");
                    Persona p1=new Cliente(0,"","","","");
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese numero de cedula");
                    String Ci=sc.nextLine();
                    System.out.println("Ingrese su numero de telefono ");
                    String tel=sc.nextLine();
                    p1.setNombre(nombre);
                    p1.setCi(Ci);
                    
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    System.out.println("Gracias por utilizar el sistema");
                    break;
            }
        }while(op!=12);
    }
    
}
