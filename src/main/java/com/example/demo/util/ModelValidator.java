package com.example.demo.util;

import java.time.LocalDate;

public class ModelValidator {

    private ModelValidator() {
        // prevent instantiation
    }

    // 🔹 Null check
    public static void requireNonNull(Object value, String message) {
        if (value == null) {
            throw new IllegalArgumentException(message);
        }
    }

    // 🔹 String empty / blank check
    public static void requireNotBlank(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    // 🔹 Date comparison (expiry after purchase)
    public static void validateDateOrder(LocalDate start,
                                         LocalDate end,
                                         String message) {

        if (start == null || end == null || !end.isAfter(start)) {
            throw new IllegalArgumentException(message);
        }
    }

    // 🔹 Numeric non-negative check
    public static void requireNonNegative(Number value, String message) {
        if (value == null || value.doubleValue() < 0) {
            throw new IllegalArgumentException(message);
        }
    }

    // 🔹 Role validation
    public static void validateRole(String role) {
        if (role == null) {
            return; // default handled in service
        }

        if (!role.equals("USER") && !role.equals("ADMIN")) {
            throw new IllegalArgumentException("Invalid role");
        }
    }
}
