import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona persona = new Persona();
        Persona persona2 = new Persona("Ana");
        Persona persona3 = new Persona("Andres",25,1.70f);

        System.out.println("-------------------------List-------------------------");
        List <Persona> lista = new ArrayList();

        lista.add(persona);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(new Persona("Melva Suarez",24,1.56f));
        lista.add(new Persona("Pepe",46,1.70f));
        lista.add(new Persona("Vero",38,1.70f));
        lista.add(new Persona("Juan",20,1.70f));
        lista.add(new Persona("Maria",21,1.70f));
        lista.add(new Persona("Jose",20,1.60f));
        lista.add(new Persona("Luisa",20,1.67f));
        lista.add(new Persona("Antonio",21,1.80f));

        persona.setNombre("David");
        List<Persona> ingresoPersonas = ingresoPersonas(sc);
        lista.addAll(ingresoPersonas);
        System.out.println("Personas registradas");
        for(Persona p : lista){
            System.out.println(p.descripcion());
        }
        lista.get(0).setEdad(24);
        lista.get(0).imprimirdatos();
        lista.get(1).setEdad(25);
        lista.get(1).imprimirdatos();
        lista.get(2).setEdad(46);
        lista.get(2).imprimirdatos();
        lista.get(3).setEdad(38);
        lista.get(3).imprimirdatos();
        lista.get(4).setEdad(21);
        lista.get(4).imprimirdatos();

        System.out.println("\n-----------------Implementación de Selt---------------------");
        Set<String>nombres = new HashSet<>();
        nombres.add("Melva Suarez");
        nombres.add("Pepe");
        nombres.add("Vero");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Luisa");
        nombres.add("Vero");
        nombres.add("Juan");

        System.out.println("Nombres únicos sin orden garantizado: "+nombres);

        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add(new Persona("Melva Suarez",24,1.56f));
        nombres2.add(new Persona("Ana", 25, 1.65f));
        nombres2.add(new Persona("Juan", 24, 1.75f));
        nombres2.add(new Persona("Vero", 38, 1.75f));
        nombres2.add(new Persona("Lusia", 20, 1.75f));

        for(Persona p : nombres2){
            System.out.println(p.descripcion());
        }
        System.out.println("------------Implementación de HashMap----------------------");
        Map<String, Persona> codigounico = new HashMap<>();
        codigounico.put("e01",persona);
        codigounico.put("e02",persona2);
        codigounico.put("e03",persona3);
        codigounico.put("e04",lista.get(4));

        System.out.println("Código único e03: "+codigounico.get("e03").descripcion());
        System.out.println("Código único e02: "+codigounico.get("e02").descripcion());
        System.out.println("Código único e01:"+codigounico.containsKey("e01"));

        sc.close();
    }

    public static String validarNombre(Scanner sc){
        System.out.print("Ingrese nombre o 0 para terminar: ");
        String nombre = sc.nextLine();
        if(nombre.isEmpty()){
            System.out.println("El nombre no puede estar vacio ingrese el nombre o 0");
            return "Sin nombre";
        }else{return nombre;}
    }
    public static int validarEdad(Scanner sc){
        System.out.print("Ingrese la edad: ");
        int edad = 0;
        if(sc.hasNextInt()){
            edad = sc.nextInt();
            if(edad<0 || edad>100){
                System.out.println("La edad aingresada no puede ser negativo o superior a 100");
                edad = 0;
            }
        }else{
            System.out.println("Debe ingresar un valor válido");
            sc.next();
        }
        sc.nextLine();
        return edad;
    }
    public static float validarEstatura(Scanner sc){
        System.out.print("Ingrese la estatura: ");
        float estatura = 0.0f;
        String entrada = sc.nextLine().trim().replace(",", ".");
        try {
            estatura = Float.parseFloat(entrada);
            if(estatura < 0){
                System.out.println("La estatura no puede ser un valor negativo");
                estatura = 0.0f;
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un valor válido y un número decimal");
            estatura = 0.0f;
        }
        return estatura;
    }

    public static List<Persona> ingresoPersonas(Scanner sc){
        List<Persona> nuevLista = new ArrayList<>();
        System.out.println("----------------Registro de Personas-------------------");
        do{
            String nombre = validarNombre(sc);
            if(nombre.equals("0")){break;}
            int edad = validarEdad(sc);
            float estatura = validarEstatura(sc);

            nuevLista.add(new Persona(nombre,edad,estatura));
            System.out.println("La persona fue registrada correctamente\n");

        }while(true);
        return nuevLista;
    }
}
