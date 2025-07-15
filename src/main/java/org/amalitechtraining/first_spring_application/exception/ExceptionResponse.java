package org.amalitechtraining.first_spring_application.exception;

import java.time.LocalDateTime;

public record ExceptionResponse(
        String status,
        LocalDateTime tiemStamp,
        String message
) {
}
