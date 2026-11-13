import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Space_Magic_and_Mutants {
    public static void main(String[] args) {
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
        String[] ESPECIES = {
            "HUMANOIDE",
            "MUTANTE",
            "ROBOT",
            "ALIEN"
        };
        /* ROLES */
        String[] ROLES ={
            "SOLDADO",
            "BRUJO",
            "FANATICO",
            "BANDIDO",
            "GUERRERO",
            "CAZARRECOMPENSAS"
        };

        //*Enemigos */
        String[] enemigos = {
            "DRON DE GUERRA",
            "MUTANTE PISTOLERO",
            "BANDIDO",
            "CAZADOR ROBOT"
        };

        int opcionMenu;

        System.out.println(AMARILLO + "+---------------------------------+" + RESET);
        System.out.println(AMARILLO + "|    *        WELCOME    *        |" + RESET);
        System.out.println(AMARILLO + "|  *      *   TO  THE       *    *|" + RESET);
        System.out.println(AMARILLO + "|      *       SPACE      *       |" + RESET);
        System.out.println(AMARILLO + "| *   *   !!!WASTELAND!!!     *   |" + RESET);
        System.out.println(AMARILLO + "+---------------------------------+\n" + RESET);
    
        do{
            System.out.println(MORADO + "|*-*-*-*-*-*-*-*-*-*-*|" + RESET);
            System.out.println(MORADO + "|---------MENU--------|" + RESET);
            System.out.println(MORADO + "|---------------------|" + RESET);
            System.out.println(MORADO + "|-------Opciones------|" + RESET);
            System.out.println(MORADO + "|---------------------|" + RESET);
            System.out.println(MORADO + "|GUIA: 1              |" + RESET);
            System.out.println(MORADO + "|EMPEZAR: 2           |" + RESET);
            System.out.println(MORADO + "|SALIR: 3             |" + RESET);
            System.out.println(MORADO + "|---------------------|\n" + RESET);
            System.out.print(VERDE + "Seleccione una opcion: " + RESET);
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            if (opcionMenu <= 0 || opcionMenu >= 4) {
                System.out.println(ROJO + "Opcion no valida, seleccione otra" + RESET);
            }

        }while(opcionMenu <= 0 || opcionMenu >= 4);
        
        switch (opcionMenu) {

            case 1:

                int opcionGuia;

                do{
                    System.out.println(VERDE + "|---------------------|" + RESET);
                    System.out.println(VERDE + "|---------GUIA--------|" + RESET);
                    System.out.println(VERDE + "|---------------------|" + RESET);
                    System.out.println(VERDE + "|COMBATES: 1          |" + RESET);
                    System.out.println(VERDE + "|ESPECIES: 2          |" + RESET);
                    System.out.println(VERDE + "|ROLES: 3             |" + RESET);
                    System.out.println(VERDE + "|SALIR: 4             |" + RESET);
                    System.out.println(VERDE + "|---------------------|\n" + RESET);
                    System.out.print(NARANJA + "Seleccione una opcion: " + RESET);
                    opcionGuia = scanner.nextInt();
                    scanner.nextLine();

                    if (opcionGuia <= 0 || opcionGuia >= 4) {
                        System.out.println(ROJO + "Opcion no valida, seleccione otra" + RESET);
                    }

                }while(opcionGuia <= 0 || opcionGuia >= 5);

                switch(opcionGuia) {

                    case 1:
                        System.out.println(VERDE + "\n" + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "|===========COMBATES===========|" + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "\n" + RESET);
                        System.out.println(AZUL + "El combate es por turno, el jugador podra elegir una accion cada turno," + RESET);
                        System.out.println(AZUL + "para ganar el jugador debera acabar con los puntos de vida del enemigo," + RESET);
                        System.out.println(AZUL + "si los puntos del jugador llegan a 0 la partida se acaba la partida." + RESET);
                        System.out.println(VERDE + "\n" + RESET);
                    break;

                    case 2:
                        System.out.println(VERDE + "\n" + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "|===========ESPECIES===========|" + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "\n" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| MUTANTES:                                                                                                |" + RESET);
                        System.out.println(AZUL + "| Los mutantes pese a estar perseguidos y ser estigmatizados por casi toda la galaxia son de las especies  |" + RESET);
                        System.out.println(AZUL + "| más comununes de toda la galaxia, no caen bien por su condicion de mutantes, pero poseen una agilidad    |" + RESET);
                        System.out.println(AZUL + "| sin precedentes e incluso algunas mutaciones son algo más que feos tumores o deformidades...             |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| ALIENS:                                                                                                  |" + RESET);
                        System.out.println(AZUL + "| Un termino despectivo que los humanos usanpara referirse a los sus vecinos espaciales para referirse     |" + RESET);
                        System.out.println(AZUL + "| a sus vecinos de otros planetas, entre ellos encontraremos fascinantes criaturas y civilizaciones,       |" + RESET);
                        System.out.println(AZUL + "| con distintas habilidades, poderes y diferentes culturas.                                                |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| ROBOTS:                                                                                                  |" + RESET);
                        System.out.println(AZUL + "| La forma de vida no organica por excelencia, seres con emociones artificiales y programados para una     |" + RESET);
                        System.out.println(AZUL + "| tarea distinta, desde las maquinas de guerra, los robots de compañia y etc.                              |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| HUMANOIDES:                                                                                              |" + RESET);
                        System.out.println(AZUL + "| La especie más extendida de la galaxia, desde los humanos originarios de la tierra, hasta los humanos    |" + RESET);
                        System.out.println(AZUL + "| modificados artificialmente, pasando por los pieles rojas de marte o los gigantes del gran congelado.    |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        

                    break;

                    case 3:
                        System.out.println(VERDE + "\n" + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "|============ROLES=============|" + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "\n" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| SOLDADO:                                                                                                 |" + RESET);
                        System.out.println(AZUL + "| Los soldados son un rol especializado en armas de fuego y dotados de gran arsenal y concimiento de armas,|" + RESET);
                        System.out.println(AZUL + "| tambien dotados de una gran resistencia al dolor y los daños debido a las modificaciones geneticas.      |" + RESET);
                        System.out.println(AZUL + "| Dentro de este rol encontramos a los soldados imperiales, soldados renegados, criminales de guerra y     |" + RESET);
                        System.out.println(AZUL + "| los guerrilleros.                                                                                        |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|   --ARMAMENTO DISPONIBLE--                                                                               |" + RESET);
                        System.out.println(AZUL + "|     Rifles de asalto, pistolas pesadas, pistolas ligeras, subfusiles, cuchillos de guerra, granadas,     |" + RESET);
                        System.out.println(AZUL + "|     francotiradores, rifles semi-automaticos, ametralladoras pesadas.                                    |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| BRUJOS:                                                                                                  |" + RESET);
                        System.out.println(AZUL + "| Este rol se basa en el uso de la magia, desde sus barajas del tarot hasta sus instrumentos magicos       |" + RESET);
                        System.out.println(AZUL + "| pasando por los bastones magicos para atacar, ganar bonificaciones, invocar criaturas o o inflingir      |" + RESET);
                        System.out.println(AZUL + "| estados a sus enemigos.                                                                                  |" + RESET);
                        System.out.println(AZUL + "| Todo brujo debe sus poderes a un señor, ya sea Kaos u otras fuerzas oscuras mucho más temibles.          |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|   --ARMAMENTO DISPONIBLE--                                                                               |" + RESET);
                        System.out.println(AZUL + "|   Bastones magicos, espadas ligeras, barajas de cartas, instrumentos de musica, anillos magicos,         |" + RESET);
                        System.out.println(AZUL + "|   daga ritual.                                                                                           |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| FANATICO:                                                                                                |" + RESET);
                        System.out.println(AZUL + "| Los fanaticos son humanos que solo sirven al imperio y su opresiva religion, procesan tal fanatismo y    |" + RESET);
                        System.out.println(AZUL + "| fe ciega que les protege (o ellos creen), de todos los males. Se basan en el uso de sus santas           |" + RESET);
                        System.out.println(AZUL + "| escrituras, rosarios y talismanes para protegerse y purgar a sus enemigos.                               |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|   --ARMAMENTO DISPONIBLE--                                                                               |" + RESET);
                        System.out.println(AZUL + "|   Rosarios, espadas ligeras, agua bendita, libro, anillos magicos, talisman bendecido, crucifijo.        |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| BANDIDO:                                                                                                 |" + RESET);
                        System.out.println(AZUL + "| La escoria del espacio, los repudiados de la galaxia, su unica forma de vida es el crimen, poseen        |" + RESET);
                        System.out.println(AZUL + "| extraordinarias habilidades para el robo y gran conocimiento de escondites y pasadizos.                  |" + RESET);
                        System.out.println(AZUL + "| escrituras, rosarios y talismanes para protegerse y purgar a sus enemigos.                               |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|   --ARMAMENTO DISPONIBLE--                                                                               |" + RESET);
                        System.out.println(AZUL + "|   Navajas, pistolas ligeras, pistolas de chatarra, cuchillos, explosivos improvisados, molotov,          |" + RESET);
                        System.out.println(AZUL + "|   garrotes de basura, bate con pinchos, cadenas, puño americano, palanca.                                |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| GUERRERO:                                                                                                |" + RESET);
                        System.out.println(AZUL + "| Los gurreros se basan principalmente en el combate cuerpo a cuerpo, tenemos desde los gladiadores,       |" + RESET);
                        System.out.println(AZUL + "| guerreros salvajes. Los guerreros cuentan con un codigo de honor bastante fuerte y unas habilidades      |" + RESET);
                        System.out.println(AZUL + "| de supervivencia.                                                                                        |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|   --ARMAMENTO DISPONIBLE--                                                                               |" + RESET);
                        System.out.println(AZUL + "|   Mazas, espadas pesadas, lanzas, cuchillos de caza, cerbatanas, hachas, garrotes.                       |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);
                        System.out.println(AZUL + "| CAZARRECOMPESAS:                                                                                         |" + RESET);
                        System.out.println(AZUL + "| Los cazarrecompensas se ganan la vida con buscando y eleminando a sus objetivos, cuentas con equipo      |" + RESET);
                        System.out.println(AZUL + "| y medios que utilizaran para dar caza a su presa. Son habiles, astutos y letales.                        |" + RESET);
                        System.out.println(AZUL + "|                                                                                                          |" + RESET);
                        System.out.println(AZUL + "|   --ARMAMENTO DISPONIBLE--                                                                               |" + RESET);
                        System.out.println(AZUL + "|   Pistolas, cuchillos, escopetas ligeras, subfusiles, francotiradores, trampas, navajas.                 |" + RESET);
                        System.out.println(AZUL + "|----------------------------------------------------------------------------------------------------------|" + RESET);


                    break;

                    default:
                        break;
                }
                break;

            case 2:
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
                        System.out.println(ROJO + "OPCION NO EXISTENTE, PRUEBE OTRA VEZ" + RESET);
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
                    case "CAZARRECOMPENSAS": agilidad += 8; ataque += 4; break;
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

                    boolean combateActivo = true;

                    while (combateActivo && vida > 0 && vidaEnemigo > 0) {

                        int accion;

                        //*A la hora de elegir accion, se debe ingresar un numero entero, si se intenta ingresar un texto va a saltar error */
                        do{
                            System.out.println(AZUL + "|---------------------|" + RESET);
                            System.out.println(AZUL + "|   TURNO DE ELEGIR   |" + RESET);
                            System.out.println(AZUL + "|---------------------|" + RESET);
                            System.out.println(AZUL + "| 1. ATACAR           |" + RESET);
                            System.out.println(AZUL + "| 2. DEFENDER         |" + RESET);
                            System.out.println(AZUL + "| 3. HUIR             |" + RESET);
                            System.out.println(AZUL + "|---------------------|" + RESET);
                            System.out.println("\n");
                            System.out.println(AMARILLO + "SELECCIONA UNA ACCION: " +  RESET);
                            accion = scanner.nextInt();
                            scanner.nextLine();

                            if (accion <= 0 || accion >= 4) {
                                System.out.println(ROJO + "Opcion no valida, seleccione otra" + RESET);
                            }
                            
                        }while(accion <= 0 || accion >= 4);
                        
                    
                        int defender = 0;


                        //*Establecemos que las acciones que puedes hacer en tu turno, en este caso Atacar, huir y poner se en posicion de defensa */
                        switch (accion) {
                            case 1:
                                int dañoJugador = Math.max(1, ataque + random.nextInt(6) - defensaEnemigo);
                                vidaEnemigo -= dañoJugador;
                                System.out.println(VERDE + "¡" + nombre + " hizo " + dañoJugador + " de daño!" + RESET);
                                System.out.println(AMARILLO + "A " + enemigo + " le quedan " + Math.max(0, vidaEnemigo) + RESET);
                                break;

                            case 2:
                                defender = defensa + 5;
                                System.out.println(VERDE + nombre + " se pone en posicion de defensa" + RESET);
                                break;

                            case 3:
                                if (random.nextInt(10) < 5) {
                                    System.out.println(AMARILLO + nombre + " escapo con éxito" + RESET);
                                    combateActivo = false;
                                } else {
                                    System.out.println(ROJO + "No pudistes escapar del combate" + RESET);
                                }
                                break;


                        }

                        if (combateActivo && vidaEnemigo > 0) {
                            int dañoEnemigo = Math.max(1, ataqueEnemigo + random.nextInt(5) - (defensa + defender));
                            vida -= dañoEnemigo;
                            System.out.println(ROJO + enemigo + " te ha atacado y te ha causado " +  dañoEnemigo + " de daño" + RESET);
                            System.out.println(AMARILLO + "Te quedan: " + Math.max(0, vida) + " puntos de vida" + RESET);
                        }

                    }

                    if (vidaEnemigo <= 0 && vida > 0) {
                        System.out.println("\n");
                        System.out.println(VERDE + "|==============================|" + RESET);
                        System.out.println(VERDE + "       ¡ENEMIGO DERROTADO!     " + RESET);
                        System.out.println(VERDE + "|==============================|" + RESET);


                        if (rol.equals("BRUJO") && !enemigo.equals("DRON DE GUERRA")) {
                            System.out.println(AMARILLO + "El brujo observa el cuerpo sin vida del " + enemigo.toLowerCase() + " y comienza el pequeño ritual, todo siervo del Kaos debe obtener sus sustento." + RESET);
                            System.out.println(AMARILLO + "Una vez terminado el ritual, el brujo continua su peregrinaje por esta tierra maldita." + RESET);
                        }else if (rol.equals("SOLDADO") && enemigo.equals("DRON DE GUERRA")) {
                            System.out.println(AMARILLO + "Miras los restos del dron de guerra ardiendo en la arena del yermo, recuerdas a esas viejas pero mortiferas armas de una antigua guerra que pensaste haber olvidado."  + RESET);
                            System.out.println(AMARILLO + "Los recuerdos te queman por dentro, pero no expresas nada, solo sigues tu camino en busca de una escapatoria de este planeta asolado..." + RESET);
                        }else if(rol.equals("FANATICO")){
                            System.out.println("Estas exausto por el combate, pero aun asi sigues, todo sea por tu señor todo poderoso y su palabra.");
                            System.out.println("Sigues tu camino, agarrando el rosario como un clavo ardiente y repitiendo en tu mente los versiculos del todo poderoso...");
                        }else if (rol.equals("CAZARRECOMPENSAS")) {
                            System.out.println(AMARILLO + nombre + ": Y ahora un trago, porque me lo merezco --" + RESET);
                            System.out.println(AMARILLO + "Sacas tu botella de Jack, pero te das cuenta de que ya no queda nada" + RESET);
                            System.out.println(AMARILLO + nombre + ": ¡ME CAGO EN SU PUTA MADRE --, gritas" + RESET); //*Esto puede dar pie a un futuro sistema de rasgos: alcoholismo, cleptomania, empatia... */
                            System.out.println(AMARILLO + nombre + ": Tendre que reabastecerme en la siguiente ciudad, espero que el hombre al que estoy dando caza merezca la pena --" + RESET);
                        }else if(rol.equals("FANATICO") && enemigo.equals("MUTANTE PISTOLERO")){
                            System.out.println("Miras al sucio mutante con asco, ser impuro, hasta la muerte te parece demasiado piadosa para el...");
                        }
                    }else if (vida <= 0) {
                        System.out.println("\n");
                        System.out.println(ROJO + "|==============================|" + RESET);
                        System.out.println(ROJO + "           HAS MUERTO          " + RESET);
                        System.out.println(ROJO + "|==============================|" + RESET);
                    }

                    if (vida > 0) {
                        System.out.println(AMARILLO + "\n¿Desea continuar combatiendo? (s/n)" + RESET);
                        String respuesta = scanner.nextLine().trim().toLowerCase();
                        combatir = respuesta.equals("s") || respuesta.equals("si");
                    }
                }

                if (vida <= 0) {
                    System.out.println("\n");
                    System.out.println(ROJO + "PERDISTE LA PARTIDA" + RESET);
                }else{
                    System.out.println(VERDE + "Continuara..." + RESET);
                    System.out.println(VERDE + "Vida restante: " + vida + RESET);
                }
                break;
                

            default:
               System.out.println(NARANJA + "Hasta la proxima aventura, viajero..." + RESET);
        } 

        scanner.close();
    }
}