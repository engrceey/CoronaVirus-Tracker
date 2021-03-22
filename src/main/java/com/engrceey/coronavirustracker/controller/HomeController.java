package com.engrceey.coronavirustracker.controller;

import com.engrceey.coronavirustracker.models.LocationStats;
import com.engrceey.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {

        Locale locale = new Locale("da", "DK");

        NumberFormat numberFormat = NumberFormat.getInstance(locale);

        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalCases = allStats.stream()
                .mapToInt(LocationStats::getLatestTotalCate)
                .sum();

        String number = numberFormat.format(totalCases);
        model.addAttribute("locationStats",allStats);
        model.addAttribute("TotalReportedCases",number);
        return "home";
    }


}
