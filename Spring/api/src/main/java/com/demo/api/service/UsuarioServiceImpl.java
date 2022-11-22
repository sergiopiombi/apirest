package com.demo.api.service;

import com.demo.api.model.Usuario;
import com.demo.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServiceImpl  implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public ArrayList<Usuario> getAllUser() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUserById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario saveUser(Usuario u) {
        return usuarioRepository.save(u);

    }

    @Override
    public boolean deleteUserById(Long id) {
        try{
            Optional<Usuario> u = usuarioRepository.findById(id);
            usuarioRepository.delete(u.get());
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    @Override
    public Optional<Usuario> getUserByName(String name) {return usuarioRepository.findByNombre(name); }

    @Override
    public Optional<Usuario> getUserByNameAndContrasena(String name, String password) {
        return usuarioRepository.findByNombreAndContrasena(name,password);
    }

    public ArrayList<Usuario> getAlluserQuery(String nombre){
        return (ArrayList<Usuario>) usuarioRepository.findAllUsersQuery(nombre);
    }


}
