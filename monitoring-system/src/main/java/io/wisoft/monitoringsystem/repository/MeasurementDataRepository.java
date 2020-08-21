package io.wisoft.monitoringsystem.repository;

import io.wisoft.monitoringsystem.domain.MeasurementData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementDataRepository extends JpaRepository<MeasurementData, Long> {

}
