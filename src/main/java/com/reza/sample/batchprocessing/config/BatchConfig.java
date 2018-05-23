package com.reza.sample.batchprocessing.config;

import com.reza.sample.batchprocessing.config.job.PersonConvertJob;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableBatchProcessing
@Import({PersonConvertJob.class})
public class BatchConfig {
}
