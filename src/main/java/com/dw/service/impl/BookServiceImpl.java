package com.dw.service.impl;

import com.dw.dao.BookDao;
import com.dw.entities.Book;
import com.dw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao BookDao;
    public boolean saveBook(Book book) {
        return  BookDao.save(book)>0;

    }

    public boolean deleteBook(Integer id) {
        return   BookDao.delete(id)>0;

    }

    public boolean updateBook(Book book) {
        return BookDao.update(book)>0;

    }

    public Book getBooksById(Integer id) {
        return BookDao.getBooksById(id);


    }

    public List<Book> getAllBooks() {
        return BookDao.getAllBooks();
    }
}
