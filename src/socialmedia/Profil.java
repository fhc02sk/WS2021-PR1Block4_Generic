package socialmedia;

public class Profil {
    private String username;
    private MayBe<String> address;

    private MayBe<Integer> age;   // statt dem Datentyp int => MayBeInt
    private MayBe<Double> salary;

    private Profil bestFriend;

    public Profil(String username, String address, int age, double salary) {
        this.username = username;
        this.address = new MayBe<String>(address, MayBe.STATUS_SET_VISIBLE);
        this.age = new MayBe<Integer>(age, MayBe.STATUS_SET_NOT_VISIBLE); // neues Objekt von MayBeInt
        this.salary = new MayBe<Double>(salary, MayBe.STATUS_SET_NOT_VISIBLE);
    }

    public void changeAgeStatus(int status) {
        age.setStatus(status);
    }

    public void changeSalaryStatus(int status){
        salary.setStatus(status);
    }

    public void printProfil() {
        System.out.println("Username: " + username);
        System.out.print("Address: " );
        address.print();
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
        this.address.setValue(address);
    }

    public void setAge(int age) {
        this.age.setValue(age);
    }

    public void setSalary(double salary) {
        this.salary.setValue(salary);
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }
}
