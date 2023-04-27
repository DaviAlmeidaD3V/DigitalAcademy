package me.dio.academia.digital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() { return service.getAll(); }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) { return service.create(form); }

    @PutMapping("{id}")
    public Aluno update(@Valid @PathVariable Long id, @RequestBody Aluno alunoCredenciais) {
        Aluno updatedStudent = repository.findById(id).get();

        updatedStudent.setNome(alunoCredenciais.getNome());
        updatedStudent.setBairro(alunoCredenciais.getBairro());
        updatedStudent.setDataDeNascimento(alunoCredenciais.getDataDeNascimento());
        
        return repository.save(updatedStudent);
    }

    @DeleteMapping("{id}")
    public Aluno delete(@Valid @PathVariable Long id) { return service.delete(id);}

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }
}
