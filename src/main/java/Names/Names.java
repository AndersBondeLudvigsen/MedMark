package Names;

public class Names {
    private String firstname;
    private String middleName;
    private String lastName;

    public Names(String fullName){
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            this.firstname = nameParts[0];
            this.middleName = null;
            this.lastName = nameParts[1];
        }
        else if (nameParts.length ==3){
            this.firstname = nameParts [0];
            this.middleName = nameParts [1];
            this.lastName = nameParts [2];
        }
        }
        public String toString(){
        if (middleName!= null){
            return "Firstname: " + firstname + " " + "Middlename: " + middleName + " "+ "Lastname: " + lastName;
        }
        else return "Firstname: " + firstname + " " + "Lastname: " + lastName;

        }



    }

