package example.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {

	final String title = "Doctor Table";
	final String dataTable = "doctorTable";
	final List<String> columnNames = Arrays.asList("Id", "Name", "Department", "Specialty");

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(Model model){
		model.addAttribute("title", title);
		model.addAttribute("dataTable", dataTable);
		model.addAttribute("columnNames", columnNames);

		return "index";
	}
}
