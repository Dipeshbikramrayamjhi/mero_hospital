package meroHospital.Service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
	
	public static final String UPLOAD_DIR = "C:\\Users\\dipes\\\\OneDrive\\Documents\\meroHospital";
	public boolean uploadImage (MultipartFile image , String folderName);

}
