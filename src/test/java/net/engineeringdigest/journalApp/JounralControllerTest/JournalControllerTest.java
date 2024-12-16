package net.engineeringdigest.journalApp.JounralControllerTest;

import net.engineeringdigest.journalApp.controller.JournalEntryController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JournalControllerTest {

    @Autowired
    private JournalEntryController journalEntryController;

    @Test
    public void testGetAllJEs(){
        journalEntryController.getAllJournalEntriesOfUser();
    }
}
