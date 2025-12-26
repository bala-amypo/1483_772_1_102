package com.example.demo.service;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.entity.Warranty;

public interface AlertScheduleService {
    AlertSchedule create(Warranty warranty, int daysBeforeExpiry);
}
