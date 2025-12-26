package com.example.demo.service.impl;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    @Override
    public Warranty registerWarranty(Long userId, Long productId, Warranty warranty) {
        return warranty;
    }

    @Override
    public Warranty getWarranty(Long warrantyId) {
        return null;
    }

    @Override
    public List<Warranty> getUserWarranties(Long userId) {
        return Collections.emptyList();
    }

    @Override
    public List<Warranty> findExpiringBetween(LocalDate start, LocalDate end) {
        return Collections.emptyList();
    }
}
