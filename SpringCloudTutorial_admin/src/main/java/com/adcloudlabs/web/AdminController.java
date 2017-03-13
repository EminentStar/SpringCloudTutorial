package com.adcloudlabs.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by eminentstar on 2017. 3. 14..
 */

@RestController
public class AdminController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity welcome(){
        return new ResponseEntity("Welcom. ADMIN SERVER", HttpStatus.OK);
    }

    @RequestMapping(value = "/time", method = RequestMethod.POST)
    public ResponseEntity getTime(){
        return new ResponseEntity(LocalDateTime.now(), HttpStatus.OK);

    }
}
