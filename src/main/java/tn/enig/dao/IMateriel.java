package tn.enig.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Materiel;

@Transactional
@Repository
public interface IMateriel  extends JpaRepository<Materiel, Integer>{
@Query("SELECT m from Materiel m " +
        "WHERE m.id = ?1 ")
Materiel getMatById(Integer id);
@Query("SELECT m from Materiel m " +
        "WHERE m.dep.id = ?1 ")
List<Materiel> getMatByIdDepartement(Integer id);

}



