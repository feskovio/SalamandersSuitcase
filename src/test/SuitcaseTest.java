package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuitcaseTest {

    @Test
    public void testToggleDayTime() throws Exception {
        Suitcase suitcase = new Suitcase();
        TimeOfDayState timeOfDayState = suitcase.getTimeOfDayState();
        assertTrue(timeOfDayState instanceof DayState, "Initial TimeOfDayState should be DayState");
        suitcase.toggleDayTime();
        timeOfDayState = suitcase.getTimeOfDayState();

        assertTrue(timeOfDayState instanceof NightState, "Initial TimeOfDayState should be NightState " +
                "after toggleDayTime method is called");
    }

    @Test
    public void testAddResident() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        OkkamBeast okkamBeast = new OkkamBeast("Alex");
        suitcase.addResident(okkamBeast);

        assertEquals(suitcase.getBeasts().size(), 1, "Suitcase should have one resident");
        assertEquals(suitcase.getBeasts().get(0).getName(), "Alex", "Beast name should be 'Alex'");
    }

    @Test
    public void testSpeak() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        OkkamBeast okkamBeast = new OkkamBeast("Alex");
        LichurkaBeast lichurkaBeast = new LichurkaBeast("James");
        KomuflorBeast komuflorBeast = new KomuflorBeast("William");
        suitcase.addResident(okkamBeast);
        suitcase.addResident(lichurkaBeast);
        suitcase.addResident(komuflorBeast);
        String testMessage = "Okkam is here! ( Alex )\n" +
                "Lichurka speaking! ( James )\n" +
                "Komuflor is roaring! ( William )\n";

        assertEquals(suitcase.speak(), testMessage, "Suitcase speak method should return correct message");
    }

    @Test
    public void testCallByName() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        OkkamBeast okkamBeast = new OkkamBeast("Alex");
        LichurkaBeast lichurkaBeast = new LichurkaBeast("James");
        KomuflorBeast komuflorBeast = new KomuflorBeast("William");
        suitcase.addResident(okkamBeast);
        suitcase.addResident(lichurkaBeast);
        suitcase.addResident(komuflorBeast);
        String testMessage = "Okkam is here! ( Alex )";

        assertEquals(suitcase.callByName("Alex"), testMessage, "Suitcase speak method should return correct message");
    }

    @Test
    public void testCallByNameFail() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        OkkamBeast okkamBeast = new OkkamBeast("Alex");
        LichurkaBeast lichurkaBeast = new LichurkaBeast("James");
        KomuflorBeast komuflorBeast = new KomuflorBeast("William");
        suitcase.addResident(okkamBeast);
        suitcase.addResident(lichurkaBeast);
        suitcase.addResident(komuflorBeast);

        assertThrows(NoAnimalWithSuchNameException.class, () -> {
            suitcase.callByName("Andre");
        }, "Should throw NoAnimalWithSuchNameException if no animal with such name is present");
    }

    @Test
    public void testGetTotalFoodWeight() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        OkkamBeast okkamBeast = new OkkamBeast("Alex");
        LichurkaBeast lichurkaBeast = new LichurkaBeast("James");
        KomuflorBeast komuflorBeast = new KomuflorBeast("William");
        suitcase.addResident(okkamBeast);
        suitcase.addResident(lichurkaBeast);
        suitcase.addResident(komuflorBeast);

        assertEquals(suitcase.getTotalFoodWeight(), 80, "Total food weight should be 80");
    }

    @Test
    public void testGetAvgWeight() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        OkkamBeast okkamBeast = new OkkamBeast("Alex");
        LichurkaBeast lichurkaBeast = new LichurkaBeast("James");
        KomuflorBeast komuflorBeast = new KomuflorBeast("William");
        suitcase.addResident(okkamBeast);
        suitcase.addResident(lichurkaBeast);
        suitcase.addResident(komuflorBeast);

        assertEquals(suitcase.getAvgFoodWeight(), 26, "Average food weight should be 80");
    }

    @Test
    public void testSelfEnter() throws Exception {
        OkkamRoom okkamRoom = new OkkamRoom(new LichurkaRoom(new KomuflorRoom()));
        Suitcase suitcase = new Suitcase(okkamRoom);
        int beastsNum = 10;
        for (int i = 0; i < beastsNum; i++) {
            suitcase.selfEnter();
        }

        assertEquals(suitcase.getBeasts().size(), beastsNum, "Suitcase should have " + beastsNum + " animals");
    }
}