package com.example.atividade.service;

import com.example.atividade.model.Cliente;
import com.example.atividade.repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    ClienteRepository clienteRepository;
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente(Cliente cliente){
        cliente.setProtocoloAtendimento(gerarProtocolo());
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarCliente(){
        if (clienteRepository.findAll().isEmpty()){
            throw new RuntimeException("Erro, não tem nenhum cliente cadastrado no sistema");
        }
        return clienteRepository.findAll();
    }

    public Cliente atualizarCliente(Cliente cliente, Long id){
        try {
            Cliente atualizarCadastro = clienteRepository.getReferenceById(id);
            clienteAtualizado(atualizarCadastro,cliente);
            return clienteRepository.save(atualizarCadastro);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Erro, não foi possivel atualizar o cadastro." +
                    "Cliente não encontrado pelo sistema");
        }
    }

    public void deletarCliente(Long id){
        try {
            clienteRepository.deleteById(id);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException("Erro, não foi possivel deletar esse cadastro." +
                    "Cliente não encontrado pelo sistema");
        }
    }

    private void clienteAtualizado(Cliente cadastro, Cliente novosDados){
       cadastro.setNome(novosDados.getNome());
    }
    public static String gerarProtocolo() {
        // Gera data e hora no formato yyyyMMddHHmmss
        String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        // Gera um UUID aleatório e pega os 8 primeiros caracteres
        String aleatorio = UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        // Monta o protocolo como uma String
        return "PROTOCOLO-" + dataHora + "-" + aleatorio;
    }


}
