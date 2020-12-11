package socialmedia;

public class MayBeInt {

    private int age;
    private int status;
    /*
        1 ... nicht erfasst
        2 ... erfasst, aber soll nicht ausgegeben werden
        3 ... erfasst und kann ausgegeben werden
     */

    public static final int STATUS_NOT_SET = 1;
    public static final int STATUS_SET_NOT_VISIBLE = 2;
    public static final int STATUS_SET_VISIBLE = 3;

    public MayBeInt(int age, int status) {
        this.age = age;
        setStatus(status);
    }

    public void print(){
        if (status == STATUS_NOT_SET)
            System.out.println("Wert wurde nicht erfasst");
        else if (status == STATUS_SET_NOT_VISIBLE)
            System.out.println("Wert wurde erfasst, aber darf nicht ausgegeben werden!");
        else if (status == STATUS_SET_VISIBLE)
            System.out.println("Wert: " + age);
        else
            System.out.println("Undefinierter Status");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(int status) {
        if (status >= STATUS_NOT_SET && status <= STATUS_SET_VISIBLE)
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
