package com.al1x.jobhub.controller;

import com.al1x.jobhub.domain.Job;
import com.al1x.jobhub.service.EmploymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/jobs")
public class EmploymentController {
    @Autowired
    private final EmploymentService employmentService;


    @GetMapping("/listJobs")
    public ResponseEntity<List<Job>> getAllListJobs(){
        List<Job> jobs = employmentService.listJobs();
        return new ResponseEntity<List<Job>>(jobs, HttpStatus.OK);
    }
}