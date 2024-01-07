package Klausur_10_08_2022.Aufgabe_001;

/**
 * Programm 1
 * <p>
 * TODO Die IDs der User-Objekte sollen durch den Konstruktor automatisch und
 * fortlaufend, startend mit 1 (also 1, 2, 3, ...), vergeben werden.
 */
public class User {
    private final int id;
    private String userName;

    private static int counter = 0 ;

    public User(String userName) {
        this.id = ++counter;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", userName=" + userName + "]";
    }

    public static void main(String[] args) {
        var user1 = new User("johnDoe");
        var user2 = new User("janeDoe");
        var user3 = new User("admin");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
