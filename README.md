# springboot-aws-deploy

This is a sample microservice to deploy it on AWS ECS.

To build automated AWS CodePipeline and deploy microservice to AWS ECS, follow tutorial as shown in video :

Health Check command for AWS Task definition : 
```
CMD-SHELL,curl -f http://localhost:8080/actuator/health || exit 1
```



