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
                    String op3 = "S";
                    while(!op3.equalsIgnoreCase("N")) {
                        System.out.println("Seleccione tipo de propiedad:");
                        System.out.println("1. Casa");
                        System.out.println("2. Departamento");
                        System.out.println("3. Terreno");
                        int tipoProp = Integer.parseInt(sc.nextLine());
                
                        System.out.println("Ingrese dirección:");
                        String direccion = sc.nextLine();
                
                        System.out.println("Ingrese precio:");
                        double precio = Double.parseDouble(sc.nextLine());
                
                        Propiedad propiedad = null;
                
                        switch(tipoProp){
                            case 1: // Casa
                                System.out.println("Ingrese número de habitaciones:");
                                int numHabitaciones = Integer.parseInt(sc.nextLine());
                
                                System.out.println("¿Tiene garaje? (S/N):");
                                String garaje = sc.nextLine();
                                boolean tieneGaraje = garaje.equalsIgnoreCase("S");
                
                                propiedad = new Casa(numHabitaciones, tieneGaraje, direccion, precio);
                                break;
                
                            case 2: // Departamento
                                System.out.println("Ingrese piso:");
                                int piso = Integer.parseInt(sc.nextLine());
                
                                System.out.println("Ingrese número de habitaciones:");
                                int habDepto = Integer.parseInt(sc.nextLine());
                
                                System.out.println("¿Tiene ascensor? (S/N):");
                                String ascensor = sc.nextLine();
                                boolean tieneAscensor = ascensor.equalsIgnoreCase("S");
                
                                propiedad = new Departamento(piso, habDepto, tieneAscensor, direccion, precio);
                                break;
                
                            case 3: // Terreno
                                System.out.println("Ingrese área en m²:");
                                double area = Double.parseDouble(sc.nextLine());
                
                                System.out.println("Ingrese tipo de suelo:");
                                String tipoSuelo = sc.nextLine();
                
                                propiedad = new Terreno(area, tipoSuelo, direccion, precio);
                                break;
                
                            default:
                                System.out.println("Tipo de propiedad no válido.");
                        }
                
                        if(propiedad != null){
                            propiedad.setEstado(EstadoPropiedad.DISPONIBLE); 
                            propiedad.setAgenteAsignado(null);
                            agencia.registrarPropiedad(propiedad); 
                            System.out.println("Propiedad registrada: " + propiedad.toString());
                        }
                
                        System.out.println("¿Desea registrar otra propiedad? (S/N)");
                        op3 = sc.nextLine().toUpperCase();
                    }
                  
                    break;
                case 4:
                    if (agencia.getPropiedades().isEmpty()) {
                        System.out.println("No hay propiedades registradas.");
                        break;
                    }
                    if (agencia.getAgentes().isEmpty()) {
                        System.out.println("No hay agentes registrados.");
                        break;
                    }
                
                    System.out.println("=== Propiedades disponibles ===");
                    for (int i = 0; i < agencia.getPropiedades().size(); i++) {
                        Propiedad p = agencia.getPropiedades().get(i);
                        System.out.println((i + 1) + ". " + p.getDireccion() + " - Estado: " + p.getEstado());
                    }
                
                    System.out.print("Seleccione el número de la propiedad: ");
                    int propIndex = Integer.parseInt(sc.nextLine()) - 1;
                
                    if (propIndex < 0 || propIndex >= agencia.getPropiedades().size()) {
                        System.out.println("Opción inválida.");
                        break;
                    }
                
                    Propiedad propiedad = agencia.getPropiedades().get(propIndex);
                
                    System.out.println("\n=== Agentes disponibles ===");
                    for (int i = 0; i < agencia.getAgentes().size(); i++) {
                        AgenteInmobiliario a = agencia.getAgentes().get(i);
                        System.out.println((i + 1) + ". " + a.getNombre() + " (ID: " + a.getIdAgente() + ")");
                    }
                
                    System.out.print("Seleccione el número del agente: ");
                    int agenteIndex = Integer.parseInt(sc.nextLine()) - 1;
                
                    if (agenteIndex < 0 || agenteIndex >= agencia.getAgentes().size()) {
                        System.out.println("Opción inválida.");
                        break;
                    }
                
                    AgenteInmobiliario agente = agencia.getAgentes().get(agenteIndex);
                
                    // Asignar agente a la propiedad
                    propiedad.setAgenteAsignado(agente);
                    agente.asignarPropiedad(propiedad);
                
                    System.out.println("Propiedad '" + propiedad.getDireccion() + "' asignada al agente " + agente.getNombre());
                    break;
                case 5:
                    if (agencia.getPropiedades().isEmpty()) {
                        System.out.println("No hay propiedades registradas.");
                        break;
                    }
                
                    System.out.println("=== Listar propiedades ===");
                    System.out.println("1. Por estado");
                    System.out.println("2. Por tipo");
                    System.out.print("Seleccione una opción: ");
                    int opcionLista = Integer.parseInt(sc.nextLine());
                
                    List<Propiedad> propiedades = agencia.getPropiedades();
                    List<Propiedad> filtradas = new ArrayList<>();
                
                    switch (opcionLista) {
                        case 1:
                            System.out.print("Ingrese el estado a buscar (ejemplo: Disponible, Vendida, En alquiler): ");
                            String estadoBuscado = sc.nextLine().trim().toLowerCase();
                
                            for (Propiedad p : propiedades) {
                                if (p.getEstado().toLowerCase().equals(estadoBuscado)) {
                                    filtradas.add(p);
                                }
                            }
                            break;
                
                        case 2:
                            System.out.print("Ingrese el tipo de propiedad (ejemplo: Casa, Departamento, Terreno): ");
                            String tipoBuscado = sc.nextLine().trim().toLowerCase();
                
                            for (Propiedad p : propiedades) {
                                if (p.getTipo().toLowerCase().equals(tipoBuscado)) {
                                    filtradas.add(p);
                                }
                            }
                            break;
                
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                
                    if (filtradas.isEmpty()) {
                        System.out.println("No se encontraron propiedades con ese criterio.");
                    } else {
                        System.out.println("\n=== Propiedades encontradas ===");
                        for (Propiedad p : filtradas) {
                            System.out.println(p);
                        }
                    }
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
