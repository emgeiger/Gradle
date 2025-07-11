@echo off
REM Setup script for corporate network development environment
REM This script configures JAVA_HOME and validates the setup

echo ========================================
echo  Corporate Network Development Setup
echo ========================================
echo.

echo 1. Checking for Microsoft JDK 21...
if exist "C:\Program Files\Microsoft\jdk-21.0.7.6-hotspot\bin\java.exe" (
    echo    ✓ Microsoft JDK 21 found
    set JAVA_HOME=C:\Program Files\Microsoft\jdk-21.0.7.6-hotspot
    set PATH=%JAVA_HOME%\bin;%PATH%
) else (
    echo    ✗ Microsoft JDK 21 not found
    echo    Please install Microsoft OpenJDK 21 from:
    echo    https://docs.microsoft.com/en-us/java/openjdk/download
    pause
    exit /b 1
)
set GRADLE_OPTS=-Dtrust_all_cert=true -Dcom.sun.net.ssl.checkRevocation=false -Dsun.security.ssl.allowUnsafeRenegotiation=true -Djava.net.useSystemProxies=true

echo ✅ Environment variables set:
echo    JAVA_OPTS: %JAVA_OPTS%
echo    GRADLE_OPTS: %GRADLE_OPTS%
echo.

REM Check Java version
echo 🔍 Checking Java installation...
java -version 2>NUL
if errorlevel 1 (
    echo ❌ Java not found in PATH. Please install Java 17+ first.
    pause
    exit /b 1
) else (
    echo ✅ Java found
)
echo.

REM Method 1: Try with system proxy
echo 🌐 Method 1: Attempting build with system proxy settings...
gradlew.bat build --stacktrace
if errorlevel 1 (
    echo ❌ Method 1 failed. Manual Gradle download required.
    echo.
    echo 📋 Manual Steps Required:
    echo    1. Download Gradle 8.5 manually from:
    echo       https://services.gradle.org/distributions/gradle-8.5-bin.zip
    echo    2. Extract to a 'gradle-8.5' folder in this directory
    echo    3. Run: gradle-8.5\bin\gradle.bat build
    echo.
    echo 🔧 Alternative Solutions:
    echo    1. Contact IT for corporate certificates
    echo    2. Request proxy configuration
    echo    3. Ask for gradle.org domain whitelisting
    echo    4. Try building from a different network
    echo.
    pause
) else (
    echo ✅ Build successful!
)

pause
