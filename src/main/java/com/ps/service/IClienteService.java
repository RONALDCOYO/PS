package com.ps.service;

import com.ps.model.Cliente;

public interface IClienteService {

    Cliente getClienteById(Long id);
    Cliente createCliente(Cliente client);
     Cliente updateCliente(Cliente cliente);
     void deleteCliente(Long id);
}
