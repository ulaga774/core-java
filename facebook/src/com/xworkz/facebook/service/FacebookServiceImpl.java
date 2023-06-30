package com.xworkz.facebook.service;

import java.sql.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.facebook.dto.FaceBookDto;
import com.xworkz.facebook.repositry.FacebookRepositry;
import com.xworkz.facebook.repositry.FacebookRepositryimpl;

public class FacebookServiceImpl implements FacebookService {
	FacebookRepositry repo = new FacebookRepositryimpl();

	@Override
	public boolean validateAndsave(FaceBookDto dto) throws Exception {
		System.out.println("validation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<FaceBookDto>> validated = validate.validate(dto);
		if (validated.isEmpty()) {
			if(dto.getPhoneNumber()<=10) {
				boolean save = repo.save(dto);
				return true;
			}
		System.out.println("phone error  , check value");

			
		} else {
			System.out.println("error");
			System.out.println(validated);
		}

		return false;
	}

	@Override
	public boolean read(FaceBookDto dto) throws Exception {

		boolean read = repo.read(dto);
		System.out.println(read);
		return false;
	}

	@Override
	public boolean updateBYEmail(String email, String lastName) throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<String>> validated = validate.validate(email);
		if (validated.isEmpty()) {
			boolean update = repo.updateBYEmail(email, lastName);
			System.out.println(update);
		} else {
			System.out.println("error");
			System.out.println(validated);
		}

		return false;
	}

	@Override
	public boolean readBYEmail(String email) throws Exception {

		boolean read = repo.readBYEmail(email);
		System.out.println(read);

		return false;
	}

	@Override
	public boolean updateBYId(Integer id, String lastName) throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<String>> validated = validate.validate(lastName);
		if (validated.isEmpty()) {

			boolean update = repo.updateBYId(id, lastName);
			System.out.println(update);
		} else {
			System.out.println("error");
			System.out.println(validated);
		}
		return false;
	}

	@Override
	public boolean deleteById(Integer id) throws Exception {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<Integer>> validated = validate.validate(id);
		if (validated.isEmpty()) {
			boolean delete = repo.deleteById(id);
			System.out.println(delete);
		} else {
			System.out.println("error");
			System.out.println(validated);
		}
		return false;
	}

	@Override
	public boolean update(String fristName, String lastName, Date DOB, String email, Long phoneNumber, String gender,
			String password) throws Exception {
		System.out.println("validation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validate = factory.getValidator();
		Set<ConstraintViolation<String>> validated = validate.validate(lastName);
		if (validated.isEmpty()) {			
			boolean update = repo.update(fristName, lastName, DOB, email, phoneNumber, gender, password);
			System.out.println(update);
		}else {
			System.out.println(validated);
		}
		
		return false;
	}

}
