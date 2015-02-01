package com.test.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {
    /**
     * Processes the message exchange
     *
     * @param exchange the message exchange
     * @throws Exception if an internal processing error has occurred.
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Processing message ==> "+exchange.getIn().getBody(String.class));
    }
}
