package com.lmt.bookstore.service;

import com.lmt.bookstore.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing Book.
 */
public interface BookService {

    /**
     * Save a book.
     * @return the persisted entity
     */
    public Book save(Book book);

    /**
     *  get all the books.
     *  @return the list of entities
     */
    public Page<Book> findAll(Pageable pageable);

    /**
     *  get the "id" book.
     *  @return the entity
     */
    public Book findOne(Long id);

    /**
     *  delete the "id" book.
     */
    public void delete(Long id);
}
