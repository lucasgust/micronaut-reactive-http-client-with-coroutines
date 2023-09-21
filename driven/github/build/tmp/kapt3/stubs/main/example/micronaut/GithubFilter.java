package example.micronaut;

@io.micronaut.http.annotation.ClientFilter(value = {"/repos/**"})
@io.micronaut.context.annotation.Requires(condition = example.micronaut.GithubFilterCondition.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lexample/micronaut/GithubFilter;", "", "configuration", "Lexample/micronaut/GithubConfiguration;", "(Lexample/micronaut/GithubConfiguration;)V", "doFilter", "", "request", "Lio/micronaut/http/MutableHttpRequest;", "github"})
public final class GithubFilter {
    @org.jetbrains.annotations.NotNull
    private final example.micronaut.GithubConfiguration configuration = null;
    
    public GithubFilter(@org.jetbrains.annotations.NotNull
    example.micronaut.GithubConfiguration configuration) {
        super();
    }
    
    @io.micronaut.http.annotation.RequestFilter
    public final void doFilter(@org.jetbrains.annotations.NotNull
    io.micronaut.http.MutableHttpRequest<?> request) {
    }
}