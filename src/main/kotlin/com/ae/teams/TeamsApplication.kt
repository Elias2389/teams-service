package com.ae.teams

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient

//@EnableDiscoveryClient
@SpringBootApplication

class TeamsApplication

fun main(args: Array<String>) {
	runApplication<TeamsApplication>(*args)
}
