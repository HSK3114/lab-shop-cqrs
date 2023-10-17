package labshopcqrs.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcqrs.CustomercenterBcApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomercenterBcApplication.class })
public class CucumberSpingConfiguration {}
