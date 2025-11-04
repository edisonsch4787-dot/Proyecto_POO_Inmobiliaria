/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo_inmobiliaria;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agencia agencia = new Agencia("InmoEcuador");

        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE ADMINISTRACIÓN INMOBILIARIA =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar agente inmobiliario");
            System.out.println("3. Registrar propiedad (Casa, Departamento o Terreno)");
            System.out.println("4. Asignar agente a propiedad");
            System.out.println("5. Listar propiedades por estado o tipo");
            System.out.println("6. Registrar contrato de venta");
            System.out.println("7. Registrar contrato de alquiler");
            System.out.println("8. Agendar visita");
            System.out.println("9. Listar visitas programadas por cliente");
            System.out.println("10. Generar reporte de propiedades vendidas y alquiladas");
            System.out.println("11. Calcular comisiones por agente");
            System.out.println("12. Salir");
            System.out.print("Seleccione una opción: ");
            //Conversion de tipo String a entero
            opcion = Integer.parseInt(sc.nextLine());

            try {
                switch (opcion) {
                    case 1 -> registrarCliente(sc, agencia);
                    case 2 -> registrarAgente(sc, agencia);
                    case 3 -> registrarPropiedad(sc, agencia);
                    case 4 -> asignarAgente(sc, agencia);
                    case 5 -> listarPropiedades(sc, agencia);
                    case 6 -> registrarContrato(sc, agencia, TipoContrato.VENTA);
                    case 7 -> registrarContrato(sc, agencia, TipoContrato.ALQUILER);
                    case 8 -> agendarVisita(sc, agencia);
                    case 9 -> listarVisitasCliente(sc, agencia);
                    case 10 -> generarReporte(agencia);
                    case 11 -> calcularComisiones(agencia);
                    case 12 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        } while (opcion != 12);
    }

    // 1️⃣ Registrar Cliente
    private static void registrarCliente(Scanner sc, Agencia agencia) throws Exception {
        System.out.print("Ingrese ID: ");
        String id = sc.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese CI: ");
        String ci = sc.nextLine();

        Cliente c = new Cliente(id, nombre, ci);
        agencia.registrarCliente(c);
    }

    
    private static void registrarAgente(Scanner sc, Agencia agencia) throws Exception {
        System.out.print("Ingrese ID Agente: ");
        String idAgente = sc.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresar cedula: ");
        String ci= sc.nextLine();
        AgenteInmobiliario a = new AgenteInmobiliario(idAgente, nombre,ci);
        agencia.registrarAgente(a);
    }

    
    private static void registrarPropiedad(Scanner sc, Agencia agencia) throws Exception {
        System.out.println("Seleccione tipo de propiedad:");
        System.out.println("1. Casa");
        System.out.println("2. Departamento");
        System.out.println("3. Terreno");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese ID de la propiedad: ");
        String id = sc.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = Double.parseDouble(sc.nextLine());

        Propiedad p1 = null;
        switch (tipo) {
            case 1 -> {
                System.out.print("Número de habitaciones: ");
                int hab = Integer.parseInt(sc.nextLine());
                System.out.print("¿Tiene garaje? (true/false): ");
                boolean garaje = Boolean.parseBoolean(sc.nextLine());
                p1 = new Casa(hab,id,direccion,precio ,garaje);
            }
            case 2 -> {
                System.out.print("Número de piso: ");
                int piso = Integer.parseInt(sc.nextLine());
                System.out.print("Número de habitaciones: ");
                int nh = Integer.parseInt(sc.nextLine());
                System.out.print("¿Tiene ascensor? (true/false): ");
                boolean asc = Boolean.parseBoolean(sc.nextLine());
                p1 = new Departamento(piso, nh,id, direccion,precio, asc);
            }
            case 3 -> {
                System.out.print("Área en m²: ");
                double area = Double.parseDouble(sc.nextLine());
                System.out.print("Tipo de suelo: ");
                String suelo = sc.nextLine();
                p1 = new Terreno(area, suelo, id, direccion, precio);
            }
        }

        if (p1 != null) agencia.registrarPropiedad(p1);
    }

    private static void asignarAgente(Scanner sc, Agencia agencia) throws Exception {
        System.out.print("Ingrese ID del agente: ");
        String idAgente = sc.nextLine();
        System.out.print("Ingrese ID de la propiedad: ");
        String idProp = sc.nextLine();

        AgenteInmobiliario agente = agencia.buscarAgente(idAgente);
        Propiedad propiedad = agencia.buscarPropiedad(idProp);

        if (agente == null || propiedad == null)
            throw new Exception("Agente o propiedad no encontrados.");

        agente.asignarPropiedad(propiedad);
        propiedad.actualizarEstadoP(EstadoPropiedad.EN_NEGOCIACION);
        System.out.println("✅ Propiedad asignada al agente correctamente.");
    }

    private static void listarPropiedades(Scanner sc, Agencia agencia) {
        System.out.print("¿Desea listar por estado o tipo? (E/T): ");
        String op = sc.nextLine().toUpperCase();

        if (op.equals("E")) {
            System.out.print("Ingrese estado (DISPONIBLE, EN_NEGOCIACION, VENDIDA, ALQUILADA): ");
            EstadoPropiedad estado = EstadoPropiedad.valueOf(sc.nextLine().toUpperCase());
            agencia.listarPropiedadesPorEstado(estado);
        } else {
            System.out.print("Ingrese tipo (Casa, Departamento, Terreno): ");
            String tipo = sc.nextLine();
            agencia.listarPropiedadesPorTipo(tipo);
        }
    }

   
    private static void registrarContrato(Scanner sc,Agencia agencia, TipoContrato tip) throws Exception {
        System.out.print("ID contrato: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("CI del cliente: ");
        String ci = sc.nextLine();
        System.out.print("ID de la propiedad: ");
        String idProp = sc.nextLine();
        System.out.print("ID del agente: ");
        String idAgente = sc.nextLine();
        System.out.print("Monto: ");
        double monto = Double.parseDouble(sc.nextLine());
        Cliente cliente = agencia.buscarCliente(ci);
        AgenteInmobiliario agente = agencia.buscarAgente(idAgente);
        Propiedad propiedad = agencia.buscarPropiedad(idProp);

        if (cliente == null || agente == null || propiedad == null)
            throw new Exception("Error: cliente, agente o propiedad no encontrados.");

        Contrato contrato = new Contrato(id, cliente, propiedad, agente, LocalDate.now(), null, monto, tip);
        agencia.registrarContrato(contrato);
        System.out.println("Contrato de " + tip + " registrado correctamente.");
    }

    private static void agendarVisita(Scanner sc, Agencia agencia) throws Exception {
        System.out.print("CI del cliente: ");
        String ci = sc.nextLine();
        System.out.print("ID agente: ");
        String idAg = sc.nextLine();
        System.out.print("ID propiedad: ");
        String idProp = sc.nextLine();

        Cliente c = agencia.buscarCliente(ci);
        AgenteInmobiliario a = agencia.buscarAgente(idAg);
        Propiedad p = agencia.buscarPropiedad(idProp);

        if (c == null || a == null || p == null)
            throw new Exception("Datos inválidos para agendar la visita.");

        Visita v = new Visita(agencia.generarIdVisita(), c, p, a, LocalDate.now(), LocalTime.now());
        agencia.registrarVisita(v);
        c.registrarVisita(v);

        System.out.println("Visita agendada correctamente.");
    }

    
    private static void listarVisitasCliente(Scanner sc, Agencia agencia) {
        System.out.print("Ingrese CI del cliente: ");
        String ci = sc.nextLine();
        agencia.listarVisitasPorCliente(ci);
    }

    
    private static void generarReporte(Agencia agencia) {
        agencia.generarReportePropiedadesVendidasYAlquiladas();
    }

   
    private static void calcularComisiones(Agencia agencia) {
        agencia.calcularComisionesAgentes();
    }
    
}

