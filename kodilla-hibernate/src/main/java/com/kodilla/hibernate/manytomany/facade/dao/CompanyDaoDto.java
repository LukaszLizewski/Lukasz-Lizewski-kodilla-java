/*
package com.kodilla.hibernate.manytomany.facade.dao;



import com.kodilla.hibernate.manytomany.facade.CompanyDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDaoDto extends CrudRepository<CompanyDto, Integer> {
    @Query
    List<CompanyDto> retrieveCompaniesWithAnyThreeLetters(@Param("SHORTNAME") String shortname);
}
*/
