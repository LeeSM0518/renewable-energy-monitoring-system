package dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MeasurementData {

  private int id;
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

}
