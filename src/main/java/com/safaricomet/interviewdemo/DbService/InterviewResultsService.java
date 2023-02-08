package com.safaricomet.interviewdemo.DbService;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.safaricomet.interviewdemo.DbEntities.INTERVIEW_RESULTS;
import com.safaricomet.interviewdemo.DbRepository.InterviewResultRepository;
import com.safaricomet.interviewdemo.httpModels.InterviewResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.boot.context.properties.PropertyMapper.get;

@Service
public class InterviewResultsService implements IInterviewResultsService {
    @Autowired
    private InterviewResultRepository interviewResultRepository;

    // Get All Service
    public InterviewResultResponse GetAll()
    {
        try {
            var dbResponse = interviewResultRepository.findAll();

            if(dbResponse.isEmpty()){
                return new InterviewResultResponse(null,false,null,null,"No date input foudn.");
            }

            return new InterviewResultResponse(dbResponse,true,null,null,"");
        }
        catch (Exception ex)
        {
            return new InterviewResultResponse(null,false,null,ex,ex.getMessage());
        }

    }

    // Add single interview result
    public InterviewResultResponse AddInterviewResponse(INTERVIEW_RESULTS interviewResults)
    {
        try {

            interviewResultRepository.save(interviewResults);
            return new InterviewResultResponse(null,true,null,null,"Successfully added.");
        }
        catch (Exception ex)
        {
            return new InterviewResultResponse(null,false,null,ex,ex.getMessage());

        }

    }

    @Override
    public INTERVIEW_RESULTS GetById(String Id) {
        try
        {
            var candidatesAll = interviewResultRepository.findById(Id);
            //var candidate = candidatesAll.stream().findAny().get();
            return candidatesAll.get();
        }
        catch (Exception ex)
        {
            return null;
        }
    }

}
