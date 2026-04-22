package br.com.fiap3ESR.checkpoint2.controller;

import br.com.fiap3ESR.checkpoint2.model.Pedido;
import br.com.fiap3ESR.checkpoint2.service.PedidoService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // POST /pedidos — Cria um novo pedido
    @PostMapping
    public ResponseEntity<Object> createPedido(@Valid @RequestBody Pedido pedido) {
        try {
            Pedido novoPedido = pedidoService.createPedido(pedido);
            return new ResponseEntity<>(novoPedido, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    // GET /pedidos — Retorna todos os pedidos
    @GetMapping
    public List<Pedido> readPedidos() {
        return pedidoService.readAllPedidos();
    }

    // GET /pedidos/{id} — Retorna um pedido pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Object> getPedido(@PathVariable Long id) {
        try {
            Pedido pedido = pedidoService.readPedidoById(id);
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    // PUT /pedidos/{id} — Atualiza um pedido existente
    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePedido(@PathVariable Long id,
                                               @Valid @RequestBody Pedido pedido) {
        try {
            Pedido pedidoAtualizado = pedidoService.updatePedido(id, pedido);
            return new ResponseEntity<>(pedidoAtualizado, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    // DELETE /pedidos/{id} — Remove um pedido pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePedido(@PathVariable Long id) {
        try {
            pedidoService.deletePedidoById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
