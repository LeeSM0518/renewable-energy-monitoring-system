# 서버 실행 방법

1. `monitoring-system-0.0.1-SNAPSHOT.jar` 을 다운받는다.

2. `monitoring-system-0.0.1-SNAPSHOT.jar` 가 있는 위치로 이동한 뒤 jar를 실행시킨다.

   ```bash
   bash$ java -jar monitoring-system-0.0.1-SNAPSHOT.jar
   ```

3. postman을 이용해서 API들이 잘 작동하는지 확인한다.

   ```python
   ### GET
   GET http://localhost:8888/data
   Accept: application/json
   
   ### POST
   POST http://localhost:8888/data
   Content-Type: application/json
   
   {
     "pvVoltage" : 1,
     "pvElectricCurrent" : 2,
     "pvOutput" : 3,
     "outputVoltage" : 4,
     "outputElectricCurrent" :  5,
     "currentOutput" : 6,
     "frequency" :  7,
     "powerFactor": 10,
     "cumulativePowerGeneration" : 8,
     "breakdown" : 9
   }
   
   ### DELETE
   
   DELETE http://localhost:8888/all
   ```

* 만약 내 컴퓨터에 서버가 실행되고 있고 다른 컴퓨터에서 서버로 요청을 보낼때는 요청 방법이 좀 다르다. 서버가 실행되고 있는 컴퓨터의 **IP를 localhost 대신 넣어야 한다.** 그리고 **반드시 같은 와이파이에 있어야 하고** 같은 통신망에 있어야 한다. 다른 통신망에서 요청하고 싶다면 여러 작업이 필요하게 된다.
  * ex) `GET http://192.168.43.136:8888/data`