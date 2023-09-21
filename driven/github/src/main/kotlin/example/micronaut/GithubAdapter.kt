package example.micronaut

import example.micronaut.model.GithubRelease
import example.micronaut.ports.GithubPort
import jakarta.inject.Singleton
import kotlinx.coroutines.reactive.awaitSingle

@Singleton
class GithubAdapter(private val client: GithubApiClient) : GithubPort {

    override suspend fun fetchReleases(): List<GithubRelease> {
        return client.fetchReleases().awaitSingle()
    }
}