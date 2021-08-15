package academy.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Journal {

    // == fields ==
    private final List<JournalEntry> journalEntryList = new ArrayList<>();
    private static int id = 1;

    // == constructors ==
    public Journal(){
        addJournalEntry(new JournalEntry("this is entry one", "first", LocalDate.now()));
        addJournalEntry(new JournalEntry("ENTRY TWOOO", "second", LocalDate.now()));
        addJournalEntry(new JournalEntry("tHIs is thE 3RD ENTRY", "thIRD",LocalDate.now()));
    }

    // == public methods ==
    public List<JournalEntry> getJournalEntryList() {
        return Collections.unmodifiableList(journalEntryList);
    }

    public void addJournalEntry(JournalEntry journalEntry) {
        journalEntry.setId(id++);
        journalEntryList.add(journalEntry);
    }

    public void removeItem(int id) {

        ListIterator<JournalEntry> itemIterator = journalEntryList.listIterator();

        while (itemIterator.hasNext()) {
            JournalEntry journalEntry1 = itemIterator.next();

            if (journalEntry1.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public JournalEntry getItem(int id) {

        for (JournalEntry entry : journalEntryList) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateItem(@NonNull JournalEntry toUpdate) {
        ListIterator<JournalEntry> listIterator = journalEntryList.listIterator();

        while (listIterator.hasNext()) {
            JournalEntry journalEntry = listIterator.next();
            if (journalEntry.equals(toUpdate)) {
                listIterator.set(toUpdate);
                break;
            }
        }
    }
}
