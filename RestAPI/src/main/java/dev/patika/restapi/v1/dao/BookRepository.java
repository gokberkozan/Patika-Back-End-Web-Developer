package dev.patika.restapi.v1.dao;

import dev.patika.restapi.v1.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
