package com.example.task.reposiotry;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.task.model.TicketModel;
import java.util.*;

@Repository
public interface TicketRepository extends MongoRepository<TicketModel, String> {
	
	@Aggregation(pipeline="{'$match':{'movieName': ?0, 'showDate': ?1, 'showTime': ?2}},")
	List<TicketModel> findSameShowUsers(String movieName,String showDate,String showTime);
	
}
