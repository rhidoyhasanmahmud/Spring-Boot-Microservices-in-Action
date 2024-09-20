# SpringBoot-Microservice-In-Action

### All Services List

| No. | Service Name |
| --- | --------- |
|1|service-registry|
|2|cloud-config-server|
|3|cloud-gateway|
|4|department-service|
|5|user-service|

### Spring Eureka Instances

![eureka-instances-images](https://github.com/CodeMechanix/SpringBoot-Microservice-In-Action/blob/main/images/img.png)


### Functionalities That's Implemented

1. `Microservice Hand on experience`
2. `Creating Department Service`
3. `Creating a User Service`
4. `Implementing Service Registry`
5. `Implementing API Gateway`
6. `Cloud Config Server`
7. `GitHub Repo for Config Server`
8. `Zipkin and Sleuth`


service-registry: This is typically implemented using Eureka Server in Spring Cloud. It acts as a service discovery server where microservices can register themselves and discover other services. This allows for dynamic scaling and failover of services.

cloud-config-server: This is the Spring Cloud Config Server, which provides externalized configuration for distributed systems. It allows you to keep your configuration files in a centralized location (like a Git repository) and serve them to various microservices.

cloud-gateway: This refers to Spring Cloud Gateway, which is used for routing and filtering requests. It acts as an entry point for client requests, directing them to appropriate microservices and can also handle cross-cutting concerns like security, monitoring, and resiliency.

department-service: This appears to be a custom microservice, likely handling department-related business logic in your application. It's an example of a domain-specific service in a microservices architecture.

user-service: Another custom microservice, probably responsible for user-related operations and data management. Like the department service, this represents a domain-specific component of your microservices ecosystem.