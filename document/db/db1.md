# DB

## 요구 사항

* 측정 데이터는 PV 전압, PV 전류, PV 출력, 출력 전압, 출력 전류, 현재 출력, 역률, 주파수, 누적 발전량, 고장여부를 갖는다.

<br>

## 명명

* **측정 데이터(MeasurementData)**
  * id
  * PV 전압(pvVoltage)
  * PV 전류(pvEletricCurrent)
  * PV 출력(pvOutput)
  * 출력 전압(outputVoltage)
  * 출력 전류(outputEletricCurrent)
  * 현재 출력(currentOutput)
  * 역률(powerFactor)
  * 주파수(frequency)
  * 누적 발전량(cumulativePowerGeneration)
  * 고장여부(breakdown)

<br>

## SQL

* **Create**

  ```sql
  create table measurement_data (
    id serial primary key,
    pvVoltage integer,
    pvElectricCurrent integer,
    pvOutput integer,
    outputVoltage integer,
    outputElectricCurrent integer,
    currentOutput integer,
    powerFactor double precision,
    frequency double precision,
    cumulativePowerGeneration integer,
    breakdown integer
  );
  ```

<br>

* **Insert**

  ```sql
  insert into measurement_data
  ( pvVoltage,
    pvElectricCurrent,
    pvOutput,
    outputVoltage,
    outputElectricCurrent,
    currentOutput,
    powerFactor, 
    frequency,
    cumulativePowerGeneration,
    breakdown)
    values
    (#{pvVoltage},
    #{pvElectricCurrent},
    #{pvOutput},
    #{outputVoltage},
    #{outputElectricCurrent},
    #{currentOutput},
    #{powerFactor}, 
    #{frequency},
    #{cumulativePowerGeneration},
    #{breakdown})
  ```

<br>

* **select**

  ```sql
  select * from measurement_data
  ```

  