package com.example.semana04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana04.entity.Libro;
import com.example.semana04.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository repo;

    @Override
    public List<Libro> listarLibros() {
        return repo.findAll();
    }

    @Override
    public List<Libro> listarLibrosXPageCount(int pageCount) {
        return repo.findByPageCount(pageCount);
    }

    @Override
    public List<Libro> listarLibrosXIsbn(String isbn) {
        return repo.findByIsbn(isbn);
    }

    @Override
    public List<Libro> listarLibrosXTitle(String title) {
        return repo.findByTitle(title);
    }
    
}
