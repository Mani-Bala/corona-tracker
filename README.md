# corona-tracker
This services provides corona status
###### ![Latest version](https://img.shields.io/badge/Version-1.0-green.svg)

### Major dependencies and version
[![Java-11](https://img.shields.io/badge/OpenJDK-11-blue.svg)](https://openjdk.java.net/projects/jdk/11/)
![Spring boot-2.2.0](https://img.shields.io/badge/SpringBoot-2.2.0-blue.svg)
![Gradle-6.2](https://img.shields.io/badge/Gradle-6.2-blue.svg)
![Docker](https://img.shields.io/badge/Docker-latest-blue.svg)

### Steps for deployment
1. **Execute Application Properties**
<br/> For Windows systems - [environmentInitialize.sh](environmentInitialize.sh)
<br/> For Unix systems - [environmentInitialize.bat](environmentInitialize.bat)

2. **Generate JAR file**
<br/> `./gradlew build`

3. **Build Docker image**
<br/> `docker build -t corona .`

4. **Run Docker image**
<br/> `docker run -p 7777:7777 corona`
