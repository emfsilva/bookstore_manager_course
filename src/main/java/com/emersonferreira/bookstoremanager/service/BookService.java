package com.emersonferreira.bookstoremanager.service;

import com.emersonferreira.bookstoremanager.dto.MessageResponseDTO;
import com.emersonferreira.bookstoremanager.entity.Book;
import com.emersonferreira.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO created(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId()).build();
    }
}
