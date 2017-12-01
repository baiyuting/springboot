package com.example.bai13springcache.dao;

import com.example.bai13springcache.domain.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
