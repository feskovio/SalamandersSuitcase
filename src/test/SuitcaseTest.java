package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
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

    }

    @Test
    public void testCallByName() throws Exception {

    }

    @Test
    public void testGetTotalFoodWeight() throws Exception {

    }

    @Test
    public void testGetAvgWeight() throws Exception {

    }

    @Test
    public void testSelfEnter() throws Exception {

    }
}