package com.example.semana04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.semana04.entity.Libro;
import com.example.semana04.service.LibroService;

@RestController
@RequestMapping("url/libro")
public class LibroController {
    @Autowired
    private LibroService service;

    @GetMapping("/listarTodos")
    public List<Libro> listaAllLibros(){
        return service.listarLibros();
    }

    @GetMapping("/listarLibroByPageCount/{pageCount}")
    public List<Libro> listarLibrosByPageCount(@PathVariable int pageCount){
        return service.listarLibrosXPageCount(pageCount);
    }

    @GetMapping("/listarLibrosByIsbn/{isbn}")
    public List<Libro> listarLibrosPorIsbn(@PathVariable String isbn){
        return service.listarLibrosXIsbn(isbn);
    }

    @GetMapping("/listarLibrosByTitle/{title}")
    public List<Libro> listarLibrosPorTitle(@PathVariable String title){
        return service.listarLibrosXTitle(title);
    }
}
