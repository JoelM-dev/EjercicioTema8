public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(24);
        persona.setNombre("Joel");
        persona.setTelefono("3418764903");

        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("La edad de la persona es: " + persona.getEdad());
        System.out.println("El numero de telefono de la persona es: " + persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
}