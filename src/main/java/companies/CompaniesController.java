package companies;

import companies.db.CompaniesRepository;
import companies.db.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class CompaniesController {

  @Autowired
  private CompaniesRepository companiesRepository;

  @GetMapping("/all_companies")
  public Iterable<Company> allCompanies() {
    return companiesRepository.findAll();
  }

  @GetMapping("/get_company/{id}")
  public Company getCompany(@PathVariable Long id) throws Exception {
    return companiesRepository.findById(id).orElseThrow(() -> new Exception("company not found"));
  }

  @GetMapping("/delete_company/{id}")
  public void deleteCompany(@PathVariable Long id) {
    companiesRepository.deleteById(id);
  }
  @PostMapping("/save_company")
  public void saveCompany(@RequestBody Company company) {
    companiesRepository.save(company);

  }

}
