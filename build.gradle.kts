plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    
    // Apply the Java plugin for Java development
    java
    
    // Apply Kotlin plugin for mixed Java/Kotlin projects (optional)
    kotlin("jvm") version "1.9.22"
    
    // Code quality plugins
    id("com.github.spotbugs") version "6.0.8"
    id("checkstyle")
    id("pmd")
    
    // Test reporting
    id("jacoco")
}

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    
    // Mockito for mocking in tests
    testImplementation("org.mockito:mockito-core:5.8.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.8.0")
    
    // AssertJ for fluent assertions
    testImplementation("org.assertj:assertj-core:3.25.1")
    
    // Kotlin standard library (if using Kotlin)
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    
    // Common utilities
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("com.google.guava:guava:32.1.3-jre")
    
    // Logging
    implementation("ch.qos.logback:logback-classic:1.4.14")
    implementation("org.slf4j:slf4j-api:2.0.10")
}

// Apply a specific Java toolchain to ease working on different environments
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

kotlin {
    jvmToolchain(21)
}

application {
    // Define the main class for the application
    mainClass.set("com.example.gradle.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests
    useJUnitPlatform()
    
    // Enable test result logging
    testLogging {
        events("passed", "skipped", "failed")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        showStandardStreams = false
    }
    
    // Generate test report
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        html.required.set(true)
        csv.required.set(false)
    }
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = "0.80".toBigDecimal()
            }
        }
    }
}

// Checkstyle configuration
checkstyle {
    toolVersion = "10.12.7"
    configFile = file("config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false
}

// PMD configuration
pmd {
    toolVersion = "7.0.0"
    isConsoleOutput = true
    ruleSetFiles = files("config/pmd/ruleset.xml")
    ruleSets = listOf() // Clear default rule sets
}

// SpotBugs configuration
spotbugs {
    toolVersion = "4.8.3"
    effort = com.github.spotbugs.snom.Effort.MAX
    reportLevel = com.github.spotbugs.snom.Confidence.LOW
    excludeFilter = file("config/spotbugs/exclude.xml")
}

tasks.spotbugsMain {
    reports.create("html") {
        required.set(true)
        outputLocation.set(file("build/reports/spotbugs/main.html"))
    }
}

tasks.spotbugsTest {
    reports.create("html") {
        required.set(true)
        outputLocation.set(file("build/reports/spotbugs/test.html"))
    }
}

// Custom tasks
tasks.register("codeQuality") {
    group = "verification"
    description = "Runs all code quality checks"
    dependsOn("checkstyleMain", "pmdMain", "spotbugsMain", "test", "jacocoTestCoverageVerification")
}

tasks.register("cleanBuild") {
    group = "build"
    description = "Clean and build the project"
    dependsOn("clean", "build")
}
