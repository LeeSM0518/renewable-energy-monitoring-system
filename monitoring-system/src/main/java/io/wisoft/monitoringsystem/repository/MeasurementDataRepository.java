package io.wisoft.monitoringsystem.repository;

import io.wisoft.monitoringsystem.domain.MeasurementData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementDataRepository extends JpaRepository<MeasurementData, Long> {

}
