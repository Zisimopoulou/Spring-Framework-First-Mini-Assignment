package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.ContentCatalog;
import com.acmeflix.team7.repository.ContentCatalogRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public class ContentCatalogServiceImpl extends BaseServiceImpl<ContentCatalog> implements ContentCatalogService {
    private final ContentCatalogRepository contentCatalogRepository;

    @Override
    public JpaRepository<ContentCatalog, Long> getRepository() {
        return contentCatalogRepository;
    }

    @Override
    public ContentCatalog findByDescription(final String description) {
        return null;
    }
}
