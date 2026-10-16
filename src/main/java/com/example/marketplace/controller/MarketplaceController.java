package com.example.marketplace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marketplace")
public class MarketplaceController {

  @GetMapping("/about")
  public String aboutMarketplace() {
    return "MarketPlace Spring";
  }
}
