package com.gjw.service;

import com.gjw.bean.Books;

import java.util.List;

public interface BookService {

    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();

}
