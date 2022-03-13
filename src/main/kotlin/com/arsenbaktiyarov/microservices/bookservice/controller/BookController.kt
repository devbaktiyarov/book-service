package com.arsenbaktiyarov.microservices.bookservice.controller

import com.arsenbaktiyarov.microservices.bookservice.model.Book
import com.arsenbaktiyarov.microservices.bookservice.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("book")
class BookController(val service: BookService) {

    @PostMapping
    fun addBook(@RequestBody book: Book): Book = service.addBook(book)

    @GetMapping
    fun getAllBooks(): List<Book> = service.getAllBooks()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Book = service.findById(id)


}