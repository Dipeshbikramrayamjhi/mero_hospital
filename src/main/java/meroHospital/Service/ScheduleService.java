package meroHospital.Service;

import java.util.List;

import meroHospital.Model.ScheduleModel;

public interface ScheduleService {

	public void save(ScheduleModel scheduleModel);
	public List<ScheduleModel> display();
	public void delete(int id);
	public void edit(ScheduleModel scheduleModel);
	public ScheduleModel displayByid(int id);
}
