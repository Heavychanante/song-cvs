package org.songcvs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.songcvs.model.Version;

@RepositoryRestResource(path = "versions", collectionResourceRel = "versions")
public interface VersionRepository extends PagingAndSortingRepository<Version, Integer> {

}
