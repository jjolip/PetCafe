package com.pet;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TestController {
	@RequestMapping("/upload")
	public void upload(MultipartFile uploadFile) {
		if (!uploadFile.isEmpty()) {
			String logicalName = uploadFile.getOriginalFilename();
			String phsicalName = String.valueOf(System.nanoTime());
			
			String path = "C:\\Users\\Ksolip\\Desktop";
			String savePath = path + "\\" + phsicalName + "_" + logicalName;
			
			try {
				uploadFile.transferTo(new File(savePath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("sssss");
	}
}