package patterns.singleton;

public final class Database {
    private static Database instance;
    private String ruta;
    private String usuario;
    private String password;

    private Database(String ruta, String usuario, String password) {
        this.ruta = ruta;
        this.usuario = usuario;
        this.password = password;
    }

    public static Database getInstance(String ruta, String usuario,
                                       String password) {
        System.out.println(">> Accediendo al metodo getInstance");
        if (instance == null) {
            System.out.println(">>> Instanciando la clase Singleton");
            instance = new Database(ruta, usuario, password);
        }
        return instance;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
