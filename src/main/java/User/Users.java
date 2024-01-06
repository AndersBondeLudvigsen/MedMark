package User;

import java.util.ArrayList;

public class Users {

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    private ArrayList<User> userArrayList;

    public Users(){
        userArrayList = new ArrayList<>();
    }

    public void createUser(String username, Role role){
            int id = userArrayList.size() +1;
            User user = new User(username, id, role);
            userArrayList.add(user);
    }

    public ArrayList<User> spesifikRole(Role role){
        ArrayList arrayList = new ArrayList<>();
        for (User user: userArrayList){
            if (user.getRole().equals(role)){
                arrayList.add(user);
            }

        }
        return arrayList;

    }


}
