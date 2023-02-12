package com.dw.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.dw.entities.Book;
import java.util.List;


public interface BookDao {

    @Insert("insert into book (bookName, type, author, description) values(#{bookName},#{type},#{author},#{description}) ")
    int save(Book book);

    @Delete("delete from book where id =#{id}")
    int  delete(Integer id);

    @Update("update book set bookName=#{bookName},type=#{type},author=#{author},description=#{description} where id = #{id}")
    int update(Book book);

    @Select("select * from book where id =#{id}")
    Book  getBooksById(Integer id);

    @Select("select * from book ")
    List<Book> getAllBooks();

}
