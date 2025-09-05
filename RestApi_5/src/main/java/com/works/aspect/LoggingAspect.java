package com.works.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LogLevel;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(logExecution)")
    public Object logMethodExecution(ProceedingJoinPoint joinPoint, LogExecution logExecution) throws Throwable {

        // Thread
        Runnable rn = () -> {
            try {
                Thread.sleep(2000);
                System.out.println(joinPoint.getSignature().getName() + " executed at " + LocalDateTime.now());
            }catch (Exception ex){}
        };
        new Thread(rn).start();

        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        LogLevel level = logExecution.level();
        String message = logExecution.value();

        log(level, "Entering: " + className + "." + methodName + " - " + message);
        long startTime = System.currentTimeMillis();

        try {
            Object result = joinPoint.proceed();
            long elapsedTime = System.currentTimeMillis() - startTime;
            log(level, "Exiting: " + className + "." + methodName + " executed in " + elapsedTime + "ms");
            return result;
        } catch (Exception e) {
            log(LogLevel.ERROR, "Exception in: " + className + "." + methodName + " - " + e.getMessage());
            throw e;
        }
    }

    private void log(LogLevel level, String message) {
        switch (level) {
            case DEBUG -> logger.debug(message);
            case INFO -> logger.info(message);
            case WARN -> logger.warn(message);
            case ERROR -> logger.error(message);
            default -> logger.trace(message);
        }
    }

}
