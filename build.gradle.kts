plugins {
	java
	id("org.springframework.boot") version "2.7.6"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "guru.springframework"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {

	/*
	//implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation:2.7.6")
	implementation("org.webjars:bootstrap:3.3.7-1")
	// implementation(group = "org.apache.tomcat", name = "tomcat-servlet-api", version = "10.0.0-M4")

	developmentOnly("org.springframework.boot:spring-boot-devtools")
	compileOnly("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	testImplementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo")
	

	//testImplementation("cz.jirutka.spring:embedmongo-spring:1.3.1")
	*/
	
	
	
	
	annotationProcessor("org.projectlombok:lombok:1.18.20")
	compileOnly("org.projectlombok:lombok:1.18.20")
	testAnnotationProcessor("org.projectlombok:lombok:1.18.20")
	
	/////compileOnly("org.projectlombok:lombok")


	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation:2.7.6")
	implementation("org.webjars:bootstrap:3.3.7-1")
	implementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo")

	//runtimeOnly('org.springframework.boot:spring-boot-devtools')
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation(group = "cz.jirutka.spring", name = "embedmongo-spring", version = "1.3.1")
	testImplementation("org.hamcrest:hamcrest:2.2")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
