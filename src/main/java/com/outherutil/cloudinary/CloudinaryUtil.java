package com.outherutil.cloudinary;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloudinary.Cloudinary;


public class CloudinaryUtil {

	@Autowired
	static Cloudinary cloudinary = init();
	public static Cloudinary init() {
		if(System.getenv("CLOUDINARY_URL")==null)
			return null;
		else {
			Cloudinary cloudinary = new Cloudinary(System.getenv("CLOUDINARY_URL"));
			return cloudinary;
		}
	}
	public static Cloudinary getCloudinary() {
		return cloudinary;
	}
}
