package com.kabarak.clearance.repository.library;

import com.kabarak.clearance.model.library.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
