package org.songcvs.repository;

import org.songcvs.model.Song;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "songs", collectionResourceRel = "songs")
public interface SongRepository extends PagingAndSortingRepository<Song, Integer> {

}
