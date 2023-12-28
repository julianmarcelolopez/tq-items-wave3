package model;

public class Superheroe {
    private Long id;
    private String nombre;
    private String poder;

    private boolean deleted;

    // Constructor vacío necesario para algunas operaciones de persistencia
    public Superheroe() {
    }

    // Constructor con parámetros
    public Superheroe(Long id, String nombre, String poder) {
        this.id = id;
        this.nombre = nombre;
        this.poder = poder;
    }

    // Métodos Getter y Setter para los atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    // Método toString para imprimir fácilmente los detalles del superhéroe
    @Override
    public String toString() {
        return "Superheroe{" + "id=" + id + ", nombre='" + nombre + '\'' + "," +
                " poder='" + poder + '\'' + '}';
    }
}