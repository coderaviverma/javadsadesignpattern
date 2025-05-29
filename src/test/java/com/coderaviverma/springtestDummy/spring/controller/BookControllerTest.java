package com.coderaviverma.springtestDummy.spring.controller;


import com.coderaviverma.springtestDummy.spring.repo.Book;
import com.coderaviverma.springtestDummy.spring.repo.BookRepository;
import com.coderaviverma.springtestDummy.spring.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@WebMvcTest(BookController.class)
@AutoConfigureMockMvc
public class BookControllerTest {


    @Autowired
    MockMvc mockMvc;

    @MockBean
    BookRepository bookRepository;

    @MockBean
    BookService bookService;

    List<Book> books=new ArrayList<>();

    @BeforeEach
    void setUpData(){
        books=List.of(new Book(1L,"book1","author1"),
                new Book(2L,"book2","author2"),
                new Book(3L,"book3","author3"),
                new Book(4L,"book4","author4"),
                new Book(5L,"book5","author5"));
    }


    @Test
    @Disabled
    void shouldFindAllBooks() throws Exception {

        when(bookRepository.findAll()).thenReturn(books);

        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(content().json(books.toString()));
    }

}
