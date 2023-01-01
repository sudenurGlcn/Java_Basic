public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 10, 100, 100,50,50);
        Fighter f2 = new Fighter("Veli", 10, 100, 95,50,50);
        Match match = new Match(f1, f2, 90, 100);
        match.run();
    }
}