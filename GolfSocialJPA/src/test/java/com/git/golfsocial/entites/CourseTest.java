package com.git.golfsocial.entites;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.git.golfsocial.entities.Course;

class CourseTest {

	
	/*Entity Managers are what retrieve and persist
		data into the db. It is an interface provided by
		javax.persistence which interacts with Persistence Unit's Persistence Context
		
		Persistence Context is the collection of entities known by the persistence unit
		within the persistence.xml
		
		Entity Manager Factory is required to utilize Entity Manager
	*/
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Course course;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("GolfSocialJPA");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		course = em.find(Course.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		course = null;
	}

	@Test
	void test_Course_basic_mapping() {
		assertNotNull(course);
		assertEquals("City Park", course.getName());
	}
}
