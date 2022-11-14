package example.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import example.model.Doctor;

public interface DoctorRepository extends Neo4jRepository<Doctor, Long>{}
