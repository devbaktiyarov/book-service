package com.arsenbaktiyarov.microservices.bookservice.repository

import com.arsenbaktiyarov.microservices.bookservice.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<Book, Long> {
    fun deleteBookById(id: Long): Book
    fun findBookByIsbn(isbn: String): Book
}