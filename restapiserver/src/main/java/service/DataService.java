package service;

import dto.MeasurementData;
import mapper.MeasurementDataMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataService {

  @Autowired
  private MeasurementDataMapper dataMapper;

  public void insert(MeasurementData data) {
    dataMapper.insert(
        data.getPvVoltage(),
        data.getPvElectricCurrent(),
        data.getPvOutput(),
        data.getOutputVoltage(),
        data.getOutputElectricCurrent(),
        data.getCurrentOutput(),
        data.getPowerFactor(),
        data.getFrequency(),
        data.getCumulativePowerGeneration(),
        data.getBreakdown()
    );
  }

  public List<MeasurementData> selectList() {
    return dataMapper.selectList();
  }

}
