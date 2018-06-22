package companies.db;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long parentId;
  private String name;
  private double revenue;

  @OneToMany(cascade = CascadeType.ALL,
          fetch = FetchType.EAGER,
          mappedBy = "parentId")
  private Set<Company> childs;

  public Company() {
  }

  public Company(Long parentId, String name, double revenue) {
    this.parentId = parentId;
    this.name = name;
    this.revenue = revenue;
  }

  public Long getId() {
    return id;
  }


  public Set<Company> getChilds() {
    return childs;
  }

  public Long getParentId() {
    return parentId;
  }

  public String getName() {
    return name;
  }

  public double getRevenue() {
    return revenue;
  }


}