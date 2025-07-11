# GitHub Copilot Instructions

<!-- Use this file to provide workspace-specific custom instructions to Copilot. For more details, visit https://code.visualstudio.com/docs/copilot/copilot-customization#_use-a-githubcopilotinstructionsmd-file -->

This is a Gradle boilerplate project template designed for Java/Kotlin development. When working with this project, please consider the following guidelines:

## Project Structure
- This project uses Gradle with Kotlin DSL (`build.gradle.kts`)
- Main source code is in `src/main/java`
- Test code is in `src/test/java`
- Configuration files are in `config/` subdirectories

## Code Style and Quality
- Follow Google Java Style Guide conventions
- Use proper Javadoc comments for public APIs
- Maintain test coverage above 80%
- Code quality tools are configured: Checkstyle, PMD, SpotBugs

## Testing Guidelines
- Use JUnit 5 for unit testing
- Use AssertJ for fluent assertions
- Use Mockito for mocking
- Follow Given-When-Then structure in test methods
- Use `@DisplayName` annotations for descriptive test names

## Dependencies
- Prefer well-maintained, popular libraries
- Keep dependencies up to date
- Use dependency version catalogs when adding multiple related dependencies
- Document any special dependency requirements

## Build and CI/CD
- The project includes GitHub Actions workflows for CI/CD
- Gradle wrapper is included and should be used for builds
- Custom tasks are available: `codeQuality`, `cleanBuild`

## Best Practices
- Use meaningful variable and method names
- Keep methods focused and single-purpose
- Follow SOLID principles
- Use appropriate logging levels with SLF4J
- Handle exceptions appropriately
- Write self-documenting code with clear intent
