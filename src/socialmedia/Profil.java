package socialmedia;

public class Profil {
    private String username;
    private String address;

    private int age;

    private double salary;
    private Profil bestFriend;

    public Profil(String username, String address, int age, double salary) {
        this.username = username;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public void printProfil() {
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
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
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }
}
