import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventLogTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddCorrectEvent() throws Exception {
        Event newEvent = new Event("Face2Face", "Meet in cubefarm at noon");
        EventLog newEventLog = new EventLog();
        assertTrue(newEventLog.addEvent(newEvent));
    }

    @Test
    public void testAddNullNameEvent() throws Exception {
        Event newEvent = new Event(null,"Meet in cubefarm at noon");
        EventLog newEventLog = new EventLog();

        try {
            newEventLog.addEvent(newEvent);
            fail("We shouldn't reach this line");
        } catch (IllegalArgumentException exception) {
            assertTrue(true);
        }
    }

    @Test
    public void testAddNullActionEvent() throws Exception {
        Event newEvent = new Event("Face2Face",null);
        EventLog newEventLog = new EventLog();

        try {
            newEventLog.addEvent(newEvent);
            fail("We shouldn't reach this line");
        } catch (IllegalArgumentException exception) {
            assertTrue(true);
        }
    }

    @Test
    public void testAddAllNullEvent() throws Exception {
        Event newEvent = new Event(null,null);
        EventLog newEventLog = new EventLog();

        try {
            newEventLog.addEvent(newEvent);
            fail("We shouldn't reach this line");
        } catch (IllegalArgumentException exception) {
            assertTrue(true);
        }
    }

    @Test
    public void testAddWrongNameEvent() throws Exception {
        Event newEvent = new Event("Stand Up Meeting","Meet in the annex");
        EventLog newEventLog = new EventLog();

        try {
            newEventLog.addEvent(newEvent);
            fail("We shouldn't reach this line");
        } catch (IllegalArgumentException exception) {
            assertTrue(true);
        }
    }
}