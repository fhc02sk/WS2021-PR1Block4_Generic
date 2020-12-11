package socialmedia;

public class Profil {
    private String username;
    private String address;

    private MayBe age;   // statt dem Datentyp int => MayBeInt
    private MayBe salary;

    private Profil bestFriend;

    public Profil(String username, String address, int age, int salary) {
        this.username = username;
        this.address = address;
        this.age = new MayBe(age, MayBe.STATUS_SET_NOT_VISIBLE); // neues Objekt von MayBeInt
        this.salary = new MayBe(salary, MayBe.STATUS_SET_NOT_VISIBLE);
    }

    public void changeAgeStatus(int status) {
        age.setStatus(status);
    }

    public void changeSalaryStatus(int status){
        salary.setStatus(status);
    }

    public void printProfil() {
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
        System.out.print("Age: ");
        age.print();
        System.out.print("Salary: ");
        salary.print();

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

    public void setSalary(int salary) {
        this.salary.setValue(salary);
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }
}
