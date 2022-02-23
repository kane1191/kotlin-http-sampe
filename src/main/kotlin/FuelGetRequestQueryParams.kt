import com.github.kittinunf.fuel.httpGet

/**
 * Created by Kane on 2022/02/23.
 */
fun main() {

    val (_, _, result) = "http://httpbin.org/get"
        .httpGet(listOf("name" to "John Doe", "occupation" to "gardener"))
        .responseString()
    println(result)
}