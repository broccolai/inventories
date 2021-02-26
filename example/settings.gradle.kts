rootProject.name = "example"

use("core", "bukkit")

fun use(vararg names: String) {
    for (name in names) {
        include(name)
        project(":$name").name = "${rootProject.name}-$name"
    }
}