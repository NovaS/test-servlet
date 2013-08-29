package test.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleListener implements ServletContextListener {
	private static final Logger logger = LoggerFactory.getLogger(SimpleListener.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("SimpleListener-contextDestroyed!");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("SimpleListener-contextInitialized!");
	}
}
