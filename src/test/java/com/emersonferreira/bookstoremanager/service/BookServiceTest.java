package com.emersonferreira.bookstoremanager.service;

import com.emersonferreira.bookstoremanager.dto.BookDTO;
import com.emersonferreira.bookstoremanager.entity.Book;
import com.emersonferreira.bookstoremanager.exception.BookNotFoundException;
import com.emersonferreira.bookstoremanager.repository.BookRepository;
import com.emersonferreira.bookstoremanager.utils.BookUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void whenGivenExisteingIdThenReturnThisBook() throws BookNotFoundException {
        Book expectedFoundBook = BookUtils.createFakeBook();

        when(bookRepository.findById(expectedFoundBook.getId())).thenReturn(Optional.of(expectedFoundBook));

        BookDTO bookDTO = bookService.findById(expectedFoundBook.getId());

        assertEquals(expectedFoundBook.getName(), bookDTO.getName());
        assertEquals(expectedFoundBook.getIsbn(),bookDTO.getIsbn());
        assertEquals(expectedFoundBook.getPublisherName(),bookDTO.getPublisherName());
    }

    @Test
    void whenGivenUnexistingIdThenNotFindThrowAnException() {
        var invalidId = 10L;

        when(bookRepository.findById(invalidId))
                .thenReturn(Optional.ofNullable(any(Book.class)));

        assertThrows(BookNotFoundException.class, () -> bookService.findById(invalidId));
    }
}
