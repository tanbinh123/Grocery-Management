package com.project.service;

import java.util.List;

import com.project.model.Register;

public interface RegisterService {
	
	public void addRegister(Register register);
	public List<Register> getAllRegisters();

	public void deleteRegister(Integer registerId);

	public Register updateRegister(Register register);

	public Register getRegister(int registerid);
}
