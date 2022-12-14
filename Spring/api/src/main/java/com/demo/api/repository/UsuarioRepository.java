package com.demo.api.repository;

import com.demo.api.model.Usuario;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
    Optional<Usuario> findByNombre(String name);
    Optional<Usuario> findByNombreAndContrasena(String name,String password);

    @Query(value="SELECT * FROM Usuario where nombre = :nombre",nativeQuery = true)
    List<Usuario> findAllUsersQuery(@Param("nombre") String nombre);
}
