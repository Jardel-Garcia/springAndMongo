package br.com.redeSocial.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteConcern;

@Configuration
public class MongoConfig {

	public @Bean MongoDbFactory mongoDbFactory() throws Exception {

		MongoClient mongo = new MongoClient(
				new MongoClientURI(
						"mongodb://jardel:icor1313@ds013971.mlab.com:13971/rede_social_db"));
		SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(
				mongo, "rede_social_db");
		return simpleMongoDbFactory;

	}

	public @Bean MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		mongoTemplate.setWriteConcern(WriteConcern.SAFE);

		return mongoTemplate;

	}

}
