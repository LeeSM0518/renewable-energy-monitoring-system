# API

## Spring REST API

* **GET /data**

  | 데이터 이름               | 데이터 타입 |
  | ------------------------- | ----------- |
  | id                        | integer     |
  | pvVoltage                 | integer     |
  | pvElectricCurrent         | integer     |
  | pvOutput                  | integer     |
  | outputVoltage             | integer     |
  | outputElectricCurrent     | integer     |
  | currentOutput             | integer     |
  | powerFactor               | double      |
  | frequency                 | double      |
  | cumulativePowerGeneration | integer     |
  | breakdown                 | integer     |

<br>

* **POST /data**
    
  * body
      
    ```json
    {
      "pvVoltage": 123,
      "pvElectricCurrent": 123,
      ...
    }
    ```
    
    
  
  | 데이터 이름               | 데이터 타입 |
  | ------------------------- | ----------- |
  | pvVoltage                 | integer     |
  | pvElectricCurrent         | integer     |
  | pvOutput                  | integer     |
  | outputVoltage             | integer     |
  | outputElectricCurrent     | integer     |
  | currentOutput             | integer     |
  | powerFactor               | double      |
  | frequency                 | double      |
  | cumulativePowerGeneration | integer     |
  | breakdown                 | integer     |



  