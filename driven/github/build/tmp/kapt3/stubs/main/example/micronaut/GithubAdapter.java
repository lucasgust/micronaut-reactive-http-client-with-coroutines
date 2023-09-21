package example.micronaut;

@jakarta.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lexample/micronaut/GithubAdapter;", "Lexample/micronaut/ports/GithubPort;", "client", "Lexample/micronaut/GithubApiClient;", "(Lexample/micronaut/GithubApiClient;)V", "fetchReleases", "", "Lexample/micronaut/model/GithubRelease;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "github"})
public final class GithubAdapter implements example.micronaut.ports.GithubPort {
    @org.jetbrains.annotations.NotNull
    private final example.micronaut.GithubApiClient client = null;
    
    public GithubAdapter(@org.jetbrains.annotations.NotNull
    example.micronaut.GithubApiClient client) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object fetchReleases(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<example.micronaut.model.GithubRelease>> $completion) {
        return null;
    }
}