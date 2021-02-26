import net.kyori.indra.IndraCheckstylePlugin
import net.kyori.indra.IndraPlugin
import net.kyori.indra.sonatypeSnapshots

plugins {
    id("net.kyori.indra") version "1.3.1"
    id("net.kyori.indra.checkstyle") version "1.3.1"
}

group = "broccolai"
version = "1.0-SNAPSHOT"

subprojects {
    apply<IndraPlugin>()
    apply<IndraCheckstylePlugin>()

    repositories {
        mavenLocal()
        mavenCentral()
        sonatypeSnapshots()
        maven("https://papermc.io/repo/repository/maven-public/")
    }

    indra {
        javaVersions {
            target.set(8)
        }
    }
}
