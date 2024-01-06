package Hogwarts;

public class HogwartsStudent implements  Comparable <HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    public void setLastName(String newLastName){
        if (newLastName.toLowerCase().equals("Ravenclaw".toLowerCase())|| newLastName.toLowerCase().equals("Gryffindor".toLowerCase())){
            this.lastName = newLastName;
        }
        else throw new IllegalArgumentException("Prøv igen");
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
    @Override
    public int compareTo(HogwartsStudent otherStudent) {
        return this.lastName.compareToIgnoreCase(otherStudent.lastName);
    }
}
