# 🚚 Cloud Delivery System

Production-ready Java REST API for managing delivery orders and driver assignments.

## 🚀 Features

- Java Spring Boot backend
- RESTful API: create, assign, track deliveries
- Dockerized for easy deployment
- CI/CD with GitHub Actions
- AWS-ready infrastructure (EC2, S3, etc.)

## 🔧 Stack

- Java 17, Spring Boot, Maven
- Docker
- GitHub Actions (CI/CD)
- AWS (planned)
- PostgreSQL or MongoDB (future)

## 📁 Structure

cloud-delivery-system/
├── src/
├── Dockerfile
├── .github/workflows/ci-cd.yml
├── pom.xml
└── README.md


## 📦 Deployment

1. Clone this repo  
2. Build: `mvn clean install`  
3. Run locally: `mvn spring-boot:run`  
4. Build Docker: `docker build -t delivery-system .`  
5. Run Docker: `docker run -p 8080:8080 delivery-system`

## ✅ CI/CD

- Every push triggers GitHub Actions
- Tests, build, and optional deploy to AWS
