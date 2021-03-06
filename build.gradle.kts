import net.kyori.indra.IndraCheckstylePlugin
import net.kyori.indra.IndraPublishingPlugin
import net.kyori.indra.IndraPlugin
import net.kyori.indra.sonatypeSnapshots

plugins {
    id("net.kyori.indra") version "1.3.1"
    id("net.kyori.indra.checkstyle") version "1.3.1"
    id("net.kyori.indra.publishing") version "1.3.1"
}

group = "broccolai"
version = "1.0-SNAPSHOT"

subprojects {
    apply<IndraPlugin>()
    apply<IndraCheckstylePlugin>()
    apply<IndraPublishingPlugin>()

    repositories {
        mavenCentral()
        sonatypeSnapshots()
        maven("https://papermc.io/repo/repository/maven-public/")
    }

    dependencies {
        compileOnlyApi("org.checkerframework", "checker-qual", "3.10.0")
    }

    indra {
        javaVersions {
            target.set(8)
        }
    }
}
