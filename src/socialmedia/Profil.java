package socialmedia;

public class Profil {
    private String username;
    private String address;

    private MayBeInt age;   // statt dem Datentyp int => MayBeInt

    private double salary;
    private Profil bestFriend;

    public Profil(String username, String address, int age, double salary) {
        this.username = username;
        this.address = address;
        this.age = new MayBeInt(age, 2); // neues Objekt von MayBeInt
        this.salary = salary;
    }

    public void changeAgeStatus(int status) {
        age.setStatus(status);
    }

    public void printProfil() {
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
        System.out.print("Age: ");
        age.print();
        System.out.println("Salary: " + salary);

        if (bestFriend != null) {
            System.out.println("Username of BestFriend: " + bestFriend.username);
        }
        System.out.println("*********************************************");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age.setValue(age);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }
}
