package th.ac.ku.sci.todolistapp.model;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/** JUnit 5 test */

class DataModelTest {

    private File f;
    private DataModel dataModel;

    @BeforeEach
    void setup() {
        dataModel = DataModel.getInstance();
    }

    @Test
    void saveAndLoadNullFile_ThrowException() {
        // Save null
        assertThrows(FileNotFoundException.class,
                () -> { dataModel.save(null); });

        // Load null
        assertThrows(FileNotFoundException.class,
                () -> { dataModel.load(null); });

    }

    @Test
    void loadNonExistingFile_ThrowException() {
        assertDoesNotThrow(() -> {
            f = File.createTempFile("save", ".sav");
            f.delete();
        });

        assertFalse(f.exists());
        f.deleteOnExit();

        // Load non-existing file
        assertThrows(FileNotFoundException.class, () -> {
            dataModel.load(f);
        });

        // Save empty data
        assertDoesNotThrow(() -> { dataModel.save(f); });
    }

    @Test
    void loadExistingFile_NotThrowException() {

        assertDoesNotThrow(() -> {
            f = File.createTempFile("save", ".sav");
            f.delete();
        });

        assertDoesNotThrow(() -> { dataModel.save(f); });
        f.deleteOnExit();
        assertTrue(f.exists());
        assertDoesNotThrow(() -> { dataModel.load(f); });
    }
    @Test
    void loadAndSaveTodo() {
        assertDoesNotThrow(() -> {
            f = File.createTempFile("save", ".sav");
            f.delete();
        });

        // create file
        f.deleteOnExit();

        assertEquals(0, dataModel.getObservableList().size());

        ObservableList<TodoItem> l = dataModel.getObservableList();

        TodoItem[] todoItems = new TodoItem[5];
        for (int i = 0; i < 5; i++) {
            todoItems[i] = TodoItem.createRandomTodoItem();
            l.add(todoItems[i]);
        }

        assertDoesNotThrow(() -> {dataModel.save(f);});

        l.clear();

        assertDoesNotThrow(() -> {dataModel.load(f);});

        l = dataModel.getObservableList();

        int i = 0;
        for (TodoItem t:l) {
            assertEquals(todoItems[i],t);
            i++;
        }
    }
}