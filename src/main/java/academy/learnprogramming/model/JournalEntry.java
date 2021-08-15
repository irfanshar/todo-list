package academy.learnprogramming.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class JournalEntry {

    // == fields ==
    private String textEntry;
    private String title;
    private LocalDate date;
    private int id;


    // == constructors ==
    public JournalEntry(String textEntry, String title , LocalDate date) {
        this.textEntry = textEntry;
        this.title = title;
        this.date = date;
    }
}