package org.amalitechtraining.first_spring_application.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String welcome(
            @RequestParam(
                    value = "name",
                    required = false,
                    defaultValue = "guest")
            String name) {
        return "Welcome %s to my application, I hope you enjoy using it. ".formatted(name) +
                "Feel free to leave any comment at seth.support@amalitechtraining.org";
    }

    @GetMapping("info")
    public String getAppInfo() {
        return """
                NAME: FirstSpringApplication
                VERSION: 0.0.1-SNAPSHOT
                DESCRIPTION: This application is developed by Seth Ofosu Okyere as part of my quest to learn the spring boot framework.
                SUPPORT: To get any support kindly email me at seth.support@amalitechtraining.org
                """;
    }
}
