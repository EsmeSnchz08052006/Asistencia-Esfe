package com.esfe.Asistencia.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import com.esfe.Asistencia.Modelos.Grupo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface IGrupoService {
    Page<Grupo> buscarTodos(Pageable pageable);
    List<Grupo> obtenerTodos ();
    Optional<Grupo> buscarPorId(Integer id);
    Grupo crearOeditar(Grupo grupo);
    void eliminarPorId(Integer id);
}
