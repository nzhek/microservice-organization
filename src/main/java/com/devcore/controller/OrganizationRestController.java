package com.devcore.controller;

import com.devcore.dto.OfficeOrganizationDto;
import com.devcore.dto.OrganizationDto;
import com.devcore.dto.search.SearchDto;
import com.devcore.entity.Organization;
import com.devcore.service.OfficeOrganizationService;
import com.devcore.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest controller for Organization
 */
@RestController
@RequestMapping(value = "/organization")
public class OrganizationRestController {

    @Autowired
    @Qualifier(value = "organizationService")
    private OrganizationService organizationService;

    @Autowired
    @Qualifier(value = "officeOrganizationService")
    private OfficeOrganizationService officeOrganizationService;

    /**
     * create organization
     *
     * @param organization - not empty object
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public OrganizationDto create(@RequestBody Organization organization) {
        return organizationService.create(organization);
    }

    /**
     * delete organization
     *
     * @param organization - not empty object
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Boolean delete(@RequestBody OrganizationDto organization) {
        if (organization == null) return null;
        return organizationService.delete(organization);
    }

    /**
     * update organization
     *
     * @param organization - not empty object
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public OrganizationDto update(@RequestBody OrganizationDto organization) {
        return organizationService.update(organization);
    }

    /**
     * find organization by id
     *
     * @param organization
     * @return
     */
    @RequestMapping(value = "/find", method = RequestMethod.POST)
    @ResponseBody
    public OrganizationDto find(@RequestBody OrganizationDto organization) {
        if (organization.getUuid()==null) return null;
        return organizationService.find(organization);
    }

    /**
     * Поиск по организациям
     *
     * @return - list organization
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<OrganizationDto> search(@RequestBody SearchDto searchDto) {
        if ("".equals(searchDto.getSearchText())) return null;
        return organizationService.search(searchDto.getSearchText(),
                searchDto.getFirstResult(), searchDto.getMaxResult());
    }

    @RequestMapping(value = "/createOffice", method = RequestMethod.POST)
    @ResponseBody
    public List<OfficeOrganizationDto> createOffice(@RequestBody List<OfficeOrganizationDto> officeOrganizationDto) {
        return officeOrganizationService.create(officeOrganizationDto);
    }
}
