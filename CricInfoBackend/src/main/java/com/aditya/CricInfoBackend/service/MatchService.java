package com.aditya.CricInfoBackend.service;

import com.aditya.CricInfoBackend.model.Match;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();

    List<List<String>> getPointTables();

}
