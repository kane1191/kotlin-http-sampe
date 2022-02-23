import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

/**
 * Created by Kane on 2022/02/23.
 */
fun main() {
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("http://webcode.me"))
        .build();

    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())
}