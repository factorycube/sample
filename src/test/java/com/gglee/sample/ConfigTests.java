package com.gglee.sample;

import com.gglee.sample.config.SampleComponent;
import com.gglee.sample.config.SampleConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleApplication.class)
@Slf4j
public class ConfigTests {

    @Autowired
    private SampleComponent sampleComponent;

    @Autowired
    private SampleConfig sampleConfig;

    @Test
    public void contextLoads() throws Exception {
        log.info("sampleComponent.plus : {}", sampleComponent.plus(1, 2));
        log.info("sampleConfig.testBean : {}", sampleConfig.testBean());
    }

}
