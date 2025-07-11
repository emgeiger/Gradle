# Gradle Boilerplate Project

A comprehensive Gradle boilerplate template for Java/Kotlin projects with modern development practices, testing, and CI/CD integration.

## 🚀 Features

- **Modern Gradle Setup**: Kotlin DSL configuration with Gradle 8.5
- **Java 17+ Support**: Compatible with Java 17 and 21
- **Kotlin Integration**: Ready for mixed Java/Kotlin projects
- **Testing Framework**: JUnit 5, AssertJ, and Mockito
- **Code Quality**: Checkstyle, PMD, SpotBugs integration
- **Code Coverage**: JaCoCo for test coverage reporting
- **CI/CD Pipeline**: GitHub Actions workflow
- **Multi-platform Testing**: Tests on Ubuntu, Windows, and macOS
- **Dependency Management**: Centralized dependency configuration
- **Documentation**: Comprehensive README and inline documentation

## 📁 Project Structure

```
├── .github/
│   ├── workflows/
│   │   └── ci.yml                    # GitHub Actions CI/CD pipeline
│   └── copilot-instructions.md       # GitHub Copilot configuration
├── config/
│   ├── checkstyle/
│   │   └── checkstyle.xml           # Checkstyle configuration
│   ├── pmd/
│   │   └── ruleset.xml              # PMD rules
│   └── spotbugs/
│       └── exclude.xml              # SpotBugs exclusions
├── gradle/
│   └── wrapper/                     # Gradle wrapper files
├── src/
│   ├── main/java/                   # Main source code
│   └── test/java/                   # Test source code
├── build.gradle.kts                 # Gradle build script
├── gradlew                          # Gradle wrapper (Unix)
├── gradlew.bat                      # Gradle wrapper (Windows)
└── settings.gradle.kts              # Gradle settings
```

## 🛠️ Prerequisites

- Java 17 or higher
- Git

## � Corporate Network Setup

**Important**: If you're working in a corporate environment with SSL inspection or proxies, you may encounter SSL certificate errors when first running Gradle. This is because the Gradle wrapper needs to download Gradle itself before it can read the `gradle.properties` configuration.

### Quick Fix for Corporate Networks

1. **Run the setup script**:

   ```bash
   # PowerShell (recommended)
   .\setup-corporate-network.ps1
   
   # Or Command Prompt
   setup-corporate-network.bat
   ```

2. **Manual alternative**: Download Gradle manually from <https://services.gradle.org/distributions/gradle-8.5-bin.zip> and extract to the project directory.

3. **Complete guide**: See [CORPORATE-NETWORK-GUIDE.md](CORPORATE-NETWORK-GUIDE.md) for detailed troubleshooting.

### Configuration Files

- **gradle.properties**: Pre-configured with corporate network settings
- **setup-corporate-network.ps1**: Automated setup script
- **CORPORATE-NETWORK-GUIDE.md**: Comprehensive troubleshooting guide

## 🚦 Quick Start

### For Standard Networks

1. **Use this template**: Click "Use this template" button on GitHub or clone the repository
2. **Update project details**: Modify package names, project name, and description
3. **Run tests**: `./gradlew test`
4. **Build project**: `./gradlew build`

### For Corporate Networks

1. **Follow corporate setup**: See section above for SSL/proxy configuration
2. **Run setup script**: `.\setup-corporate-network.ps1`
3. **Update project details**: Same as standard networks
4. **Build and test**: Use provided scripts or manual Gradle download

## 📝 Available Gradle Tasks

### Build Tasks

- `./gradlew build` - Build the entire project
- `./gradlew cleanBuild` - Clean and build the project
- `./gradlew run` - Run the main application

### Testing Tasks

- `./gradlew test` - Run all tests
- `./gradlew jacocoTestReport` - Generate test coverage report
- `./gradlew jacocoTestCoverageVerification` - Verify coverage meets threshold

### Code Quality Tasks

- `./gradlew codeQuality` - Run all code quality checks
- `./gradlew checkstyleMain` - Run Checkstyle on main sources
- `./gradlew pmdMain` - Run PMD on main sources
- `./gradlew spotbugsMain` - Run SpotBugs on main sources

## 🧪 Testing

The project uses JUnit 5 as the testing framework with:

- **AssertJ** for fluent assertions
- **Mockito** for mocking dependencies
- **Test coverage** reporting with JaCoCo

Example test structure:

```java
@Test
@DisplayName("Should return greeting message")
void shouldReturnGreetingMessage() {
    // Given
    App app = new App();
    
    // When
    String greeting = app.getGreeting();
    
    // Then
    assertThat(greeting).isEqualTo("Hello World!");
}
```

## 🔍 Code Quality

The project includes comprehensive code quality tools:

- **Checkstyle**: Enforces Google Java Style Guide
- **PMD**: Static analysis for potential issues
- **SpotBugs**: Bug pattern detection
- **JaCoCo**: Code coverage analysis (80% minimum coverage)

Run all quality checks:

```bash
./gradlew codeQuality
```

## 🔄 CI/CD Pipeline

The GitHub Actions workflow includes:

- **Multi-platform testing** (Ubuntu, Windows, macOS)
- **Multi-Java version testing** (Java 17, 21)
- **Code quality checks**
- **Test coverage reporting**
- **Dependency vulnerability scanning**
- **Build artifact generation**

## 📦 Dependencies

Key dependencies included:

- **Testing**: JUnit 5, AssertJ, Mockito
- **Logging**: SLF4J with Logback
- **Utilities**: Apache Commons Lang, Google Guava
- **Kotlin**: Standard library (for mixed projects)

## 🔧 Customization

### Adding Dependencies

Add new dependencies in `build.gradle.kts`:

```kotlin
dependencies {
    implementation("group:artifact:version")
    testImplementation("test-group:test-artifact:version")
}
```

### Modifying Package Structure

1. Update package names in `build.gradle.kts`
2. Move source files to new package structure
3. Update imports and references

### Configuring Code Quality

- **Checkstyle**: Edit `config/checkstyle/checkstyle.xml`
- **PMD**: Edit `config/pmd/ruleset.xml`
- **SpotBugs**: Edit `config/spotbugs/exclude.xml`

## 📋 Template Checklist

When using this template, update:

- [ ] Project name in `settings.gradle.kts`
- [ ] Package names in source files
- [ ] Main class name and package in `build.gradle.kts`
- [ ] Repository name and description in this README
- [ ] License information (if applicable)
- [ ] Author information in source files

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Run tests and quality checks
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🔗 Related Resources

- [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html)
- [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- [AssertJ Documentation](https://assertj.github.io/doc/)
- [Mockito Documentation](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)
