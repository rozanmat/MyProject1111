package pl.sda.MyProject11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.MyProject11.entity.Todo;
import pl.sda.MyProject11.repository.TodoRepository;

import java.util.List;

@Service("todoService")
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

//    @Autowired
//    public TodoServiceImpl(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }

    @Override
    public List<Todo> getAll() {
        return todoRepository.getAllByCompleted(false);
    }

    @Override
    public List<Todo> getAllCompleted() {
        return todoRepository.getAllByCompleted(true);
    }

    @Override
    public Todo addTodo(String name) {
        Todo todo = new Todo(name, false);
        return todoRepository.save(todo);
    }

    @Override
    public void completeTodo(Long id) {
        Todo todo = todoRepository.getById(id);

        if (todo != null) {
            todo.setCompleted(true);
            todoRepository.save(todo);
        }
    }
}
