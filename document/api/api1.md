# API

## Spring REST API

### 데이터 설명

| 데이터 이름               | 데이터 타입 | 정보        |
| ------------------------- | ----------- | ----------- |
| id                        | integer     | 식별자      |
| pvVoltage                 | integer     | PV 전압     |
| pvElectricCurrent         | integer     | PV 전류     |
| pvOutput                  | integer     | PV 출력     |
| outputVoltage             | integer     | 출력 전압   |
| outputElectricCurrent     | integer     | 출력 전류   |
| currentOutput             | integer     | 현재 출력   |
| powerFactor               | double      | 역률        |
| frequency                 | double      | 주파수      |
| cumulativePowerGeneration | integer     | 누적 발전량 |
| breakdown                 | integer     | 고장 여부   |

<br>

### GET /data

측정한 모든 데이터를 조회하는 API

* 응답 데이터

  ```javascript
  [
    {
      "id": 7,
      "pvVoltage": 1,
      "pvElectricCurrent": 2,
      "pvOutput": 3,
      "outputVoltage": 4,
      "outputElectricCurrent": 5,
      "currentOutput": 6,
      "powerFactor": 10.0,
      "frequency": 7.0,
      "cumulativePowerGeneration": 8,
      "breakdown": 9
    },
    ...
  ]
  ```

<br>

### POST /data

측정한 데이터를 삽입하는 API

* 요청 데이터
  
  ```javascript
  {
    "pvVoltage" : 1,                   // integer
    "pvElectricCurrent" : 2,           // integer
    "pvOutput" : 3,                    // integer
    "outputVoltage" : 4,               // integer
    "outputElectricCurrent" :  5,      // integer
    "currentOutput" : 6,               // integer
    "frequency" :  7,                  // double
    "powerFactor": 10,                 // double
    "cumulativePowerGeneration" : 8,   // integer
    "breakdown" : 9                    // integer
  }
  ```
  
* 응답 데이터

  * 성공 시 `200` 에러 코드 응답
  * JSON 데이터에서 항목이 하나라도 빠지게 되면 `400` 에러 코드 응답하고, `null` 인 데이터를 메시지로 응답한다.

<br>

### DELETE /all

측정한 모든 데이터를 제거하는 API