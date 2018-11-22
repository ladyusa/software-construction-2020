package th.ac.ku.sci.todolistapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import th.ac.ku.sci.todolistapp.model.TodoItem;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


/** JUnit 5 test */

class TodoItemTest {

    private Date first, third, second;

    @BeforeEach
    void setup() {
        Calendar cal = Calendar.getInstance();
        cal.set(2018,01,01);
        first = cal.getTime();
        cal.set(2018,02,10);
        second = cal.getTime();
        cal.set(2018,02,23);
        third = cal.getTime();
    }

    @Test
    void dateStartBeforeEnd() {
        TodoItem item = new TodoItem();
        item.setStart(first);
        assertEquals(item.getStart(), first);

        item.setEnd(third);
        assertEquals(item.getEnd(), third);
    }

    @Test
    void dateStartAndEndAreNull_WillRemainNull() {
        TodoItem item = new TodoItem();
        item.setStart(null);
        assertEquals(null, item.getStart());

        item.setEnd(null);
        assertEquals(null, item.getEnd());
    }

    @Test
    void dateEndBeforeStart_DateWillSwitchPlaces() {
        TodoItem item = new TodoItem();
        item.setEnd(first);
        item.setStart(third);

        assertEquals(first, item.getStart());
        assertEquals(third, item.getEnd());
    }

    @Test
    void dateStartAfterEnd_DateWillSwitchPlaces() {
        TodoItem item = new TodoItem();
        item.setStart(third);
        item.setEnd(first);

        assertEquals(first, item.getStart());
        assertEquals(third, item.getEnd());

    }

    @Test
    void sequenceStartAfterEnd_WillSwitchPlaces() {
        TodoItem item = new TodoItem();

        item.setStart(third);
        item.setEnd(first);
        item.setEnd(second);
        item.setStart(third);
        assertEquals(second, item.getStart());
        assertEquals(third, item.getEnd());

    }

    @Test
    void sequenceEndBeforeStart_WillSwitchPlaces() {
        TodoItem item = new TodoItem();
        item.setStart(second);
        item.setEnd(third);
        item.setEnd(first);

        assertEquals(first,item.getStart());
        assertEquals(second,item.getEnd());
    }

    @Test
    void todoObjNotEqualsNull() {
        TodoItem t1 = new TodoItem();
        assertFalse(t1.equals(null));
    }

    @Test
    void twoDefaultTodoAreEqual() {
        TodoItem t1 = new TodoItem();
        TodoItem t2 = new TodoItem();
        assertTrue(t1.equals(t2));
    }

    @Test
    void defaultWithSameTitleAreEqual() {
        TodoItem t1 = new TodoItem();
        TodoItem t2 = new TodoItem();
        t1.setTitle("a");
        assertFalse(t1.equals(t2));
        t2.setTitle("a");
        assertTrue(t1.equals(t2));
    }

    @Test
    void defaultWithSameTitleDiffDetailAreNotEqual() {
        TodoItem t1 = new TodoItem();
        TodoItem t2 = new TodoItem();
        t1.setTitle("a");
        t2.setTitle("a");
        t1.setDetail("da");
        assertFalse(t1.equals(t2));
    }

    @Test
    void sequenceSetTitleDetail1() {
        TodoItem t1 = new TodoItem();
        TodoItem t2 = new TodoItem();
        t1.setTitle("a");
        t2.setTitle("a");
        t1.setDetail("da");
        t1.setTitle("b");
        assertFalse(t1.equals(t2));
        t2.setTitle("b");
        assertFalse(t1.equals(t2));
        t2.setDetail("da");
        assertTrue(t1.equals(t2));
    }

    @Test
    void sequenceSetTitleDetail2() {
        TodoItem t1 = new TodoItem();
        TodoItem t2 = new TodoItem();
        t1.setTitle("b");
        t2.setTitle("b");
        t1.setDetail("da");
        t2.setDetail("da");
        t1.setTitle("a");
        assertFalse(t1.equals(t2));
        t2.setTitle("a");
        assertTrue(t1.equals(t2));

    }
    // More to test for all combinations
}