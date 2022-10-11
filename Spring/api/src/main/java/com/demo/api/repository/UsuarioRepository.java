package com.demo.api.repository;

import com.demo.api.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
    Optional<Usuario> findByNombre(String name);
    Optional<Usuario> findByNombreAndContrasena(String name,String password);

}
