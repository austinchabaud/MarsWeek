public class App {
    public static void main(String[] args) throws Exception {
        String words;
        int number = 24;
        double decimal;
        boolean isItReal = true;

        if(number < 25) {
            System.out.println(isItReal);
        } else {
            System.out.println(false);
        }
    
        Mars.landingCheck(4);
        GuessingGame guess = new GuessingGame();
        MarsExpedition explore = new MarsExpedition();
        FindingsList findings = new FindingsList();
    }
}
