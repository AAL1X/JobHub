package com.al1x.jobhub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {
    private Integer company_id;
    private String title;
    private String description;
    private String location;
    private String jobType;
    private LocalDate postedDate;
    private LocalDate expirationDate;
    private Double salaryRange;
}