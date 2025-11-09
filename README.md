# Proyecto_POO_Inmobiliaria
Repositorio exclusivo para el poryecto de Programacion Orientada a Objetos

Descripción 
---
Proyecto desarrollado en Java que gestiona clientes, agentes, propiedades, contratos y visitas dentro de una agencia inmobiliaria.
Permite registrar información, agendar visitas, realizar contratos de venta o alquiler y calcular comisiones de los agentes.

Tecnologías utilizadas
---
-Lenguaje: Java 17+
-IDE utilizado: NetBeans
-Librerías estándar de Java (java.time, java.util)

Estructura general
----
-Agencia: gestiona clientes, agentes, propiedades, contratos y visitas.
-Persona: clase base para Cliente y AgenteInmobiliario.
-Propiedad: clase padre de Casa, Departamento y Terreno.
-Contrato: maneja contratos de venta o alquiler.
-Visita: agenda visitas con fecha y hora (LocalDate y LocalTime).
-Enums: TipoContrato, EstadoPropiedad.

Instrucciones de ejecución
---
Con Netbeans
1. Abrir el proyecto en Netbeans ubicandonos en la carpeta en la que se encuentra
2. Clic derecho sobre la clase main y seleccionas "Run File"
3. Seguir las instrucciones dadas en la consola en la ejecucion del proyecto, donde en esta se encuentra primero el menú interactivo.

Con la terminal de Windows
1. Abrir la terminal y con el comando 'cd' dirigete al directorio el que se encuentran los archivos .java del proyecto
2. Compilar los archivos con el comando 'javac *.java'
3. Ejecuta el programa principal (Main) con el comando 'java Main'
4. Sigue el menú interactivo en consola
---
Ejemplo breve
1. Registrar cliente
Ingrese ID: 01
Ingrese CI: 0102345678
Ingrese nombre: Ana Torres
Cliente registrado correctamente.