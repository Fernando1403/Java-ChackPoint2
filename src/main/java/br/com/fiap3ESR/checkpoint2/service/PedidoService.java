package br.com.fiap3ESR.checkpoint2.service;

import br.com.fiap3ESR.checkpoint2.model.Pedido;
import br.com.fiap3ESR.checkpoint2.repository.PedidoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Cria um novo pedido
    public Pedido createPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Retorna todos os pedidos
    public List<Pedido> readAllPedidos() {
        return pedidoRepository.findAll();
    }

    // Busca um pedido pelo ID — lança exceção se não encontrar
    public Pedido readPedidoById(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado com id: " + id));
    }

    // Atualiza os dados de um pedido existente
    public Pedido updatePedido(Long id, Pedido pedido) {
        return pedidoRepository.findById(id)
                .map(existingPedido -> {
                    existingPedido.setClienteNome(pedido.getClienteNome());
                    existingPedido.setValorTotal(pedido.getValorTotal());
                    return pedidoRepository.save(existingPedido);
                })
                .orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado com id: " + id));
    }

    // Remove um pedido pelo ID
    public void deletePedidoById(Long id) {
        try {
            pedidoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException("Pedido não encontrado com id: " + id);
        }
    }
}
