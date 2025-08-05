# Spring Boot K8s Demo

### Endpoints
- `GET /api/hello`

### Build locally
```bash
./mvnw clean package
docker build -t adrwlo/springboot-k8s-demo .
```

### Deploy with Helm
```bash
helm install springboot-demo ./charts/springboot-k8s-demo
```

### GitHub Actions
Add the following secrets to your GitHub repo:
- `DOCKER_USERNAME` = adrwlo
- `DOCKER_PASSWORD` = your DockerHub password or token
