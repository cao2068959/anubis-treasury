package org.chy.anubis.treasury.log;

import org.chy.anubis.treasury.annotations.Inject;


public class Logger {

    @Inject
    public static ILogger INSTANCE;

    public static void info(String msg) {
        INSTANCE.info(msg);
    }

    public static void warning(String msg) {
        INSTANCE.warning(msg);
    }

    /**
     * @param msg  错误信息
     * @param stop 当打出该日志的时候 是否中断整个程序
     */
    public static void error(String msg, boolean stop) {
        INSTANCE.error(msg, stop);
    }

    public static void error(String msg) {
        error(msg, false);
    }
}
