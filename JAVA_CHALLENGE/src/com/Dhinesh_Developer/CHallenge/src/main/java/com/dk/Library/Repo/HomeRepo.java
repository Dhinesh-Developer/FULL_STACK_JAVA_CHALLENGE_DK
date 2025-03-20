package com.dk.Library.Repo;

import com.dk.Library.Model.Lib;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo extends JpaRepository<Lib,Long> {
}
