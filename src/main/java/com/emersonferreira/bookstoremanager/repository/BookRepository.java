package com.emersonferreira.bookstoremanager.repository;

import com.emersonferreira.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
