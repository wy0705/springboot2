package com.easy.archiecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class GracefullyShutdownHook {
    private final Logger logger = LoggerFactory.getLogger(GracefullyShutdownHook.class);

    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;

    //    @Value("${spring.dubbo.service.shutdown.wait}")
    private static final long dubboShutdownWait = 10000;

    @PostConstruct
    public void registerShutdownHook() {
        logger.info("[SpringShutdownHook] Register ShutdownHook....");
        Runnable shutdownHook = () -> {
            try {
                logger.info("[SpringShutdownHook] Application need sleep {} seconds to wait Dubbo shutdown", (double) dubboShutdownWait / 1000.0D);
                Thread.sleep(dubboShutdownWait);
                logger.info("[SpringShutdownHook] ApplicationContext closed start, Application shutdown doing");
                this.configurableApplicationContext.close();
                logger.info("[SpringShutdownHook] ApplicationContext closed, Application shutdown");
            } catch (InterruptedException var2) {
                logger.error(var2.getMessage(), var2);
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook));
    }
}
