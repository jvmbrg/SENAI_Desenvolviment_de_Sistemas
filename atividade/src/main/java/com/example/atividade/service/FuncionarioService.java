package com.example.atividade.service;

import com.example.atividade.model.Funcionario;
import com.example.atividade.repository.FuncionarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class FuncionarioService {

    FuncionarioRepository funcionarioRepository;
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario criarFuncionario(Funcionario funcionario) {
        if (funcionarioRepository.existsByEmail(funcionario.getEmail())) {
            throw new RuntimeException("Já tem um funcionario com esse email cadastrado");
        }
        if (funcionarioRepository.existsByCpf(funcionario.getCpf())) {
            throw new RuntimeException("CPF de funcionario já cadastrado no sistema");
        }
        if (funcionarioRepository.existsByRg(funcionario.getRg())){
            throw new RuntimeException("RG de funcionario ja cadastrado no sistema");
        }
        if(funcionarioRepository.existsByTelefone(funcionario.getTelefone())){
            throw new RuntimeException("Telefone de funcionario já cadastrado no sistema");
        }

        funcionario.setMatricula(gerarMatricula());
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarFuncionario(){
        if (funcionarioRepository.findAll().isEmpty()){
            throw new RuntimeException("Erro, não tem nenhum dado cadastrado no sistema");
        }
        return funcionarioRepository.findAll();
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario, Long id){
        try {
            Funcionario atualizarCadastro = funcionarioRepository.getReferenceById(id);
            funcionarioAtualizado(atualizarCadastro,funcionario);
            return funcionarioRepository.save(atualizarCadastro);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Erro, não foi possivel atualizar o cadastro");
        }
    }

    public void deletarFuncionario(Long id){
        try {
            funcionarioRepository.deleteById(id);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException("Erro, não foi possivel deletar esse cadastro.");
        }
    }

    private void funcionarioAtualizado(Funcionario cadastro, Funcionario novosDados){
       cadastro.setNome(novosDados.getNome());
       cadastro.setEmail(novosDados.getEmail());
       cadastro.setTelefone(novosDados.getTelefone());
    }


    public static String gerarMatricula() {
        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        int numero = new Random().nextInt(900) + 100; // Gera número entre 100 e 999
        return "MATRICULA-" + data + "-" + numero;
    }


}
