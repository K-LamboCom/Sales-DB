# --- Stage 1: Build ứng dụng ---
FROM gradle:8.5.0-jdk21 AS builder

WORKDIR /app

COPY . .

# Dùng wrapper nếu có để đảm bảo version cụ thể
RUN chmod +x ./gradlew && ./gradlew clean build -x test --no-daemon

# --- Stage 2: Chỉ copy file JAR ra ---
FROM alpine:latest

WORKDIR /output

# Copy file JAR từ stage build
COPY --from=builder /app/build/libs/*.jar .

# In thông báo rồi dừng
CMD ["echo", "Build complete. Output is in /output"]