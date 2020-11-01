package io.wisoft.monitoringsystem.service;

import io.wisoft.monitoringsystem.domain.DataDto;
import io.wisoft.monitoringsystem.domain.MeasurementData;
import io.wisoft.monitoringsystem.repository.MeasurementDataRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class MeasurementDataService {

  private final MeasurementDataRepository measurementDataRepository;

  public MeasurementData getAll() {
    return measurementDataRepository.findFirstByOrderByCreateDateDesc();
  }

  public void post(@RequestBody DataDto dataDto) {
    ModelMapper modelMapper = new ModelMapper();
    MeasurementData data = modelMapper.map(dataDto, MeasurementData.class);
    data.setCreateDate(new Timestamp(System.currentTimeMillis() + 32400000));
    measurementDataRepository.save(data);
  }

  public void deleteAll() {
    measurementDataRepository.deleteAll();
  }

}
