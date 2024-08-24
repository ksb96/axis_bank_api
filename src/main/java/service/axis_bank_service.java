package service;

import dto.axis_bank_dto;
import dto.axis_bank_response;

public interface axis_bank_service {

    //post
    axis_bank_dto createUser();

    //get all
    axis_bank_response getAllUser(int pageNo, int pageSize);

    //get by id
    axis_bank_dto getUserById(int id);

    //update by id
    axis_bank_dto updateUser();

    //delete by id
    void deleteUserById(int id);
}
