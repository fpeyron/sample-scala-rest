package fr.sysf.sample.service

import java.lang.Long

import fr.sysf.sample.domain.Hotel
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "hotel", path = "hotels")
trait HotelRepository extends PagingAndSortingRepository[Hotel, Long]