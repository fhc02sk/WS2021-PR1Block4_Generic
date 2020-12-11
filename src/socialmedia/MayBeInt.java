package socialmedia;

public class MayBeInt {

    private int age;
    private int status;
    /*
        1 ... nicht erfasst
        2 ... erfasst, aber soll nicht ausgegeben werden
        3 ... erfasst und kann ausgegeben werden
     */

    public MayBeInt(int age, int status) {
        this.age = age;
        setStatus(status);
    }

    public void print(){
        if (status == 1)
            System.out.println("Wert wurde nicht erfasst");
        else if (status == 2)
            System.out.println("Wert wurde erfasst, aber darf nicht ausgegeben werden!");
        else if (status == 3)
            System.out.println("Wert: " + age);
        else
            System.out.println("Undefinierter Status");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(int status) {
        if (status >= 1 && status <= 3)
            this.status = status;
        else {
            System.out.println("Dieser Status ist nicht erlaubt: " + status);
            this.status = 1;
        }
    }

    public int getAge() {
        return age;
    }

    public int getStatus() {
        return status;
    }
}
