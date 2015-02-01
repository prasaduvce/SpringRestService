package com.test.camel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {
    /**
     * <b>Called on initialization to build the routes using the fluent builder syntax.</b>
     * <p/>
     * This is a central method for RouteBuilder implementations to implement
     * the routes using the Java fluent builder syntax.
     *
     * @throws Exception can be thrown during configuration
     */
    @Override
    public void configure() throws Exception {
        from("direct:start")
                //.process(new FileProcessor())
               // .bean(new Transformer(), "transformContent")
        .setHeader(Exchange.HTTP_URI, simple("http://localhost:8080/rest-service/hello"))
                .to("http://localhost:8080/rest-service/hello");
    }
}
