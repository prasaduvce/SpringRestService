package com.test.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelRouteTest {
    public static void main(String[] args) {
        SimpleRouteBuilder simpleRouteBuilder = new SimpleRouteBuilder();
        CamelContext context = new DefaultCamelContext();

        try {
            context.addRoutes(simpleRouteBuilder);
            context.start();
            ProducerTemplate template = context.createProducerTemplate();
            System.out.println(template.requestBodyAndHeaders("direct:start", null, null,String.class));
            Thread.sleep(1000*30*5);
            context.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
