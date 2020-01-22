public class PrimCheckerTest {
    private static IPrimChecker primChecker;

    public static void main(String[] args) {
        arrange();
        isPrimzahl1ShouldBeFalse();
        isPrimzahl2ShouldBeTrue();
        isPrimzahl3ShouldBeTrue();
    }

    private static void isPrimzahl3ShouldBeTrue() {
        boolean ergebnis = primChecker.isPrimzahl(3);
        assertSindGleich(ergebnis, true);
    }

    private static void isPrimzahl2ShouldBeTrue() {
        boolean ergebnis = primChecker.isPrimzahl(2);
        assertSindGleich(ergebnis, true);
    }

    private static void isPrimzahl1ShouldBeFalse() {
        boolean ergebnis = primChecker.isPrimzahl(1);
        assertSindGleich(ergebnis, false);
    }

    private static void arrange() {
        primChecker = new PrimChecker();
    }

    private static void assertSindGleich(boolean ergebnis, boolean erwartet) {
        if(ergebnis == erwartet){
            System.out.println("GREEN");
        }else{
            System.out.println("RED");
        }
    }
}
