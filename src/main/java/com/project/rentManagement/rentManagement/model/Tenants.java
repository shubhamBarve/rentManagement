package com.project.rentManagement.rentManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Tenants {
    @Id
    public int id;

    @Column
    String name;

    @Column
    String contact_number;

    @Column
    int room_id;

    @Column
    Date join_date;

    @Column
    Date leave_out_date;
}
