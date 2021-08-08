package academy.learnprogramming.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

// @Data annotation acts as a @Getter and @Setter annotation
@Data
// @EqualsAndHashCode annotation creates equals and hash code methods
// based of the given field
@EqualsAndHashCode(of = "id")
// class represents a single to do item
public class TodoItem {

    // == fields ==
    private int id;
    private String title;
    private String details;
    private LocalDate deadline;


    // == constructors ==
    public TodoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }


}
