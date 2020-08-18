package io.wisoft.monitoringsystem.controller;

import io.wisoft.monitoringsystem.domain.DataDto;
import io.wisoft.monitoringsystem.domain.MeasurementData;
import io.wisoft.monitoringsystem.service.MeasurementDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MeasurementDataController {

  private final MeasurementDataService measurementDataService;

  @GetMapping("/data")
  public List<MeasurementData> getAll() {
    return measurementDataService.getAll();
  }

  @PostMapping("/data")
  public void post(@RequestBody @Valid DataDto dataDto) {
    measurementDataService.post(dataDto);
  }

  @DeleteMapping("/all")
  public void deleteAll() {
    measurementDataService.deleteAll();
  }

}
