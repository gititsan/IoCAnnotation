package com.sana;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
		@Bean
		public Person getPerson () {
			return new Person();
		}
}
