import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

/**
 * Created by Kane on 2022/02/23.
 */
fun String.utf8(): String = URLEncoder.encode(this, "UTF-8")

fun main() {
    val params = mapOf("name" to "John Doe", "occupation" to "gardener")
    val urlParams = params.map {(k, v) -> "${(k.utf8())}=${v.utf8()}"}
        .joinToString("&")

    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://httpbin.org/get?${urlParams}"))
        .build();

    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())
}