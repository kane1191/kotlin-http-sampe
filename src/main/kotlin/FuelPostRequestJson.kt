import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.kittinunf.fuel.core.extensions.jsonBody
import com.github.kittinunf.fuel.httpPost

/**
 * Created by Kane on 2022/02/23.
 */
data class User(
    val name: String,
    val occupation: String
)

fun main() {
    val mapper = jacksonObjectMapper()
    val user = User("John Doe", "gardener")

    val (_, _, result) = "https://httpbin.org/post".httpPost()
        .jsonBody(mapper.writeValueAsString(user))
        .responseString()
    println(result)
}

