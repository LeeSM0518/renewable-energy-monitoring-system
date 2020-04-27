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

## ER 다이어그램

![image](https://user-images.githubusercontent.com/43431081/80365963-6607aa00-88c3-11ea-92fb-300c1b92eae4.png)

<br>

## SQL

```sql
create table measurement_data (
  id serial primary key,
  pvVoltage integer,
  pvEletricCurrent integer,
  pvOutput integer,
  outputVoltage integer,
  outputEletricCurrent integer,
  currentOutput integer,
  powerFactor double precision,
  frequency double precision,
  cumulativePowerGeneration integer,
  breakdown integer
);
```

