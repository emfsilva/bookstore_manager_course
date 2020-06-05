package com.emersonferreira.bookstoremanager.mapper;

import com.emersonferreira.bookstoremanager.dto.BookDTO;
import com.emersonferreira.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
