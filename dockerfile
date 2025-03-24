# 1. OpenJDK 17 slim 이미지를 베이스로 사용
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. Maven 빌드 후 생성된 JAR 파일을 컨테이너에 복사
COPY target/*.jar app.jar

# 4. 컨테이너에서 노출할 포트 (Spring Boot 기본 포트)
EXPOSE 8080

# 5. 컨테이너 시작 시 JAR 파일 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
