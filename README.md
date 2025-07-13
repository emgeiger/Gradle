# Gradle Boilerplate Project

A comprehensive Gradle boilerplate template for Java/Kotlin projects with modern development practices, testing, and CI/CD integration.

## 🚀 Features

- **Modern Gradle Setup**: Kotlin DSL configuration with Gradle 8.11.1
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

2. **Manual alternative**: Download Gradle manually from <https://services.gradle.org/distributions/gradle-8.11.1-all.zip> and extract to the project directory.

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

## 📋 Template Usage Guide

### Files to Keep (Template Infrastructure)

**Keep these files unchanged** - they provide the template's core functionality:

```text
📁 Configuration & Build
├── build.gradle.kts                 ✅ Keep (modify project details only)
├── settings.gradle.kts              ✅ Keep (update project name)
├── gradle.properties                ✅ Keep (corporate network settings)
├── gradlew / gradlew.bat            ✅ Keep (Gradle wrapper)
├── gradlew-corporate.*              ✅ Keep (corporate network scripts)
└── gradle/wrapper/                  ✅ Keep (Gradle wrapper files)

📁 Code Quality & CI/CD
├── .github/workflows/ci.yml         ✅ Keep (CI/CD pipeline)
├── .github/copilot-instructions.md  ✅ Keep (GitHub Copilot config)
├── config/checkstyle/               ✅ Keep (code quality rules)
├── config/pmd/                      ✅ Keep (static analysis)
├── config/spotbugs/                 ✅ Keep (bug detection)
└── .gitignore                       ✅ Keep (Git ignore rules)

📁 Documentation
├── CORPORATE-NETWORK-GUIDE.md       ✅ Keep (troubleshooting guide)
├── SETUP.md                         ✅ Keep (setup instructions)
├── setup-corporate-network.*        ✅ Keep (network setup scripts)
└── LICENSE                          ✅ Keep (or update for your license)
```

### Files to Customize (Your Project Content)

**Modify these files** to match your specific project:

```text
📁 Source Code - CUSTOMIZE
├── src/main/java/com/example/gradle/
│   └── App.java                     🔄 Replace with your main class
├── src/test/java/com/example/gradle/
│   └── AppTest.java                 🔄 Replace with your tests
└── src/main/resources/
    └── logback.xml                  🔄 Keep (modify logging config if needed)

📁 Documentation - CUSTOMIZE
├── README.md                        🔄 Update for your project
└── .github/template-repository.json 🔄 Update template metadata
```

### Files to Remove (Template-Specific)

**Delete these files** after creating your project from the template:

```text
📁 Template Cleanup - REMOVE
└── .github/template-cleanup/
    └── README.md                    ❌ Remove (template instructions only)
```

### Template Checklist

When using this template:

#### Step 1: Project Configuration

- [ ] Update project name in `settings.gradle.kts`
- [ ] Modify `build.gradle.kts` application details:
  - [ ] Change `application.mainClass` from `"com.example.gradle.App"`
  - [ ] Update group name from `"com.example"`
- [ ] Update repository name and description in this README

#### Step 2: Source Code

- [ ] Replace `src/main/java/com/example/gradle/` with your package structure
- [ ] Create your main application class (replace `App.java`)
- [ ] Replace example tests with your actual tests
- [ ] Update package imports throughout the codebase

#### Step 3: Documentation

- [ ] Customize this README for your project
- [ ] Update `SETUP.md` if you have specific setup requirements
- [ ] Modify `.github/template-repository.json` if creating another template
- [ ] Update author information and license if needed

#### Step 4: Template Cleanup

- [ ] Delete `.github/template-cleanup/` directory
- [ ] Remove template-specific sections from README
- [ ] Commit your customized project

#### Step 5: Corporate Network (if applicable)

- [ ] Test corporate network setup scripts work in your environment
- [ ] Verify `gradle.properties` settings match your network requirements
- [ ] Update `CORPORATE-NETWORK-GUIDE.md` with environment-specific details

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
