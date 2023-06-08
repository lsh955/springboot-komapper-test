package com.example.config

import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModelMapperConfig {

    @Bean
    fun modelMapper() = ModelMapper().apply {
        configuration.isFieldMatchingEnabled = true // 필드 이름이 같은 것 끼리 매칭여부.
        configuration.fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE // private 필드 접근여부.
        configuration.matchingStrategy = MatchingStrategies.STRICT
        configuration.isSkipNullEnabled = true // 속성 값이 null인 경우 속성을 건너뛸지 여부.
    }
}