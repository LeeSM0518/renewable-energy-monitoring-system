package mapper;

import dto.MeasurementData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MeasurementDataMapper {

  @Insert("insert into measurement_data" +
      " (pvVoltage,"+
      "  pvElectricCurrent," +
      "  pvOutput," +
      "  outputVoltage," +
      "  outputElectricCurrent," +
      "  currentOutput," +
      "  powerFactor," +
      "  frequency," +
      "  cumulativePowerGeneration," +
      "  breakdown)" +
      "  values" +
      "  (#{pvVoltage}," +
      "  #{pvElectricCurrent}," +
      "  #{pvOutput}," +
      "  #{outputVoltage}," +
      "  #{outputElectricCurrent}," +
      "  #{currentOutput}," +
      "  #{powerFactor}, " +
      "  #{frequency}," +
      "  #{cumulativePowerGeneration}," +
      "  #{breakdown})")
  void insert(
      @Param("pvVoltage") int pvVol,
      @Param("pvElectricCurrent") int pvEle,
      @Param("pvOutput") int pvOut,
      @Param("outputVoltage") int outVol,
      @Param("outputElectricCurrent") int outEle,
      @Param("currentOutput") int curOut,
      @Param("powerFactor") double powerFactor,
      @Param("frequency") double frequency,
      @Param("cumulativePowerGeneration") int cumPowGen,
      @Param("breakdown") int breakdown
  );

  @Select("select * from measurement_data")
  List<MeasurementData> selectList();


}
