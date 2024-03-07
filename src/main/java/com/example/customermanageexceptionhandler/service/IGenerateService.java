package com.example.customermanageexceptionhandler.service;

import com.example.customermanageexceptionhandler.exeption.DuplicateEmailException;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t) throws DuplicateEmailException;

    T findById(Long id);

    void remove(Long id);
}
