package demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author zhuyanting
 */
public class LogDemo1 {
	public static void main(String[] args) throws InterruptedException {
		Logger logger = Logger.getLogger(LogDemo1.class);
		/*
		 * 设置默认级别 BasicConfigurator.configure();
		 * 设置日志输出级别
		 * logger.setLevel(Level.DEBUG); logger.trace("跟踪信息");
		 * logger.debug("调试信息"); logger.info("输出信息"); Thread.sleep(1000);
		 * logger.warn("警告信息"); logger.error("错误信息"); logger.fatal("致命信息");
		 */

		PropertyConfigurator.configure("E:\\eclipsePratice\\log4jDemo\\src\\demo\\log4j.properties");
		for (int i = 0; i < 100; i++) {
			logger.trace("跟踪信息111");
			logger.debug("调试信息");
			logger.info("输出信息");
			logger.warn("警告信息");
			logger.error("错误信息");
			logger.fatal("致命信息");
		}
	}
}
