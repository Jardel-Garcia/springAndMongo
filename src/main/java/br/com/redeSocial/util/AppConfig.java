package br.com.redeSocial.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan({ "br.com.redeSocial.util", "br.com.redeSocial.documentos" })
@EnableMongoRepositories("br.com.redeSocial.repositorios")
@Import({ MongoConfig.class })
public class AppConfig {

}
