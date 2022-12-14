package com.demo.api.controller;

import com.demo.api.service.UsuarioService;
import com.demo.api.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public String saludar(){return "Hola";}

    @GetMapping("/all")
    public ArrayList<Usuario> getAllUser(){
        return usuarioService.getAllUser();
    }


    @GetMapping("myquery/{nombre}")
    public ArrayList<Usuario> findAllUsersQuery(@PathVariable("nombre") String nombre) {return usuarioService.getAlluserQuery(nombre);}

    @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id") Long id){
            return usuarioService.getUserById(id);
    }

    @GetMapping("/findName/{name}")
    public Optional<Usuario> getUserByName(@PathVariable("name") String nombre){
        return usuarioService.getUserByName(nombre);
    }

    @GetMapping("/findNamepass/{name}/{password}")
    public Optional<Usuario> getUserByNameAndPassword(@PathVariable("name") String nombre,@PathVariable("password")String password){
        return usuarioService.getUserByNameAndContrasena(nombre,password);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
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
