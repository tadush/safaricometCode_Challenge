package com.safaricomet.interviewdemo.DbService;

import com.safaricomet.interviewdemo.DbEntities.INTERVIEW_RESULTS;
import com.safaricomet.interviewdemo.httpModels.InterviewResultResponse;

public interface IInterviewResultsService {
    InterviewResultResponse GetAll();
    InterviewResultResponse AddInterviewResponse(INTERVIEW_RESULTS interviewResults);
    INTERVIEW_RESULTS GetById(String Id);
}
