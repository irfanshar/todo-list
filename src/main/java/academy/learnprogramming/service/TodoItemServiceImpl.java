package academy.learnprogramming.service;

import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class TodoItemServiceImpl implements TodoItemService{

    // == fields ==
    private final TodoData data = new TodoData();

    // == public methods ==
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    public void removeItem(int id) {
        data.removeItem(id);
    }

    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }

}
