package example.micronaut

import io.micronaut.context.annotation.Requires
import io.micronaut.http.MutableHttpRequest
import io.micronaut.http.annotation.ClientFilter
import io.micronaut.http.annotation.RequestFilter

@ClientFilter("/repos/**")
@Requires(condition = GithubFilterCondition::class)
class GithubFilter(private val configuration: GithubConfiguration) {

    @RequestFilter
    fun doFilter(request: MutableHttpRequest<*>) {
        request.basicAuth(configuration.username, configuration.token)
    }
}
