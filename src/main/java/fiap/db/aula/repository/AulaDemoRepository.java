package fiap.db.aula.repository;

import fiap.db.aula.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface AulaDemoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findById(Integer id);
}