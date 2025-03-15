# springboot-aws-deploy

This is a sample microservice to deploy it on AWS ECS.



Health Check command for AWS Task definition : 
```
CMD-SHELL,curl -f http://localhost:8080/actuator/health || exit 1
```


