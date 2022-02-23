import com.github.kittinunf.fuel.httpPost

/**
 * Created by Kane on 2022/02/23.
 */
fun main() {

    val (_, _, result) = "https://httpbin.org/post"
        .httpPost(listOf("name" to "John Doe", "occupation" to "gardener"))
        .responseString()
    println(result)
}