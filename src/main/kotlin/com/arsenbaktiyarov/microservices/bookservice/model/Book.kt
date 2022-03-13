package com.arsenbaktiyarov.microservices.bookservice.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Book(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    var isbn: String,
    var title: String
) {
    constructor() : this(0, "", "")
}