package com.demo.api.service;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.api.model.Usuario;

public interface UsuarioService {
    ArrayList<Usuario> getAlluser();
    Optional<Usuario> getUserById(Long id);
    Usuario saveUser(Usuario u);
    boolean deleteUserById(Long id);
    Optional<Usuario> getUserByName(String name);

}
