package patterns.singleton;

public class MainDatabase {
    public static void main(String[] args) {
        Database instanciaDatabase = Database.getInstance("localhost:2000" +
                "/mydatabase", "miUsuario", "myPassword");

        System.out.println(instanciaDatabase.getRuta());
        System.out.println(instanciaDatabase.getUsuario());
        System.out.println(instanciaDatabase.getPassword());

        System.out.println("---------------------------------");
        System.out.println(">>modificando valores de mi recurso");
        System.out.println("---------------------------------");

        instanciaDatabase.setPassword("nuevo Password");
        System.out.println(instanciaDatabase.getRuta());
        System.out.println(instanciaDatabase.getUsuario());
        System.out.println(instanciaDatabase.getPassword());
    }
}
