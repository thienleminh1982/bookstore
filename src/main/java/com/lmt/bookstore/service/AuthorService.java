package com.lmt.bookstore.service;

import com.lmt.bookstore.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing Author.
 */
public interface AuthorService {

    /**
     * Save a author.
     * @return the persisted entity
     */
    public Author save(Author author);

    /**
     *  get all the authors.
     *  @return the list of entities
     */
    public Page<Author> findAll(Pageable pageable);

    /**
     *  get the "id" author.
     *  @return the entity
     */
    public Author findOne(Long id);

    /**
     *  delete the "id" author.
     */
    public void delete(Long id);
}
