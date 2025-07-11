@echo off
REM Corporate Network Gradle Wrapper Script
REM This script sets SSL bypass environment variables before running Gradle

echo Setting up corporate network environment variables...

REM Set JAVA_HOME to Microsoft JDK 21
set JAVA_HOME=C:\Program Files\Microsoft\jdk-21.0.7.6-hotspot
set PATH=%JAVA_HOME%\bin;%PATH%

REM SSL Bypass for corporate networks (TEMPORARY WORKAROUND)
set JAVA_OPTS=-Djavax.net.ssl.trustStore=NONE -Djavax.net.ssl.trustStoreType=Windows-ROOT -Dcom.sun.net.ssl.checkRevocation=false -Dtrust_all_cert=true -Djavax.net.ssl.trustStorePassword= -Djava.net.useSystemProxies=true -Dcom.sun.net.ssl.enableECC=false -Dsun.security.ssl.allowUnsafeRenegotiation=true -Dsun.security.ssl.allowLegacyHelloMessages=true

REM Additional Gradle options
set GRADLE_OPTS=-Dorg.gradle.daemon=true -Dorg.gradle.parallel=true

REM Network timeouts
set JAVA_OPTS=%JAVA_OPTS% -Dsun.net.client.defaultConnectTimeout=60000 -Dsun.net.client.defaultReadTimeout=60000

echo Using Java: %JAVA_HOME%
echo Environment variables set. Running Gradle...
echo.

REM Run Gradle with the provided arguments
.\gradlew.bat %*

echo.
echo Gradle execution completed.
