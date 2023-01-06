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

import com.git.golfsocial.entities.Tournament;

class TournamentTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Tournament tournament;
	
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
		tournament = em.find(Tournament.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		tournament = null;
	}

	@Test
	void test_Tournament_basic_mapping() {
		assertNotNull(tournament);
		assertEquals("Front Range Amatuer's Golf Tournament", tournament.getName());
	}
}
