package com.servicio.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.usuario.model.Usuario;
import com.servicio.usuario.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Listar usuarios
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    //Listar usuario por ID
    public Usuario findById(long id){
        return usuarioRepository.findById(id).get();
    }

    //guardar usuario por ID
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Eliminar usuario
    public void delete(long id){
        usuarioRepository.deleteById(id);
    }
}

/*
 * ackage com.gestion.animales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.animales.model.Animal;
import com.gestion.animales.repository.AnimalRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    //Listar animales
    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    //Listar animal por id
    public Animal findById(long id){
        return animalRepository.findById(id).get();
    }

    //Guardar Animal
    public Animal save(Animal animal){
        return animalRepository.save(animal);
    }

    //Eliminar animal (por id)
    public void delete(long id){
        animalRepository.deleteById(id);
    }
}

 */