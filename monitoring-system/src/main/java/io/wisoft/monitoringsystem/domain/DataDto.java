package io.wisoft.monitoringsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataDto {

  @Range(min = 1, message = "pvVoltage is null")
  private int pvVoltage;
  @Range(min = 1, message = "pvElectricCurrent is null")
  private int pvElectricCurrent;
  @Range(min = 1, message = "pvOutput is null")
  private int pvOutput;
  @Range(min = 1, message = "outputVoltage is null")
  private int outputVoltage;
  @Range(min = 1, message = "outputElectricCurrent is null")
  private int outputElectricCurrent;
  @Range(min = 1, message = "currentOutput is null")
  private int currentOutput;
  @Range(min = 1, message = "powerFactor is null")
  private double powerFactor;
  @Range(min = 1, message = "frequency is null")
  private double frequency;
  @Range(min = 1, message = "cumulativePowerGeneration is null")
  private int cumulativePowerGeneration;
  @Range(min = 1, message = "breakdown is null")
  private int breakdown;

}
