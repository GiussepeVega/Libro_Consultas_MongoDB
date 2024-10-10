package com.example.semana04.service;

import java.util.List;

import com.example.semana04.entity.Libro;

public interface LibroService {
    public List<Libro> listarLibros();
    public List<Libro> listarLibrosXPageCount(int pageCount);
    public List<Libro> listarLibrosXIsbn(String isbn);
    public List<Libro> listarLibrosXTitle(String title);
}
