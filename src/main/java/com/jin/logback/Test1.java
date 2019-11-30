package com.jin.logback;

import ch.qos.logback.classic.BasicConfigurator;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import ch.qos.logback.classic.sift.SiftingAppender;
import ch.qos.logback.core.OutputStreamAppender;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wu.jinqing
 * @date 2019年11月13日
 */
public class Test1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
        logger.debug("Hello world.");

        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
        ch.qos.logback.core.FileAppender
        ch.qos.logback.core.ConsoleAppender
        ch.qos.logback.core.Appender
                Encoder
        OutputStreamAppender
        ch.qos.logback.core.UnsynchronizedAppenderBase
                TimeBasedRollingPolicy
        SiftingAppender
                MDC
        MDCInsertingServletFilter
        LayoutWrappingEncoder
        Logger rootLogger = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);

        System.out.println(rootLogger.getClass().getName());

    }
}
