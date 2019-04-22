package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-22T09:17:09.332Z")

@RestSchema(schemaId = "projectw9nw")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectw9nwImpl {

    @Autowired
    private Projectw9nwDelegate userProjectw9nwDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectw9nwDelegate.helloworld(name);
    }

}
