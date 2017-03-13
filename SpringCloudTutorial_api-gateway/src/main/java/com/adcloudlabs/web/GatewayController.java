package com.adcloudlabs.web;

import com.adcloudlabs.GatewayApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eminentstar on 2017. 3. 14..
 */

@RestController
public class GatewayController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity welcom(){
        return new ResponseEntity("Welcom. GATEWAY SERVER.", HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity adminCreate(){
        return new ResponseEntity("success.", HttpStatus.OK);
    }
}
