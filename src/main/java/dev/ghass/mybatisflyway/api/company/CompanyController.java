package dev.ghass.mybatisflyway.api.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

  @Autowired
  private CompanyService CompanyService;

  @GetMapping("")
  public List<Company> getCompanies() {
    return this.CompanyService.getCompanies();
  }
}
