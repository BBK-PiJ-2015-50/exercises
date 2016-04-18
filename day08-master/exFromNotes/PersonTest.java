/**
 * Created by chris on 12/26/15.
 */
public class PersonTest {

    public static void main(String[] args) {
        PersonTest test = new PersonTest();
        test.launch();
    }

    private void launch() {
        Person son = new AdultPerson();
        // move in front of mother
        son.move(10);
        // give the message
        son.say("I love you, Mum.");

        Person man = new KidPerson();
        // move in front of mother
        man.move(10);
        // give the message
        man.say("I love you, Mum.");
    }
}
