package com.demo.api.controller;

import com.demo.api.service.UsuarioService;
import com.demo.api.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/saludar")
    public String saludar(){return "Esta funcionando lpm  fdfdfd";}

    @GetMapping("/all")
    public ArrayList<Usuario> getAllUser(){
        return usuarioService.getAlluser();
    }

    @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id") Long id){
            return usuarioService.getUserById(id);
    }

    @PostMapping("/save")
    public Usuario  saveUser(@RequestBody Usuario u){
        return usuarioService.saveUser(u);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        if(usuarioService.deleteUserById(id))
            return "Se elimino el usuario";
        else
            return "No elimino nada";
    }

}
