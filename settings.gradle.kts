rootProject.name = "default"

include(
    "main",
    "domain"
)

// DRIVER
include(
    "http"
)
project(":http").projectDir = file("driver/http")

// DRIVEN
include(
    "github"
)
project(":github").projectDir = file("driven/github")