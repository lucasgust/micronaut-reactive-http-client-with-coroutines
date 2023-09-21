package example.micronaut;

@io.micronaut.http.client.annotation.Client(id = "github")
@io.micronaut.http.annotation.Headers(value = {@io.micronaut.http.annotation.Header(value = "Micronaut HTTP Client", name = "User-Agent"), @io.micronaut.http.annotation.Header(value = "application/vnd.github.v3+json, application/json", name = "Accept")})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lexample/micronaut/GithubApiClient;", "", "fetchReleases", "Lorg/reactivestreams/Publisher;", "", "Lexample/micronaut/model/GithubRelease;", "github"})
public abstract interface GithubApiClient {
    
    @io.micronaut.http.annotation.Get(value = "/repos/${github.organization}/${github.repo}/releases")
    @io.micronaut.core.async.annotation.SingleResult
    @org.jetbrains.annotations.NotNull
    public abstract org.reactivestreams.Publisher<java.util.List<example.micronaut.model.GithubRelease>> fetchReleases();
}