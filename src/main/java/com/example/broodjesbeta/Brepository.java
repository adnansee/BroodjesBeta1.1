package com.example.broodjesbeta;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface Brepository extends JpaRepository<Broodjes, Integer> {

    @Query("SELECT sw FROM Broodjes sw WHERE sw.id=(:id)")
    List<Broodjes> findBroodjesById(@Param("id") int id);
}
