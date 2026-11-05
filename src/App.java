import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner (System.in);
        Random random =new Random();

        //* COLORES ANSII */
        final String AMARILLO = "\u001B[33m";
        final String MORADO = "\u001B[35m";
        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String AZUL = "\u001B[34m";
        final String NARANJA = "\u001B[38;5;208m";
        final String RESET = "\u001B[0m";
        
        //* ESPECIES */
        final String[] ESPECIES = {
            "HUMANOIDE",
            "MUTANTE",
            "ROBOT",
            "ALIEN"
        };
        /* ROLES */
        final String[] ROLES ={
            "SOLDADO",
            "BRUJO",
            "FANATICO",
            "BANDIDO",
            "GUERRERO",
            "CAZARRECOMPENSAS"
        };

        final String[] enemigos = {
            "DRON DE GUERRA",
            "MUTANTE PISTOLERO",
            "BANDIDO",
            "CAZADOR ROBOT"
        };

        System.out.println(AMARILLO + "+---------------------------------+" + RESET);
        System.out.println(AMARILLO + "|    *        WELCOME    *        |" + RESET);
        System.out.println(AMARILLO + "|  *      *   TO  THE       *    *|" + RESET);
        System.out.println(AMARILLO + "|      *       SPACE      *       |" + RESET);
        System.out.println(AMARILLO + "| *   *   !!!WASTELAND!!!     *   |" + RESET);
        System.out.println(AMARILLO + "+---------------------------------+\n" + RESET);
    
        System.out.println(MORADO + "|*-*-*-*-*-*-*-*-*-*-*|" + RESET);
        System.out.println(MORADO + "|---------MENU--------|" + RESET);
        System.out.println(MORADO + "|---------------------|" + RESET);
        System.out.println(MORADO + "|-------Opciones------|" + RESET);
        System.out.println(MORADO + "|---------------------|" + RESET);
        System.out.println(MORADO + "|HISTORIA: 1          |" + RESET);
        System.out.println(MORADO + "|GUIA: 2              |" + RESET);
        System.out.println(MORADO + "|EMPEZAR: 3           |" + RESET);
        System.out.println(MORADO + "|---------------------|\n" + RESET);
        System.out.print(VERDE + "Seleccione una opcion: " + RESET);
        int OPCION_MENU = scanner.nextInt();
        scanner.nextLine();
        
        switch (OPCION_MENU) {
            case 1:
                System.out.println(ROJO + "|---------------------|" + RESET);
                System.out.println(ROJO + "|-------HISTORIA------|" + RESET);
                System.out.println(ROJO + "|---------------------|\n" + RESET);
                System.out.println(ROJO + "+---------------------------------------------+" + RESET);
                System.out.println(ROJO + "| En un futuro distante y desconocido...      |" + RESET);
                System.out.println(ROJO + "+---------------------------------------------+" + RESET);
                break;

            case 2:
                System.out.println(VERDE + "|---------------------|" + RESET);
                System.out.println(VERDE + "|---------GUIA--------|" + RESET);
                System.out.println(VERDE + "|---------------------|" + RESET);
                break;

            case 3:
                String nombre;

                System.out.print(AMARILLO +  "Escriba el nombre de su personaje: " + RESET);
                nombre = scanner.nextLine().toUpperCase();

                System.out.println(VERDE + "|---------------------|" + RESET);
                System.out.println(VERDE + "|       ESPECIE       |" + RESET);
                System.out.println(VERDE + "|---------------------|" + RESET);
                
                //* CON "for" RECORREMOS EL ARRAY */

                for(String especies : ESPECIES) { 
                    System.out.println(VERDE + "| + " + especies + RESET);
                }

                System.out.println(VERDE + "|---------------------|" + RESET);

                String especie;

                do {
                    System.out.print(AMARILLO + "Seleccione una especie: " + RESET);
                    especie =scanner.nextLine().trim().toUpperCase(); //*.trim para eliminar espacios y .toUpperCase convertir todo mayusculas*/
                    
                    if(!Arrays.asList(ESPECIES).contains(especie)){ //*si la varible insertada con scanner no coincide con ningun valor del array, pondra el mensaje rojo */
                        System.out.println(ROJO + "OPCION NO EXISTENTE, PRUEBE OTRA VEZ" + RESET);
                    }
                } while (!Arrays.asList(ESPECIES).contains(especie)); //*hacemos que mientras la variable especies no es te en el Array se ejecute el bucle */
               
                
                System.out.println(AZUL + "|---------------------|" + RESET);
                System.out.println(AZUL + "|        ROLES        |" + RESET);
                System.out.println(AZUL + "|---------------------|" + RESET);

                for(String roles : ROLES) {
                    System.out.println(AZUL + "| + " + roles + RESET);
                }

                System.out.println(AZUL + "|---------------------|" + RESET);
                
                String rol;

                do{
                    System.out.print(AMARILLO +  "Seleccione un rol: " + RESET);
                    rol = scanner.nextLine().trim().toUpperCase();

                    if (!Arrays.asList(ROLES).contains(rol)) {
                        System.out.println(ROJO + "OPCION NO EXISTENTE, PRUEBE OTRA VEZ");
                    }
                } while (!Arrays.asList(ROLES).contains(rol));

                //*Asignamos las estadisticas base */

                int vida = 40, ataque = 10, defensa = 5, carisma = 5, inteligencia = 6, agilidad = 4;

                //*Asignamos las estadisticas bonus que obtiene cada especie y rol */

                switch (especie){
                    case "HUMANOIDE": vida += 5; carisma += 7; break;
                    case "MUTANTE": ataque += 8; carisma -= 7; break;
                    case "ROBOT": vida += 10; defensa += 5; carisma -= 8; break;
                    case "ALIEN": vida += 8; agilidad += 5; break;
                }

                switch (rol) {
                    case "SOLDADO": defensa += 4; ataque += 5; break;
                    case "BRUJO": inteligencia += 7; vida -= 5; break;
                    case "FANATICO": vida += 8; defensa += 7; break;
                    case "BANDIDO": agilidad += 6; ataque += 3; break;
                    case "GUERRERO": defensa += 6; ataque += 5; agilidad += 2; break;
                    case "CAZARRECOMPENSAS": agilidad += 8; ataque += 2; break;
                }
                
                System.out.println(NARANJA + "|---------------------|" + RESET);
                System.out.println(NARANJA + "|      PERSONAJE      |" + RESET);
                System.out.println(NARANJA + "|---------------------|" + RESET);
                System.out.println(NARANJA + " NOMBRE: " + nombre + RESET);
                System.out.println(NARANJA + " ESPECIE: " + especie + RESET);
                System.out.println(NARANJA + " ROL: " + rol + RESET);
                System.out.println(NARANJA + "|---------------------|" + RESET);
                System.out.println(NARANJA + "|     ESTADISTICAS    |" + RESET);
                System.out.println(NARANJA + "|---------------------|" + RESET);
                System.out.println(NARANJA + " VIDA: " + vida + RESET);
                System.out.println(NARANJA + " ATAQUE: " + ataque + RESET);
                System.out.println(NARANJA + " DEFENSA: " + defensa + RESET);
                System.out.println(NARANJA + " INTELIGENCIA: " + inteligencia + RESET);
                System.out.println(NARANJA + " CARISMA: " + carisma + RESET);
                System.out.println(NARANJA + " AGILIDAD: " + agilidad + RESET);
                System.out.println(NARANJA + "|---------------------|" + RESET);

                boolean combatir = true;

                while (combatir && vida >0){

                    //*Elegir un enemigo aleatorio dentro del array de enemigos */
                    String enemigo = enemigos[random.nextInt(enemigos.length)];

                    //*Establecer que cada enemigo cuente con estadisticas diferentes */
                    int vidaEnemigo;
                    int ataqueEnemigo;
                    int defensaEnemigo;


                    switch (enemigo) {
                        case "DRON DE GUERRA": vidaEnemigo = 15 + random.nextInt(13); ataqueEnemigo = 8 + random.nextInt(5); defensaEnemigo = 4 + random.nextInt(4); break;
                        case "MUTANTE PISTOLERO": vidaEnemigo = 24 + random.nextInt(13); ataqueEnemigo = 10 + random.nextInt(15); defensaEnemigo = 6 + random.nextInt(4); break;
                        case "BANDIDO": vidaEnemigo = 18 + random.nextInt(17); ataqueEnemigo = 8 + random.nextInt(15); defensaEnemigo = 6 + random.nextInt(4); break;
                        case "CAZADOR ROBOT": vidaEnemigo = 18 + random.nextInt(17); ataqueEnemigo = 14 + random.nextInt(15); defensaEnemigo = 8 + random.nextInt(16); break;
                        default:
                            vidaEnemigo = 20; ataqueEnemigo = 10; defensaEnemigo = 5;
                    }

                    System.out.println("\n");
                    System.out.println(ROJO + "|====================================|" + RESET);
                    System.out.println(ROJO + "|        !ENEMIGO DETECTADO¡         |" + RESET);
                    System.out.println(ROJO + "|====================================|" + RESET);
                    System.out.println(ROJO + " ENEMIGO: " + enemigo + RESET);
                    System.out.println(ROJO + " VIDA: " + vidaEnemigo + RESET);
                    System.out.println(ROJO + " ATAQUE: " + ataqueEnemigo + RESET);
                    System.out.println(ROJO + " DEFENSA: " + defensaEnemigo + RESET);
                    System.out.println(ROJO + "|====================================|" + RESET);

                    boolean combateActivo = true

                    while (combateActivo && vida > 0 && vidaEnemigo > 0) {

                        int accion;

                        System.out.println(AZUL + "|---------------------|" + RESET);
                        System.out.println(AZUL + "|   TURNO DE ELEGIR   |" + RESET);
                        System.out.println(AZUL + "|---------------------|" + RESET);
                        System.out.println(AZUL + "| 1. ATACAR           |" + RESET);
                        System.out.println(AZUL + "| 2. DEFENDER         |" + RESET);
                        System.out.println(AZUL + "| 2. HUIR             |" + RESET);
                        System.out.println(AZUL + "|---------------------|" + RESET);
                        System.out.println("\n");
                        System.out.println(AMARILLO + "SELECCIONA UNA ACCION: " +  RESET);
                        accion = scanner.nextInt();
                        scanner.nextLine();

                        int defender = 0;

                        switch (accion) {
                            case 1:
                                int dañoJugador = Math.max(1, ataque + random.nextInt(6) - defensaEnemigo);
                                vidaEnemigo -= dañoJugador;
                                System.out.println(VERDE + "¡" + nombre + " hizo" + dañoJugador + " de daño!");
                                System.out.println(AMARILLO + "A " + enemigo + "le quedan " + Math.max(0, vidaEnemigo) + RESET);
                                break;

                            case 2:
                                defender = defensa + 5;
                                System.out.println(VERDE + nombre + " se pone en posicion de defensa" + RESET);
                                break;

                            case 3:
                                if (random.nextInt(10) < 5) {
                                    System.out.println(AMARILLO + nombre + " escapo con éxito" + RESET);
                                    combateActivo = false
                                } else {
                                    System.out.println(ROJO + "No pudistes escapar del combate" + RESET);
                                }
                                break;

                            default:
                                System.out.println(ROJO +  "OPCION INVALIDA" + RESET);
                                break;
                        }

                        if (combateActivo && vidaEnemigo > 0) {
                            int dañoEnemigo = Math.max(1, ataqueEnemigo + random.nextInt(5) - (defensa + defender));
                            vida -= dañoEnemigo;
                            System.out.println(ROJO + enemigo + " te ha atacado y te ha causado " +  dañoEnemigo + " de daño" + RESET);
                        }

                    }
                }

                break;
                

            default:
               System.out.println(ROJO + "Opción no valida" + RESET);
        } 
    }
}