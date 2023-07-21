package org.example.controller;

import org.example.bo.Holidays;
import org.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Autowired
    private DemoService demoService;

    @PostMapping("/api/createHolidays")
    public String create(@RequestBody Holidays holidays) {
        return demoService.createHolidays(holidays);
    }

    @PostMapping("/api/updateHolidays")
    public String update(@RequestBody Holidays holidays) {
        return demoService.updateHolidays(holidays);
    }

    @PostMapping("/api/removeHolidays")
    public String remove(@RequestBody Holidays holidays) {
        return demoService.removeHolidays(holidays);
    }

    @PostMapping("/api/nextYearHolidays")
    public String queryNextYearHolidays(@RequestParam String countryCode) {
        return demoService.queryNextYearHolidays(countryCode);
    }
    @PostMapping("/api/nextHolidays")
    public String queryNextHolidays(@RequestParam String countryCode) {
        return demoService.queryNextHolidays(countryCode);
    }

    @PostMapping("/api/queryHolidaysCountry")
    public String queryHolidaysCountry(@RequestParam String date) {
        return demoService.queryHolidaysCountry(date);
    }
}
