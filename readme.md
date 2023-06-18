# NAGP API service

Sample project for NAGP assignment based on k8s, docker and cloud.

## Code Repository

The code for this project can be found in the [GitHub repository](https://github.com/arjunkumar7/nagp-api-arjun-kumar).

## Docker Images

Docker images for this project are available on Docker Hub at [gcr.io/nagp2023arjunkumar/nagp-api](https://gcr.io/nagp2023arjunkumar/nagp-api).

## Service API

To access the Service API tier and view the records from the backend tier, please use the following URL:

[http://35.244.52.50:8080/v1/api/products](http://35.244.52.50:8080/v1/api/products)

Please note that the actual URL for the Service API will depend on your deployment and configuration.

## Other URL for yaml files
docker file:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/Dockerfile
api config map:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/api-configmap.yaml
api deployment:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/api-deployment.yaml
api secret:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/api-secret.yaml
api service:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/api-service.yaml
mysql deployment:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/mysql-deployment.yaml
mysql service:
https://github.com/arjunkumar7/nagp-api-arjun-kumar/blob/main/mysql-service.yaml

## Getting Started

To get started with this project, follow the steps below:

1. Clone the repository:
   ```bash
   git clone https://github.com/arjunkumar7/nagp-api-arjun-kumar
   ```

2. Build the Docker image:
   ```bash
   docker build -t nagpa-api .
   ```

3. Run the Docker container:
   ```bash
   docker run -d -p 8080:8080 nagp-api
   ```

4. Access the Service API using the provided URL:
   [http://localhost:8080/v1/api/products](http://localhost:8080/v1/api/products)

## License

There is no license required. 