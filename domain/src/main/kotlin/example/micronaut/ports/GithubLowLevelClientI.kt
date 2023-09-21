package example.micronaut.ports

import example.micronaut.model.GithubRelease

interface GithubPort {
    suspend fun fetchReleases(): List<GithubRelease>
}