package com.gymn.aspect;


import com.alibaba.fastjson.JSON;
import com.gymn.model.JCarryAjaxResult;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author hunan
 * @Date 2018/6/29
 * @Time 下午8:28
 */
@Aspect
@Component
public class JCarryResponseAspect {
    private Logger logger = Logger.getLogger(JCarryResponseAspect.class);

    @Around(value = "@annotation(com.gymn.annotation.JCarryResponse)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        try {
            Object resultData = joinPoint.proceed();
            return JSON.toJSONString(JCarryAjaxResult.succeed(resultData));
        } catch (Throwable throwable) {
            logger.error("Exception :{}", throwable);
            return JSON.toJSONString(JCarryAjaxResult.failed(throwable));
        }

    }
}
