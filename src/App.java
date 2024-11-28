import java.util.Random;
import java.util.Scanner;


public class App {
    //Variables generales
    static Scanner scanner = new Scanner(System.in);
    static String[] planets = {"Marte", "Júpiter", "Saturno"};
    static int[] distances = {225000000, 778000000, 1426000000};
    static String[] description = {"Marte es el planeta rojo y el segundo más cercano a la Tierra, aunque cuenta aproximadamente con solo la mitad de su tamaño", "Júpiter tiene magnitudes extraordinaria, incluso la velocidad a la que gira este coloso del sistema solar también es endiablada.", "Saturno es el sexto planeta en distancia al sol del sistema solar. y es otro de los gigantes gaseosos del sistema solar"};

    static String[] spaceships = {"Orion", "SpaceX Starship", "Apolo"};
    static int[] speed = {3000, 28000, 3500};
    static int[] fuelConsumption = {200, 500, 1000};

    static int planetselection;//Posición del planeta seleccionado
    static int spaceshipselection;//Posicion de la nave seleccionada
    static int amountPassengers;//Cantidad de pasajeros de la nave


//longitud = Length

public static void main(String[] args) throws Exception{
    int option;
    do {
        mostrarMenu();
        option = scanner.nextInt();

        switch (option) {
            case 1:
                seleccionarPlaneta();
                break;
            case 2:
                seleccionarNave();
                break;
            case 3:
                calcularRecursos();
                break;
            case 4:
                iniciarSimulador();
                break;
            default:
                break;
        }
    } while (option != 5);
}

public static void mostrarMenu(){
    //Visualizamos el menu con 
    System.out.println("\r\n" + //
                "███████████████████████████\r\n" + //
                "█                         █\r\n" + //
                "█    MENU DE SIMULADOR    █\r\n" + //
                "█                         █\r\n" + //
                "███████████████████████████\r\n" + //
                                        "");
    System.out.println(">>Tripulante, por favor escoja una opción: ");
    System.out.println("1. Seleccionar un planeta  de destino.");
    System.out.println("2. Seleccionar una nave espacial.");
    System.out.println("3. Calcular los recursos necesarios para el viaje.");
    System.out.println("4. Iniciar el simulador de viaje intergalactico.");
    System.out.println("5. Salir del programa.");
}

public static void seleccionarPlaneta(){
    System.out.println("--->> Planetas a visitar en la simulación <<---");
    for(int i =0; i < planets.length; i++){
        System.out.println("> Planeta: " + (i+1) + ". " + planets[i] + ": Guía: " + description[i] + " <> Distancia desde la tierra: " + distances[i] + " Km");
    }  
    System.out.println("  >>Seleccione el planeta destino: ");
    int selection = scanner.nextInt();

    if (selection > 0 && selection <= planets.length) {
        System.out.println("          *          O\r\n" + //
                        "        .    *    O\r\n" + //
                        "  *            O       *\r\n" + //
                        "    O       *      O\r\n" + //
                        "       *   O    *       *\r\n" + //
                        "          O       O\r\n" + //
                        "             O\r\n" + //
                        "HAS SELECCIONADO TU PLANETA DE DESTINO   " + planets[selection - 1]);
                        planetselection =  selection - 1;//La posición del planeta queda asignado a la variable planetselection
    }
    else{
        System.out.println("Tripulante, favor indicar una opción válida.");
    }
    
}

public static void seleccionarNave(){
    System.out.println(">> Naver disponibles para la simulación <<");
    for(int i =0; i < spaceships.length; i++){
        System.out.println("> Nave: " + (i+1) + ". " + spaceships[i] + ": Guía: " + speed[i] + " Km/h");
    }  
    System.out.println("  >>Seleccione la nave que usará en su viaje: ");
    int selection = scanner.nextInt();

    if (selection > 0 && selection <= spaceships.length) {
        System.out.println("       __|__\r\n" + //
                        "--@--@--(_)--@--@--  " + spaceships[selection - 1]);
                        spaceshipselection =  selection - 1;//La posición de la nave queda asignado a la variable spaceshipselection
    }
    else{
        System.out.println("Tripulante, favor indicar una opción válida.");
    }

    System.out.println("Indique por favor la cantidad de tripulantes: ");
    int amountPassengers = scanner.nextInt();//La cantidad de pasajeros queda asignado a la variable amountPassengers
}

public static void iniciarSimulador(){
    System.out.println("
    ***********************************\r\n" + //
                "*                                 *\r\n" + //
                "*    EL DESPEGUE SERÁ EN...        *\r\n" + //
                "*                                 *\r\n" + //
                "***********************************");
                Random random = new Random();
                for(int progress = 0; progress >= 80; progress++){
                
                }





}

public static void calcularRecursos(){
    int fuel = fuelConsumption[spaceshipselection] * distances[planetselection];//Fuel = combustible consumido
    int oxygen = distances[planetselection] * 200 * amountPassengers ;
    System.out.println("El combustible requerido para el viaje es: " + fuel + " Toneladas.");
    System.out.println("La cantidad de oxigeno requerida para todos los pasajeros es: " + oxygen + " Kg.");
}

}