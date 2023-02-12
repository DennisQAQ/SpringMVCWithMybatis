package com.dw.controller;

import com.dw.config.Code;
import com.dw.config.Result;

import com.dw.entities.Book;
import com.dw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService BookService;

    @PostMapping
    public Result saveBook(@RequestBody Book book) {
       boolean flag= BookService.saveBook(book);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);

    }

    @DeleteMapping("/{id}")
    public Result deleteBook(@PathVariable Integer id) {
        boolean flag= BookService.deleteBook(id);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @PutMapping
    public Result updateBook(@RequestBody Book book) {
        boolean flag= BookService.updateBook(book);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getBooksById(@PathVariable Integer id) {
        Book book = BookService.getBooksById(id);
        Integer code = book !=null?Code.GET_OK:Code.GET_ERR;
        String msg = book !=null?"":"something wrong！please try it again！";
        return new Result(code,book,msg);

    }

    @GetMapping
    public Result getAllBooks() {
        List<Book> book = BookService.getAllBooks();
        Integer code = book != null?Code.GET_OK:Code.GET_ERR;
        String msg = book != null ? "":"something wrong！please try it again！";
        return new Result(code,book,msg);
    }

}
