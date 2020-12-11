package socialmedia;

public class MayBe <T> {

    private T value; // speichert den eigentlichen Wert
    private int status;
    /*
        1 ... nicht erfasst
        2 ... erfasst, aber soll nicht ausgegeben werden
        3 ... erfasst und kann ausgegeben werden
     */

    public static final int STATUS_NOT_SET = 1;
    public static final int STATUS_SET_NOT_VISIBLE = 2;
    public static final int STATUS_SET_VISIBLE = 3;

    public MayBe(T value, int status) {
        this.value = value;
        

        setStatus(status);
    }

    public void print(){
 /*     if (status == STATUS_NOT_SET)
            System.out.println("Wert wurde nicht erfasst");
        else if (status == STATUS_SET_NOT_VISIBLE)
            System.out.println("Wert wurde erfasst, aber darf nicht ausgegeben werden!");
        else if (status == STATUS_SET_VISIBLE)
            System.out.println("Wert: " + value);
        else
            System.out.println("Undefinierter Status");*/

        switch (status){
            case STATUS_NOT_SET:
                System.out.println("Wert wurde nicht erfasst");
                break;
            case STATUS_SET_NOT_VISIBLE:
                System.out.println("Wert wurde erfasst, aber darf nicht ausgegeben werden!");
                break;
            case STATUS_SET_VISIBLE:
                System.out.println("Wert: " + value);
                break;
            default:
                System.out.println("Undefinierter Status");
        }
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setStatus(int status) {
        if (status >= STATUS_NOT_SET && status <= STATUS_SET_VISIBLE)
            this.status = status;
        else {
            System.out.println("Dieser Status ist nicht erlaubt: " + status);
            this.status = STATUS_NOT_SET;
        }
    }

    public T getValue() {
        return value;
    }

    public int getStatus() {
        return status;
    }
}
