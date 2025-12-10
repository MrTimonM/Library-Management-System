package com.weekFive.WeekFiveDb.repository;

import com.weekFive.WeekFiveDb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    // custom method
    Optional<Book> findByIsbn(String isbn);
}
