package com.coderaviverma.springtestDummy.spring.service;

import com.coderaviverma.springtestDummy.spring.repo.Book;
import com.coderaviverma.springtestDummy.spring.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book createBook(Book book);
    Optional<Book> getBook(Long id);
}