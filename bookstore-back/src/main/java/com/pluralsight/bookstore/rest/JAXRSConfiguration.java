package com.pluralsight.bookstore.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by ashutosh on 26/7/17.
 */
@ApplicationPath("api") // That means everything under API is under the JAXRS
public class JAXRSConfiguration extends Application {
}
