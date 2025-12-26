package com.example.demo.service;

import com.example.demo.entity.Warranty;
import java.time.LocalDate;
import java.util.List;

public interface WarrantyService {
    Warranty save(Warranty warranty);
    List<Warranty> findExpiringBetween(LocalDate start, LocalDate end);
}
