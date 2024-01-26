import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public User(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "User{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}