package fiap.db.aula.controller;

import fiap.db.aula.model.Aluno;
import fiap.db.aula.repository.AulaDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/aluno")
public class AulaDemoController {

    @Autowired
    AulaDemoRepository aulaDemoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Aluno>> getall(){
        List<Aluno> lAlunos = aulaDemoRepository.findAll();
        return new ResponseEntity<>(lAlunos, HttpStatus.OK);
    }

    @PostMapping(value = "/incluir")
    public void addAluno( @RequestBody Aluno aluno) {
        aulaDemoRepository.save(aluno);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<HttpStatus> removeAluno(@PathVariable("id") Long id){
        aulaDemoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
