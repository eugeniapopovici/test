package md.usarb.cinema.controller;

import md.usarb.cinema.service.CinemaServiceImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Class to initialize app server without web.xml file
 */
@ApplicationPath("/cinema/")
public class ApplicationInit extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(CinemaServiceImpl.class);
        return classes;
    }
}