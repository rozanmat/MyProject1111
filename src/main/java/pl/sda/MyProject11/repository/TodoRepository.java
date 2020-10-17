package pl.sda.MyProject11.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.MyProject11.entity.Todo;


import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> getAllByCompleted(boolean completed);

    Todo getById(Long id);
}
