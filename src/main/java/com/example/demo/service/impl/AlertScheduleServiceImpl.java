package com.example.demo.service.impl;

import com.example.demo.service.AlertScheduleService;
import com.example.demo.entity.AlertSchedule;
import com.example.demo.entity.Warranty;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.repository.WarrantyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertScheduleServiceImpl
        implements AlertScheduleService {

    @Autowired
    private AlertScheduleRepository alertScheduleRepository;

    @Autowired
    private WarrantyRepository warrantyRepository;

    @Override
    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {

        if (schedule.getDaysBeforeExpiry() == null ||
                schedule.getDaysBeforeExpiry() < 0) {
            throw new IllegalArgumentException("daysBeforeExpiry");
        }

        Warranty warranty = warrantyRepository.findById(warrantyId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Warranty not found"));

        schedule.setWarranty(warranty);

        return alertScheduleRepository.save(schedule);
    }

    @Override
    public List<AlertSchedule> getSchedules(Long warrantyId) {
        return alertScheduleRepository.findByWarrantyId(warrantyId);
    }
}
