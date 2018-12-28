package com.academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog {
    protected static final Logger LOG = LogManager.getLogger(DemoLog.class);

    public static void main(String[] args) {
        System.out.println("This is class DemoLog");
        LOG.info("This is LOG from class DemoLog");
    }
}
