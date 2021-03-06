package io.wisoft.monitoringsystem.controller;

import io.wisoft.monitoringsystem.domain.DataDto;
import io.wisoft.monitoringsystem.domain.MeasurementData;
import io.wisoft.monitoringsystem.service.MeasurementDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MeasurementDataController {

  private final MeasurementDataService measurementDataService;

  @GetMapping("/data")
  public MeasurementData get() {
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
