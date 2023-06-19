package com.interfaces;

import java.util.List;

import com.models.EmployeeLeaveRequest;
import com.models.EmployeeLeaveRequestId;
import com.models.JobGradeWiseLeaves;

public interface EmployeeLeaveRequestDAO {
	void saveEmployeeLeaveRequest(EmployeeLeaveRequest leaveRequest);

	int getNextLeaveRequestIndex(int employeeId);

	List<EmployeeLeaveRequest> getEmployeeAndLeaveRequestData(int id);

	EmployeeLeaveRequest getEmployeeLeaveRequest(EmployeeLeaveRequestId id);

	JobGradeWiseLeaves getJobGradeWiseLeaves(String jobGradeId);

	List<EmployeeLeaveRequest> getApprovedAndPendingEmployeeAndLeaveRequestData(int id);

	List<EmployeeLeaveRequest> getApprovedEmployeeAndLeaveRequestData(int id);

}
