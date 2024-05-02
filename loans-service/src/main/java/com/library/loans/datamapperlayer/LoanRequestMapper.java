package com.library.loans.datamapperlayer;

import com.library.loans.datalayer.Loan;
import com.library.loans.datalayer.LoanIdentifier;
import com.library.loans.domainclientlayer.fines.FineModel;
import com.library.loans.domainclientlayer.patrons.PatronModel;
import com.library.loans.presentationlayer.LoanRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoanRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "borrowedDate", ignore = true)
    @Mapping(target = "returnedDate", ignore = true)
    @Mapping(target = "books", ignore = true)
//    @Mapping(target = "loanId", source = "loanId")
//    @Mapping(expression = "java(patronIdentifier)", target = "patronIdentifier")
    Loan requestModelToEntity(LoanRequestModel requestModel, LoanIdentifier loanIdentifier,
                              PatronModel patronModel, FineModel fineModel);
}
