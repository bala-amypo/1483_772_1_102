package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class AlertScheduleServiceImpl implements AlertScheduleService {

    @Override
    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {
        return schedule;
    }

    @Override
    public List<AlertSchedule> getSchedules(Long warrantyId) {
        return Collections.emptyList();
    }
}
