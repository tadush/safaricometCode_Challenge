package com.safaricomet.interviewdemo.controllers;

import com.safaricomet.interviewdemo.DbEntities.INTERVIEW_RESULTS;
import com.safaricomet.interviewdemo.DbService.IInterviewResultsService;
import com.safaricomet.interviewdemo.httpModels.InterviewResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interviewResults")
public class InterviewResultController {

    @Autowired
    private IInterviewResultsService interviewResultsService;

    @GetMapping("/getAll")
    public InterviewResultResponse GetAll()
    {
        return interviewResultsService.GetAll();
    }

    @PostMapping("/add")
    public InterviewResultResponse Add(@RequestBody INTERVIEW_RESULTS interviewResults)
    {
        return interviewResultsService.AddInterviewResponse(interviewResults);
    }

    @GetMapping("/getById")
    public INTERVIEW_RESULTS GetById(@RequestParam String Id)
    {
        return interviewResultsService.GetById(Id);
    }
    @PutMapping("/update")
    public boolean Update(@RequestBody INTERVIEW_RESULTS interviewResults)
    {
        return false;
    }
    @DeleteMapping("/delete")
    public boolean Delete(@RequestParam String Id)
    {
        return false;
    }

}
