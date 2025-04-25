package com.example.atividade.repository;

import com.example.atividade.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    boolean existsByEmail(String email);
    boolean existsByTelefone(String telefone);
    boolean existsByCpf(String cpf);
    boolean existsByRg(String rg);
}
