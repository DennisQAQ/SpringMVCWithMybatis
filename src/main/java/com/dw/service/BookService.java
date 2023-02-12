package com.dw.service;

import com.dw.entities.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务管理
public interface BookService {
    /**
     * 增加书籍入库
     * @param book
     * @return
     */
    boolean saveBook(Book book);

    /**
     * 删除书籍
     * @param book
     * @return
     */
    boolean deleteBook(Integer id);

    /**
     * 修改书籍
     * @param book
     * @return
     */
    boolean updateBook(Book book);

    /**
     * 根据id获取书籍
     * @param id
     * @return
     */
    Book  getBooksById(Integer id);

    /**
     * 一次获取所有书籍
     * @return
     */
    List<Book> getAllBooks();

}
