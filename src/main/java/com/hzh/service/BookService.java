package com.hzh.service;

import com.hzh.domain.Book;

import java.util.List;

public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 按照id查询
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getAll();

}
