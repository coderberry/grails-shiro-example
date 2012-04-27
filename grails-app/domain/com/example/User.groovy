package com.example

class User {
    String username
    String passwordHash
    
    static hasMany = [ roles: Role, permissions: String ]

    static constraints = {
        username(nullable: false, blank: false, unique: true)
    }
}
