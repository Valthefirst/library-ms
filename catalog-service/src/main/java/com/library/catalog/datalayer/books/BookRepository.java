package com.library.catalog.datalayer.books;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer>{

    Book findByIsbn_Isbn(Long isbn);
    Book findByCatalogIdentifier_CatalogIdAndIsbn_Isbn(String catalogId, Long isbn);
    List<Book> findAllByCatalogIdentifier_CatalogId(String catalogueId);
}
