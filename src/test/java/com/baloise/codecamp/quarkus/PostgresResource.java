package com.baloise.codecamp.quarkus;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.Collections;
import java.util.Map;

public class PostgresResource implements QuarkusTestResourceLifecycleManager {

	static PostgreSQLContainer<?> db =
		new PostgreSQLContainer<>("postgres:13")
			.withDatabaseName("postgres")
			.withUsername("postgres")
			.withPassword("postgres")
//			.withClasspathResourceMapping("init.sql", "/docker-entrypoint-initdb.d/init.sql", BindMode.READ_ONLY)
		;

	@Override
	public Map<String, String> start() {
		db.start();
		return Collections.singletonMap(
			"quarkus.datasource.url", db.getJdbcUrl()
		);
	}

	@Override
	public void stop() {
		db.stop();
	}
}
