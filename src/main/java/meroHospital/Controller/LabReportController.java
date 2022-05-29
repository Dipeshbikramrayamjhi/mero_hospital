package meroHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import meroHospital.Model.LabReportModel;
import meroHospital.Service.FileUploadService;
import meroHospital.Service.LabReportService;

@Controller
public class LabReportController {
	
	@Autowired
	LabReportService labReportService ;
	@Autowired
	FileUploadService fuService ;

	@RequestMapping(value = "/admin/lab_report", method = RequestMethod.GET)
	public String openLapReport(Model model)
	{
		model.addAttribute("displaylist", labReportService.display());
		return "admin/lab_report";
	}
	@RequestMapping(value = "/admin/lab_report", method = RequestMethod.POST)
	public String saveLapReport(@RequestParam ("billNumber") String billNumber , 
								@RequestParam("patientName") String patientName
								,@RequestParam("labReport") MultipartFile labReport)
	{
		LabReportModel labReportModel = new LabReportModel(billNumber , patientName , labReport.getOriginalFilename());
		labReportService.save(labReportModel);
		fuService.uploadImage(labReport, "labReport");
		return "redirect:/admin/lab_report";
	}
}
