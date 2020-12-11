package socialmedia;

public class DemoSocialMediaApp {
    // psvm
    public static void main(String[] args) {

        int intValue = 47;
        Integer integerValue = new Integer(47);
        Integer integerValue2 = 48;

        intValue = integerValue;
        integerValue = intValue;

        System.out.println("---------------------------------------------");

        Profil max = new Profil("Max@Muster.at", "Musterstraße 1", 39, 3_500);
        max.printProfil();

        max.changeAgeStatus(MayBe.STATUS_SET_VISIBLE);
        max.printProfil();



        Profil susi = new Profil("susi@gmail.com", "Gleisdorferstraße 12", 38, 3_700);
        susi.changeSalaryStatus(MayBe.STATUS_SET_VISIBLE);
        susi.printProfil();

        Profil john = new Profil("john@test.com", "New York 1", 40, 3_900);
        john.printProfil();


        max.setBestFriend(susi);
        max.printProfil();

        susi.setBestFriend(max);
        susi.printProfil();
    }
}
