package com.sj.libAPI.repositories;

import com.sj.libAPI.models.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LibraryRepository extends JpaRepository<Library, UUID> {
}
