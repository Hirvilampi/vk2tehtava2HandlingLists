package viikko2.viikko2.web;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import viikko2.viikko2.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    public static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Aku", "Ankka"));
        students.add(new Student("Iines", "Ankka"));
        students.add(new Student("Pekko", "Kangasniemi"));
    }

    @GetMapping("/hello")
    public String showStudents(Model model) {
        model.addAttribute("students", students);
        return "studentList";
    }

}
