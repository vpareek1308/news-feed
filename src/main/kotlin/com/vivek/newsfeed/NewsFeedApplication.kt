package com.vivek.newsfeed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NewsFeedApplication

fun main(args: Array<String>) {
	runApplication<NewsFeedApplication>(*args)
}
