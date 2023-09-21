package example.micronaut;

@io.micronaut.context.annotation.ConfigurationProperties(value = "github")
@io.micronaut.context.annotation.Requires(property = "github")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lexample/micronaut/GithubConfiguration;", "", "()V", "organization", "", "getOrganization", "()Ljava/lang/String;", "setOrganization", "(Ljava/lang/String;)V", "repo", "getRepo", "setRepo", "token", "getToken", "setToken", "username", "getUsername", "setUsername", "Companion", "github"})
public final class GithubConfiguration {
    @org.jetbrains.annotations.Nullable
    private java.lang.String organization;
    @org.jetbrains.annotations.Nullable
    private java.lang.String repo;
    @org.jetbrains.annotations.Nullable
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFIX = "github";
    @org.jetbrains.annotations.NotNull
    public static final example.micronaut.GithubConfiguration.Companion Companion = null;
    
    public GithubConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOrganization() {
        return null;
    }
    
    public final void setOrganization(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRepo() {
        return null;
    }
    
    public final void setRepo(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lexample/micronaut/GithubConfiguration$Companion;", "", "()V", "PREFIX", "", "github"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}