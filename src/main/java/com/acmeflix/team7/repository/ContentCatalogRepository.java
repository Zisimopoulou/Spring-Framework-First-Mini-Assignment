package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.ContentCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentCatalogRepository  extends JpaRepository<ContentCatalog, Long> {
}
