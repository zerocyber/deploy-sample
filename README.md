# deploy-sample
spring boot war 배포&종료 샘플


### start.sh(war 배포 스크립트)
```sh
nohup java -jar deploy-sample.war &
```

### shutdown.sh(프로세스 종료 스크립트)
 ```sh
 kill -15 `cat deploy-sample.pid`
 ```
