/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op;
        Agencia agencia = new Agencia();
        agencia.setNombre("Mi Agencia");
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
                    while(!"N".equals(op1)){
                        
                        String nombre = "";
                        String ci = "";
                        String tel = "";
                        while(nombre.length() == 0){  
                            System.out.println("Ingrese el nombre del cliente");
                            nombre=sc.nextLine();
                            if(nombre.length() == 0){   
                                System.out.println("Debe ingresar un nombre.");
                            }
                        }
                        while(Ci.length() == 0){
                            System.out.println("Ingrese numero de cedula");                            
                            Ci=sc.nextLine();
                            if(Ci.length() == 0){
                                System.out.println("Ingrese numero de cedula");
                             }
                         }
                        while(tel.length() == 0){
                            
                            System.out.println("Ingrese su numero de telefono ");                            
                            tel=sc.nextLine();
                            if(tel.length() == 0){
                                
                                System.out.println("Ingrese su numero de telefono ");
                            }
                        }
                        
                        Cliente p1=new Cliente(0,"nombre","cedula");
                        
                        agencia.registrarCliente(p1);
                        System.out.println("Cliente registrado: " + p1.toString());
                        System.out.println("¿Desea seguir registrando? (S/N)");
                        op1 = sc.nextLine().toUpperCase();
                    }
                    
                    break;
                case 2:
                    String op2 = "S";
                    while(!op2.equalsIgnoreCase("N")) {
                        String nombre = "";
                        String ci = "";
                        String idAgente = "";
                        while(nombre.length() == 0){
                            System.out.println("Ingrese el nombre del agente:");
                            nombre = sc.nextLine();
                            if(nombre.length() == 0){
                                System.out.println("Debe ingresar un nombre.");
                            }
                        }

                        while(ci.length() == 0){
                            System.out.println("Ingrese número de cédula:");
                            ci = sc.nextLine();
                            if(ci.length() == 0){
                                System.out.println("Debe ingresar un número de cédula.");
                            }
                        }

                        while(idAgente.length() == 0){
                            System.out.println("Ingrese ID del agente:");
                            idAgente = sc.nextLine();
                            if(idAgente.length() == 0){
                                System.out.println("Debe ingresar un ID.");
                            }
                        }
                        AgenteInmobiliario agente = new AgenteInmobiliario();
                        agente.setIdAgente(idAgente);
                        agente.setNombre(nombre);
                        agente.setCi(ci);
                        agente.setComisionAcumulada(0.0);
                        agente.setPropiedadesAsignadas(new ArrayList<>());

                        agencia.registrarAgente(agente);

                        System.out.println("Agente registrado: " + agente.toString());

                        System.out.println("¿Desea seguir registrando? (S/N)");
                        op2 = sc.nextLine().toUpperCase();
                    }
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
