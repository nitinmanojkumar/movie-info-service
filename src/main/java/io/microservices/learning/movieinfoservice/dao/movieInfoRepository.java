package io.microservices.learning.movieinfoservice.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import io.microservices.learning.movieinfoservice.model.MovieItem;

@Repository
public interface movieInfoRepository extends PagingAndSortingRepository<MovieItem, Integer>{

}
