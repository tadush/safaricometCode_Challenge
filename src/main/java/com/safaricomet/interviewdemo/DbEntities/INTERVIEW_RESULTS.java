package com.safaricomet.interviewdemo.DbEntities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.web.util.pattern.PathPattern;

import java.security.PrivateKey;
import java.security.PublicKey;

@Getter
@Setter
public class INTERVIEW_RESULTS {
    @Id
    private String Id;
    private String Candidate_Name;
    private Double Candidate_Score;
    private Boolean Is_Successful;

}
