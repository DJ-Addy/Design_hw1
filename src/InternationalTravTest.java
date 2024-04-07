import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class InternationalTravTest {
    private international_traveler traveler;
    private String name;
    private String passportNumber;
    private boolean isUSCitizen;
    private boolean hasValidVisa;
    private boolean hasCleanBackground;
    private boolean hasExplanationForMinorCrime;
    private boolean isBringingProhibitedItems;

    public InternationalTravTest(String name, String passportNumber, boolean isUSCitizen, boolean hasValidVisa,
            boolean hasCleanBackground, boolean hasExplanationForMinorCrime, boolean isBringingProhibitedItems) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.isUSCitizen = isUSCitizen;
        this.hasValidVisa = hasValidVisa;
        this.hasCleanBackground = hasCleanBackground;
        this.hasExplanationForMinorCrime = hasExplanationForMinorCrime;
        this.isBringingProhibitedItems = isBringingProhibitedItems;
    }

    @Before
    public void setUp() {
        traveler = new international_traveler(name, passportNumber, isUSCitizen, hasValidVisa, hasCleanBackground,
                hasExplanationForMinorCrime, isBringingProhibitedItems);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"John Doe the Deer", "P123456", true, true, true, true, false},
                {"Alex the BlackSmith", "P987654", false, true, true, false, false},
                {"Raj the Man", "P654321", false, false, true, true, true},
                {"Eve the beesknees", "P789456", true, true, false, false, true}
        });
    }

    @Test
    public void testGetName() {
        assertEquals(name, traveler.getName());
    }

    @Test
    public void testGetPassportNumber() {
        assertEquals(passportNumber, traveler.getPassportNumber());
    }

    @Test
    public void testIsUSCitizen() {
        assertEquals(isUSCitizen, traveler.isUSCitizen());
    }

    @Test
    public void testHasValidVisa() {
        assertEquals(hasValidVisa, traveler.hasValidVisa());
    }

    @Test
    public void testHasCleanBackground() {
        assertEquals(hasCleanBackground, traveler.hasCleanBackground());
    }

    @Test
    public void testHasExplanationForMinorCrime() {
        assertEquals(hasExplanationForMinorCrime, traveler.hasExplanationForMinorCrime());
    }

    @Test
    public void testIsBringingProhibitedItems() {
        assertEquals(isBringingProhibitedItems, traveler.isBringingProhibitedItems());
    }
}