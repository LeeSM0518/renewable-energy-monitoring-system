# 기술 설계

## 전체 기술도

![image](https://user-images.githubusercontent.com/43431081/80278325-42602a80-8730-11ea-8058-68ec347595c7.png)

<br>

## 흐름도

### 데이터 생성과 송수신 및 저장

![image](https://user-images.githubusercontent.com/43431081/80278328-47bd7500-8730-11ea-8fd8-03ffb398129a.png)

1. 가상 전력 측정 디바이스가 데이터를 가상으로 생성해서 UART로 데이터를 전송한다.

2. 모니터링 디바이스가 UART로 데이터를 수신한다. 수신된 데이터를 Flask라는 파이썬 웹 프레임워크를 사용하여 자바 웹 서버로 전송한다.

3. 인터넷을 통해 데이터가 전달된다.

4. Spring이라는 자바 웹 프레임워크가 데이터를 수신한다. Spring은 데이터를 DBMS에 저장을 요청한다.

5. PostgreSQL이라는 DBMS가 데이터를 저장한다.

<br>

### 디스플레이를 통한 모니터링

![image](https://user-images.githubusercontent.com/43431081/80278331-51df7380-8730-11ea-8dea-314b93522401.png)

1. 사용자가 디스플레이로 UI를 요청한다.

2. 라즈베리 파이는 인터넷을 통해서 UI 서버인 Vue에게 요청한다.

3. Vue는 자바 웹 서버인 Spring에게 UI에 필요한 데이터를 요청한다.

4. Spring은 DB인 PostgreSQL로부터 데이터를 불러온다.

5. Spring은 데이터를 Vue에게 반환하고 Vue는 반환된 데이터를 통해 UI를 구성한 뒤, 라즈베리 파이에게 UI를 전송해주며, 라즈베리 파이는 UI를 디스플레이에 출력한다.

<br>

### 직접 인터넷을 이용한 모니터링

![image](https://user-images.githubusercontent.com/43431081/80278333-54da6400-8730-11ea-8a40-d229b0c07760.png)

1. 사용자는 핸드폰이나 컴퓨터를 통해 인터넷에 접속을 하여 모니터링 페이지를 요청한다.

2. UI 서버인 Vue는 해당 모니터링 페이지를 제작한다. UI에 필요한 데이터를 Spring에게 요청한다.

3. Spring은 요청한 데이터를 DB인 PostgreSQL로부터 불러온다.

4. Spring은 데이터를 Vue에게 반환하고 Vue는 반환된 데이터를 통해 UI를 구성한 뒤, 사용자에게 반환해준다.