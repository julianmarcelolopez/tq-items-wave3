import java.io.*;

public class UserRepository {
    public static void save(User user, String filename) throws IOException {
        try (ObjectOutputStream output =
                     new ObjectOutputStream(new FileOutputStream(filename))) {
            output.writeObject(user);
        }
    }

    public static User get(String filename) throws IOException,
            ClassNotFoundException {
        try (ObjectInputStream input =
                     new ObjectInputStream(new FileInputStream(filename))) {
            return (User) input.readObject();
        }
    }
}