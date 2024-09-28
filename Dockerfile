# Use a imagem oficial do Maven com JDK 21
FROM maven:3.9.4-eclipse-temurin-21

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo pom.xml para o diretório de trabalho
COPY pom.xml /app/

# Copie o diretório de testes (src/test/java) para o container
COPY src/test/java /app/src/test/java

COPY src /app/src

# Compile o projeto e rode os testes
RUN mvn clean install

# Comando padrão para rodar os testes
CMD ["mvn", "test"]
