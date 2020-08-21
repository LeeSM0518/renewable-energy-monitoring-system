package io.wisoft.monitoringsystem.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter @Setter
@ToString
public class MeasurementData {

  @Id
  @GeneratedValue
  private Long id;
  @Column
  private int pvVoltage;
  @Column
  private int pvElectricCurrent;
  @Column
  private int pvOutput;
  @Column
  private int outputVoltage;
  @Column
  private int outputElectricCurrent;
  @Column
  private int currentOutput;
  @Column
  private double powerFactor;
  @Column
  private double frequency;
  @Column
  private int cumulativePowerGeneration;
  @Column
  private int breakdown;
  @Column
  private Timestamp createDate;

}
