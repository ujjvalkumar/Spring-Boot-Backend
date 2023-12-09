package com.Project.SpringAngular.Service;

import java.util.List;

import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

	boolean deleteCustomer(int id);

}
