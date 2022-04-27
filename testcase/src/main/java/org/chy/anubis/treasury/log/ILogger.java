package org.chy.anubis.treasury.log;

/**
 * 日志接口, 实现会放在 anubis
 */
public interface ILogger {

    void info(String msg);

    void warning(String msg);

    void error(String msg, boolean stop);
}
