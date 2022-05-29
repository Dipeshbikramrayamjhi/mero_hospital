package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import meroHospital.Model.DepartmentModel;
import meroHospital.Service.DepartmentService;
 
@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice ;

	
	@RequestMapping(value="/admin/department", method= RequestMethod.GET)
	public String opendepartment(Model model)
	{
		model.addAttribute("display", departmentservice.display());
		return "admin/department";
		
	}
	@RequestMapping(value="/admin/department", method = RequestMethod.POST)
	public String savedepartment(@RequestParam("departmentName") String departmentName
			,@RequestParam("relatedDisease")
				String relatedDisease , @RequestParam("aboutDepartment") String aboutDepartment)
	{
		
		DepartmentModel departmentmodel = new DepartmentModel(departmentName,relatedDisease,aboutDepartment);
		departmentservice.save(departmentmodel);
		return "redirect:/admin/department";
	}
//	@RequestMapping(value="/admin/department_display", method= RequestMethod.GET)
//	public String showdepartment(Model model)
//	{
//		model.addAttribute("display", departmentservice.display());
//		return "admin/department_display";
//		
//	}
	
	@RequestMapping(value="/admin/department_delete/{id}", method = RequestMethod.GET)
	public String deleteDepartment(@PathVariable("id") int id)
	{
		departmentservice.delete(id);
		return"redirect:/admin/department";
	}
	@RequestMapping(value="/admin/department_update/{id}", method = RequestMethod.GET)
	public String updateDepartment(@PathVariable("id") int id , Model model)
	{
		departmentservice.displayByid(id);
		model.addAttribute("singlelist", departmentservice.displayByid(id));
		return"admin/department_update";
	}
	@RequestMapping(value="/admin/department_update/{id}", method = RequestMethod.POST)
	public String updatedepartment(@RequestParam("did") int did
			,@RequestParam("departmentName") String departmentName
			,@RequestParam("relatedDisease")
				String relatedDisease , @RequestParam("aboutDepartment") String aboutDepartment)
	{
		
		DepartmentModel departmentmodel = new DepartmentModel(did,departmentName,relatedDisease,aboutDepartment);
		departmentservice.edit(departmentmodel);
		return "redirect:/admin/department ";
	}
	
}
