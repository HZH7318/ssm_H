package com.hzh.service.impl;

import com.hzh.dao.BookDao;
import com.hzh.domain.Book;
import com.hzh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        int count = bookDao.save(book);

        return count > 0;
    }

    @Override
    public boolean update(Book book) {
        int count = bookDao.update(book);
        return count > 0;
    }

    @Override
    public boolean delete(Integer id) {
        int count = bookDao.delete(id);
        return count > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
