# 🚀 Setup Guide

This guide will help you set up your new project from this Gradle boilerplate template.

## Prerequisites

Before you begin, ensure you have:

- ☑️ **Java 17 or higher** installed ([Download OpenJDK](https://adoptium.net/))
- ☑️ **Git** installed
- ☑️ **VS Code** with Java extensions (recommended)

## Quick Start

### 1. Create Project from Template

1. Click **"Use this template"** button on GitHub
2. Choose **"Create a new repository"**
3. Fill in your repository details
4. Clone your new repository

### 2. Customize Your Project

#### Update Project Information

```bash
# Open the project in VS Code
code your-project-name

# Or navigate to the project directory
cd your-project-name
```

#### Essential Files to Modify

1. **settings.gradle.kts** - Change project name:

   ```kotlin
   rootProject.name = "your-project-name"
   ```

2. **Package Structure** - Rename package from `com.example.gradle`:
   - Update package declarations in all `.java` files
   - Move files to new package directory structure
   - Update imports accordingly

3. **build.gradle.kts** - Update main class reference:

   ```kotlin
   application {
       mainClass.set("com.yourcompany.yourproject.App")
   }
   ```

4. **README.md** - Replace with your project information

### 3. Build and Test

```bash
# On Windows
.\gradlew.bat build

# On Unix/macOS
./gradlew build
```

If you encounter SSL certificate issues (common in corporate environments), you may need to:

- Configure proxy settings
- Import certificates
- Use `--insecure` flag temporarily

### 4. Verify Setup

Run the included tests:

```bash
.\gradlew.bat test    # Windows
./gradlew test        # Unix/macOS
```

Run the application:

```bash
.\gradlew.bat run     # Windows  
./gradlew run         # Unix/macOS
```

## VS Code Integration

### Recommended Extensions

The following extensions will be automatically suggested:

- Extension Pack for Java
- Gradle for Java

### Available Tasks

Press `Ctrl+Shift+P` and type "Tasks: Run Task" to see:

- **Gradle: Build** - Build the project
- **Gradle: Test** - Run tests
- **Gradle: Run** - Run the application
- **Gradle: Code Quality** - Run code quality checks
- **Gradle: Test Coverage** - Generate coverage reports

## Project Structure Explained

```
your-project/
├── .github/                    # GitHub configuration
│   ├── workflows/ci.yml       # CI/CD pipeline
│   └── copilot-instructions.md # Copilot setup
├── .vscode/                   # VS Code configuration
│   └── tasks.json            # Build tasks
├── config/                   # Code quality configurations
│   ├── checkstyle/          # Checkstyle rules
│   ├── pmd/                 # PMD rules
│   └── spotbugs/            # SpotBugs exclusions
├── gradle/                  # Gradle wrapper
├── src/
│   ├── main/java/          # Application source code
│   ├── test/java/          # Test source code
│   └── main/resources/     # Resources (configs, etc.)
├── build.gradle.kts        # Gradle build script
├── settings.gradle.kts     # Gradle settings
└── README.md              # This file
```

## Customization Options

### Adding Dependencies

Edit `build.gradle.kts`:

```kotlin
dependencies {
    implementation("group:artifact:version")
    testImplementation("test-group:test-artifact:version")
}
```

### Code Quality Configuration

- **Checkstyle**: Edit `config/checkstyle/checkstyle.xml`
- **PMD**: Edit `config/pmd/ruleset.xml`
- **SpotBugs**: Edit `config/spotbugs/exclude.xml`

### CI/CD Pipeline

The GitHub Actions workflow (`.github/workflows/ci.yml`) runs:

- Tests on multiple platforms (Ubuntu, Windows, macOS)
- Code quality checks
- Build verification
- Test coverage reporting

## Common Issues

### SSL Certificate Problems

In corporate environments, you might see SSL errors. Solutions:

1. Configure proxy in `gradle.properties`
2. Import corporate certificates
3. Use `--insecure` flag (not recommended for production)

### Java Version Issues

Ensure Java 17+ is installed and set as default:

```bash
java -version    # Should show version 17 or higher
```

### Permission Issues (Unix/macOS)

Make Gradle wrapper executable:

```bash
chmod +x gradlew
```

## Getting Help

- 📖 [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html)
- 🧪 [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- 🔍 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- 💬 [Stack Overflow](https://stackoverflow.com/questions/tagged/gradle)

## Next Steps

1. ✅ Build successfully compiles
2. ✅ Tests pass
3. ✅ Customize package names and project details
4. ✅ Add your business logic
5. ✅ Write comprehensive tests
6. ✅ Configure any additional tools you need
7. ✅ Set up your development workflow
8. ✅ Deploy using the included CI/CD pipeline

Happy coding! 🎉
