package com.example

class HomeController {

    def index() {
        render "This page is not secured"
    }

    def secured() {
        render "This page requires a user to be logged in"
    }

    def admin() {
        render "This page requires the logged in user to be an administrator"
    }

}
