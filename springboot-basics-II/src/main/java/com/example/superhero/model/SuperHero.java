package main.java.com.example.superhero.model;

public class SuperHero {

    private Long id;
    private String name;
    private String description;
    private boolean capa;

    public SuperHero() {
    }

    public SuperHero(Long id, String name, String description, boolean capa) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.capa = capa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "SuperHero{" + "id=" + id + ", name='" + name + '\'' + ", " +
                "description='" + description + '\'' + ", capa=" + capa + '}';
    }
}
