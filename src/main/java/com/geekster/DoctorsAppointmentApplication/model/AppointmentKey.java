package com.geekster.DoctorsAppointmentApplication.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Embeddable
public class AppointmentKey implements Serializable {
    private Long appId;
    private LocalDateTime time;
}