package com.healthcare.appointment_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.connection.convert.StringToDataTypeConverter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Duration;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry){
        registry.addConverter(new StringToDurationConverter());
    }
}

//  Class String (e.g., "PT30M") to Duration
class StringToDurationConverter implements Converter<String,Duration> {
    @Override
    public java.time.Duration convert(String source) {
        return Duration.parse(source);
    }
}
