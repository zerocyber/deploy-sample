# deploy-sample
spring boot 배포/종료 기본 샘플


### start.sh(war 배포 스크립트) 작성
nohup java -jar deploy-sample.war &

### shutdown.sh(프로세스 종료 스크립트) 작성
kill -15 `cat deploy-sample.pid`