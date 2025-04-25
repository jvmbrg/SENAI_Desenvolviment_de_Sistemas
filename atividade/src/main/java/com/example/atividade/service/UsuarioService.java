package com.example.atividade.service;

import com.example.atividade.model.Usuario;
import com.example.atividade.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(Usuario usuario){
        if(usuarioRepository.existsByEmail(usuario.getEmail())){
            throw new RuntimeException("Já tem um usuario com esse email cadastrado");
        }
        if (usuarioRepository.existsByTelefone(usuario.getTelefone())){
            throw new RuntimeException("Já tem um usuario com esse telefone cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuario(){
        if (usuarioRepository.findAll().isEmpty()){
            throw new RuntimeException("Erro, não tem nenhum dado cadastrado no sistema");
        }
        return usuarioRepository.findAll();
    }

    public Usuario atualizarUsuario(Usuario usuario, Long id){
        try {
            Usuario atualizarCadastro = usuarioRepository.getReferenceById(id);
            usuarioAtualizado(atualizarCadastro,usuario);
            return usuarioRepository.save(atualizarCadastro);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Erro, não foi possivel atualizar o cadastro");
        }
    }

    public void deletarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException("Erro, não foi possivel deletar esse cadastro.");
        }
    }

    private void usuarioAtualizado(Usuario cadastro, Usuario novosDados){
       cadastro.setNome(novosDados.getNome());
       cadastro.setEmail(novosDados.getEmail());
       cadastro.setTelefone(novosDados.getTelefone());
       cadastro.setSenha(novosDados.getSenha());
    }


    public static String gerarMatricula() {
        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        int numero = new Random().nextInt(900) + 100; // Gera número entre 100 e 999
        return "MATRICULA-" + data + "-" + numero;
    }


}
