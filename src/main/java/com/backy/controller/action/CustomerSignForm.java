package com.backy.controller.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.backy.dao.CustomerDAO;

public class CustomerSignForm implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CustomerDAO cDao = CustomerDAO.getInstance();
		int custno = cDao.customerNum();
		cDao.customerInsert(custno);
		
		RequestDispatcher dis = request.getRequestDispatcher("customer/customerSignForm.jsp");
		dis.forward(request, response);
	}
	

}
