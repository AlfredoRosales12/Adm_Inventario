package com.Proyectos.Inventario.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import models.Cliente;


public interface Clientes extends JpaRepository<Cliente, Long> {


    
}
