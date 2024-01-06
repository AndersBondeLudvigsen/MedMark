package User;

public class User {
    private String userName;
    private int userId;
    private Role role;

    public User(String userName, int userId, Role role) {
        this.userName = userName;
        this.userId = userId;
        this.role = role;
    }

    public Role getRole(){
        return role;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", role=" + role +
                '}';
    }
}

