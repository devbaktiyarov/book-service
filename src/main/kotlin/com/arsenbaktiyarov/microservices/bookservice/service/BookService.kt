package com.arsenbaktiyarov.microservices.bookservice.service

import com.arsenbaktiyarov.microservices.bookservice.model.Book
import com.arsenbaktiyarov.microservices.bookservice.repository.BookRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService(val repo: BookRepository) {


    fun addBook(book: Book): Book = repo.save(book)

    fun getAllBooks(): List<Book> = repo.findAll()

    fun findById(id: Long): Book {
        val book: Optional<Book> = repo.findById(id)
        if (book.isPresent) {
            return book.get()
        }
        return Book()
    }

    fun deleteBookById(id: Long): Book {
        return repo.deleteBookById(id)
    }
}