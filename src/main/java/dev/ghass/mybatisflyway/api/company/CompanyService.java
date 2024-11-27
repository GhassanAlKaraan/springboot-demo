package dev.ghass.mybatisflyway.api.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  public List<Company> getCompanies() {
    return this.companyRepository.selectAll();
  }
}
