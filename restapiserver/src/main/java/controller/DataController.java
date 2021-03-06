package controller;


import dto.MeasurementData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DataService;

import java.util.List;

// 192.168.0.10:8080/data

@RestController
@RequestMapping("/data")
public class DataController {

  @Autowired
  private DataService service;

  @GetMapping
  public List<MeasurementData> getList() {
    return service.selectList();
  }

  @PostMapping
  public void insert(@RequestBody MeasurementData data) {
    service.insert(data);
  }

}
