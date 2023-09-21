package example.micronaut

import example.micronaut.model.GithubRelease
import example.micronaut.ports.GithubPort
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/github")
class GithubController(
    private val githubPort: GithubPort
) {

    @Get("/releases")
    @SingleResult
    suspend fun fetchReleases(): List<GithubRelease> {
        return githubPort.fetchReleases()
    }
}