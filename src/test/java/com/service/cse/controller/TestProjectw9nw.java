package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectw9nw {

        Projectw9nwDelegate projectw9nwDelegate = new Projectw9nwDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectw9nwDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}