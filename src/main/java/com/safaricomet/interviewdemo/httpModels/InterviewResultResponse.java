package com.safaricomet.interviewdemo.httpModels;

import com.safaricomet.interviewdemo.DbEntities.INTERVIEW_RESULTS;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InterviewResultResponse extends SharedModel {

    public InterviewResultResponse(List<INTERVIEW_RESULTS> _InterviewResults, boolean _IsSuccessResponse, INTERVIEW_RESULTS _SingleInterviewResult, Exception _ex, String _ErrorMessage){
        this.setInterviewResults(_InterviewResults);
        this.setIsSuccessResponse(_IsSuccessResponse);
        this.setSingleInterviewResult(_SingleInterviewResult);
        this.setErrorMessage(_ErrorMessage);
        this.setException(_ex);
    }
    public List<INTERVIEW_RESULTS> InterviewResults;
    public INTERVIEW_RESULTS SingleInterviewResult;
}
