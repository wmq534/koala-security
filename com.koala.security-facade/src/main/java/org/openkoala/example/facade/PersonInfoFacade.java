package org.openkoala.example.facade;

import org.dayatang.utils.Page;
import org.openkoala.example.facade.dto.PersonInfoDTO;
import org.openkoala.koala.commons.InvokeResult;

import java.util.List;

public interface PersonInfoFacade {

    InvokeResult getPersonInfo(Long id);

    InvokeResult savePersonInfo(PersonInfoDTO personInfo);

    InvokeResult updatePersonInfo(PersonInfoDTO personInfo);

    InvokeResult removePersonInfo(Long id);

    InvokeResult removePersonInfos(Long[] ids);

    List<PersonInfoDTO> findAllPersonInfo();

    Page<PersonInfoDTO> pageQueryPersonInfo(PersonInfoDTO personInfo, int currentPage, int pageSize);

}

