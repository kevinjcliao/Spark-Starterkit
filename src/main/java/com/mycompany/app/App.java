package com.mycompany.app;

import static spark.Spark.*;
import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/hello", (req, res) -> "hello!");
    }
}
