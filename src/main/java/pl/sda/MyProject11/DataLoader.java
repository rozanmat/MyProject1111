package pl.sda.MyProject11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.sda.MyProject11.entity.Todo;
import pl.sda.MyProject11.repository.TodoRepository;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 1; i <= 15; i++) {
            insertTodo(i, false);
            insertTodo(i, true);
        }
    }

    private void insertTodo(int index, boolean completed) {
        Todo todo = new Todo();
        todo.setName("Zadanie " + index);
        todo.setCompleted(completed);

        todoRepository.save(todo);
    }
}
