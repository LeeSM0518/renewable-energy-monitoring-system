package io.wisoft.monitoringsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataDto {

  private int pvVoltage;
  private int pvElectricCurrent;
  private int pvOutput;
  private int outputVoltage;
  private int outputElectricCurrent;
  private int currentOutput;
  private double powerFactor;
  private double frequency;
  private int cumulativePowerGeneration;
  private int breakdown;
  private Timestamp createDate;

}
