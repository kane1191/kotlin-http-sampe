import com.github.kittinunf.fuel.httpGet

/**
 * Created by Kane on 2022/02/23.
 */
fun main() {

    val (_, _, result) = "http://webcode.me".httpGet().responseString()
    println(result)
}