package academy.learnprogramming.controller;

import academy.learnprogramming.model.Journal;
import academy.learnprogramming.model.JournalEntry;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class JournalController {

    // == model attributes ==
    @ModelAttribute
    public Journal journal(){
        return new Journal();
    }

    // == handler methods ==
    @GetMapping(Mappings.JOURNAL)
    public String journalList(){
        return ViewNames.JOURNAL_LIST;
    }
}
