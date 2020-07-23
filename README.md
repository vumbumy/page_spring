# Spring

## Reference
 - [JDK + Eclipse + STS](https://vumy.tistory.com/98)
 - [MySQL](https://www.popit.kr/mysql-%EC%84%A4%EC%B9%98-%EC%9C%88%EB%8F%84%EC%9A%B0-%ED%99%98%EA%B2%BD/)
 - [Spring Boot 시작하기](https://eastglow.github.io/back-end/2019/05/08/Spring-Eclipse%EB%A1%9C-Spring-Boot-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0.html)

## MySQL 데이터베이스 생성

테스트 용 데이터베이스를 생성합니다. 이때 `CHARACTER SET`을 `utf8mb4`로 설정합니다:

```sql
CREATE DATABASE job_db CHARACTER SET = utf8mb4;
```

## 실행
```sh
./mvnw spring-boot:run
```
