# Gradle Boilerplate Template

## About This Template

This is a comprehensive Gradle boilerplate template for Java/Kotlin projects that includes:

- Modern Gradle setup with Kotlin DSL
- Testing framework (JUnit 5, AssertJ, Mockito)
- Code quality tools (Checkstyle, PMD, SpotBugs)
- GitHub Actions CI/CD pipeline
- VS Code integration

## Getting Started

1. **Use this template** by clicking "Use this template" button
2. **Clone your new repository**
3. **Update project information**:
   - Change `rootProject.name` in `settings.gradle.kts`
   - Update package names in source files
   - Modify `README.md` with your project details
4. **Build and test**: Run `./gradlew build`

## First Steps After Creating Your Project

- [ ] Update the project name in `settings.gradle.kts`
- [ ] Change package names from `com.example.gradle` to your package
- [ ] Update the main class name and package in `build.gradle.kts`
- [ ] Modify this README.md with your project-specific information
- [ ] Update the LICENSE file if needed
- [ ] Configure any additional dependencies you need

## Structure

- `src/main/java/` - Main source code
- `src/test/java/` - Test source code  
- `config/` - Code quality tool configurations
- `.github/workflows/` - GitHub Actions CI/CD
- `.github/copilot-instructions.md` - GitHub Copilot configuration

## Gradle Tasks

- `./gradlew build` - Build the project
- `./gradlew test` - Run tests
- `./gradlew run` - Run the application
- `./gradlew codeQuality` - Run all code quality checks

## Features

✅ Java 17+ support  
✅ Kotlin integration ready  
✅ JUnit 5 testing framework  
✅ Code quality tools configured  
✅ GitHub Actions CI/CD  
✅ VS Code tasks and settings  
✅ Comprehensive documentation  

Happy coding! 🚀
