package User;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        users.createUser("Anders", Role.ADMIN);
        users.createUser("Anders1", Role.ADMIN);
        users.createUser("Anders2", Role.READOR);
        System.out.println(users.getUserArrayList());
        System.out.println(users.spesifikRole(Role.ADMIN));
    }
}
