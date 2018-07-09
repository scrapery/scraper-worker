package io.github.scrapery.worker.cucumber.stepdefs;

import io.github.scrapery.worker.ScraperWorkerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ScraperWorkerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
