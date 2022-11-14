package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;
import java.util.*;

import example.model.Doctor;
import example.repository.DoctorRepository;

@RestController
public class DoctorRestController {

	@Autowired
	private DoctorRepository doctorRepository;

	@PostConstruct
	private void init()
	{
	    List<Doctor> list = new ArrayList<Doctor>();

		  list << new Doctor(1L, "Bill", "ER Medicine", "Cardiac");
			
		  list << new Doctor(2L, "Sue", "Neurology", "Spinal Disorder");
		  list << new Doctor(3L, "Jose", "Pediatrics", "General");

			list.forEach(doctor -> {doctorRepository.save(doctor);});
	}

	@RequestMapping(path="/doctors", method=RequestMethod.GET)
	public Iterable<Doctor> getAllDoctors(){
		return doctorRepository.findAll();
	}
}
