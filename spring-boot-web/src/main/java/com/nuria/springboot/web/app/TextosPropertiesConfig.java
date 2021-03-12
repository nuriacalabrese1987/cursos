package com.nuria.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties")
})  //si ponemos una coma podemos dar los que queremos
public class TextosPropertiesConfig {

}
