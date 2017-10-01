package com.futsalud.kotlin_angular

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
@ComponentScan
open class KaApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(KaApplication::class.java, *args)
        }
    }
}