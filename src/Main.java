import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Andres",25,1.70f);

        System.out.println("List");
        List<Persona> lista = new ArrayList<>();
        lista.add(persona);
        lista.add(persona1);
        lista.add(persona2);

        List<Persona> listas = new ArrayList<>();
        lista.add(persona);
        lista.add(persona1);
        lista.add(new Persona("Pepe",46,1.60f));
        lista.add(new Persona("Vero",38,1.70f));
        lista.add(new Persona("Juan",20,1.70f));
        lista.add(new Persona("Jose",20,1.5f));
        lista.add(new Persona("Melva",24,1.55f));
        lista.add(new Persona("Geovanny",17,1.70f));
        lista.add(new Persona("Lusia",20,1.60f));
        lista.add(new Persona("Luis",20,1.70f));

        persona.setNombre("David");

        System.out.println("Listado de personas");
        for(Persona p : lista){
            System.out.println(p.descripcion());
        }
        lista.get(0).setEdad(18);
        lista.get(0).imprimirdatos();
        lista.get(1).setEdad(18);
        lista.get(1).imprimirdatos();
        lista.get(2).setEdad(18);
        lista.get(2).imprimirdatos();
        lista.get(3).setEdad(18);
        lista.get(3).imprimirdatos();
        lista.get(4).setEdad(18);
        lista.get(4).imprimirdatos();

        System.out.println("Set");
        Set<String> nombres = new HashSet<>();
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Daniel");
        nombres.add("Daniel");
        System.out.println("Nombres únicos (in orden garantizado" + nombres + ")");

        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add(new Persona("Ana",25,1.65f));
        nombres2.add(new Persona("Juan",24,1.75f));
        nombres2.add(new Persona("Vero",38,1.75f));
        nombres2.add(new Persona("Lusia",20,1.75f));
        for(Persona p: nombres2){
            System.out.println(p.descripcion());
        }
        System.out.println("------------------HastMap------------------------------");
        Map<String,Persona> codigounico = new HashMap<>();
        codigounico.put("e01",persona);
        codigounico.put("e02",persona1);
        codigounico.put("e03",persona1);
        codigounico.put("e04",lista.get(4));

        System.out.println("Código único e03"+codigounico.get("e03").descripcion());
        System.out.println("Codigo único e02"+codigounico.get("e02").descripcion());
        //System.out.println("Codigo único e01"+codigounico.get("e01").descripcion());
        System.out.println("Codigo unico e10"+codigounico.containsKey("e10"));
    }
}
