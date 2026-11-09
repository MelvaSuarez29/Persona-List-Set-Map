import java.util.Objects;

public class Persona {

    protected String nombre;
    protected int edad;
    protected float estatura;

    public Persona() {}

    public Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        setEdad(edad);
        setEstatura(estatura);
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}

    public int getEdad() {  return edad;}
    public void setEdad(int edad) {
        if(edad < 0){
            System.out.println("La edad a ingresar no puede ser un valor negativo");
            this.edad = 0;
        }else{this.edad = edad;}
    }

    public float getEstatura() {   return estatura;}
    public void setEstatura(float estatura) {
        if(estatura < 0){
            System.out.println("La estatura a ingresar no puede ser negativo");
            this.estatura = 0.0f;
        }else{this.estatura = estatura;}
    }

    // Método personalizado
    public String descripcion(){
        return "Persona: "+nombre +
                "\nEdad: "+edad +
                "\nEstatura: "+estatura;
    }

    public void imprimirdatos(){
        System.out.println("\n-----------------Imprimir Datos----------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Estatura: "+ estatura);
    }
    public Persona copiar(){
        return new Persona(
                this.nombre, this.edad, this.estatura
        );
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad &&
                Float.compare(persona.estatura, estatura) == 0
                && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, estatura);
    }
}
