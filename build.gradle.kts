//plugins {
//	kotlin("jvm") version "2.3.21"
//	kotlin("plugin.spring") version "2.3.21"
//	id("org.springframework.boot") version "4.1.0"
//	id("io.spring.dependency-management") version "1.1.7"
//	kotlin("plugin.jpa") version "1.4.30"
//}
//
//group = "com.mercadolivro"
//version = "0.0.1-SNAPSHOT"
//
//java {
//	toolchain {
//		languageVersion = JavaLanguageVersion.of(17)
//	}
//}
//
//repositories {
//	mavenCentral()
//}
//
//dependencies {
//	implementation("org.springframework.boot:spring-boot-starter-webmvc")
//	implementation("org.jetbrains.kotlin:kotlin-reflect")
//	implementation("tools.jackson.module:jackson-module-kotlin")
//	testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
//	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
//	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
//	runtimeOnly("com.mysql:mysql-connector-j")
//	implementation("org.flywaydb:flyway-core")
//	implementation("org.flywaydb:flyway-mysql")
//
//
//
//}
//
//kotlin {
//	compilerOptions {
//		freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
//	}
//}
//
//tasks.withType<Test> {
//	useJUnitPlatform()
//}

plugins {
	kotlin("jvm") version "2.1.0"
	kotlin("plugin.spring") version "2.1.0"
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
	kotlin("plugin.jpa") version "2.1.0"
}

group = "com.mercadolivro"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {

	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	// Flyway + MySQL
	implementation("org.flywaydb:flyway-core")
	implementation("org.flywaydb:flyway-mysql")
	runtimeOnly("com.mysql:mysql-connector-j")


	//SpringFox

	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.13")



	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
