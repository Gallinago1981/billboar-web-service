package example.kotlin.billboardapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BillboardApiApplication

fun main(args: Array<String>) {
    runApplication<BillboardApiApplication>(*args)
}
