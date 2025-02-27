package com.aditya.CricInfoBackend.controller;

import com.aditya.CricInfoBackend.model.Match;
import com.aditya.CricInfoBackend.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches()
    {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches()
    {
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable()
    {
        return new ResponseEntity<>(this.matchService.getPointTables(),HttpStatus.OK);
    }
}
