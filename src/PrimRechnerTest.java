public class PrimRechnerTest {
    private static IPrimRechner primRechner;

    public static void main(String[] args) {
        arrange();
        summeBis1ShouldBe0();
        summeBis2ShouldBe2();
        summeBis3ShouldBe5();
    }

    private static void arrange() {
        // Arrange
        primRechner = new PrimRechner();
    }

    private static void summeBis3ShouldBe5() {
        // Act
        int ergebnis = primRechner.summePrimzahl(3);

        // Assert
        assertSindGleich(ergebnis, 5);
    }

    private static void assertSindGleich(int ergebnis, int erwartet) {
        if(ergebnis == erwartet){
            System.out.println("GREEN");
        }else{
            System.out.println("RED");
        }
    }

    private static void summeBis2ShouldBe2() {
        // Act
        int ergebnis = primRechner.summePrimzahl(2);

        // Assert
        assertSindGleich(ergebnis, 2);
    }

    private static void summeBis1ShouldBe0() {
        // Act
        int ergebnis = primRechner.summePrimzahl(1);

        // Assert
        assertSindGleich(ergebnis, 0);
    }
}
