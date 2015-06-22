package com.jesuscamposmunoz.controlador;

/**
 * De momento esta página es errónea. 
 */
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jesuscamposmunoz.dominio.Dni;
import com.jesuscamposmunoz.dominio.Student;

@Controller
public class StudentAndDniController {

   @RequestMapping(value = "/studentAndDni", method = RequestMethod.GET)
   public ModelAndView student() {
	  System.out.println("Creando un estudiante y dni");
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("estudiante", new Student());
	  model.put("dni", new Dni());
      return new ModelAndView("student",  model);
   }
   
   @RequestMapping(value = "/addStudentAndDni", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
	  System.out.println("Anyadiendo en BD student y dni");
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      
      System.out.println(student.getBirthDate());
//      return "aaa";
      return "resultDni";
   }
}
