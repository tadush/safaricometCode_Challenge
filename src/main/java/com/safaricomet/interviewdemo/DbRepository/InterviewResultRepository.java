package com.safaricomet.interviewdemo.DbRepository;

import com.safaricomet.interviewdemo.DbEntities.INTERVIEW_RESULTS;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InterviewResultRepository extends MongoRepository<INTERVIEW_RESULTS, String> {

}
