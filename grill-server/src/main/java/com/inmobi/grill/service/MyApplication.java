package com.inmobi.grill.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//import org.glassfish.jersey.server.ResourceConfig;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class MyApplication extends Application {
/*
extends ResourceConfig {

  public MyApplication() {
    packages("com.inmobi.grill.service");
  } */
  
  @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        // register root resource
        classes.add(IndexResource.class);
        return classes;
    }
}