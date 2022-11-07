package com.hzh.service;

import com.hzh.config.SpringCongfig;
import com.hzh.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringCongfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }
    @Test
    public void testGetALL(){
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }


}
