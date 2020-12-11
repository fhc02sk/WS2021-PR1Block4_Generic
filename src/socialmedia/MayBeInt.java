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
        this.status = status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public int getStatus() {
        return status;
    }
}
