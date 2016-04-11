package com.devcore.controller;

import com.devcore.entity.Organization;
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

    /**
     * create organization
     *
     * @param organization - not empty object
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Organization create(@RequestBody Organization organization) {
        return organizationService.create(organization);
    }

    /**
     * delete organization
     *
     * @param organization - not empty object
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Boolean delete(@RequestBody Organization organization) {
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
    public Organization update(Organization organization) {
        return organizationService.update(organization);
    }

    /**
     * find organization by id
     *
     * @param organization
     * @return
     */
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public Organization find(Organization organization) {
        return organizationService.find(organization);
    }

    /**
     * find all items from firstResult to maxResult and return list of organization
     *
     * @param paramName   - find of name organzation
     * @param firstResult - step from
     * @param maxResult   - step to
     * @return - list organization
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Organization> findAll(
            @RequestParam(defaultValue = "") String paramName,
            @RequestParam(defaultValue = "0", required = false) int firstResult,
            @RequestParam(defaultValue = "10", required = false) int maxResult) {
        return organizationService.findAll(paramName, firstResult, maxResult);
    }

    @RequestMapping(value = "/countPagesByName", method = RequestMethod.GET)
    public Long countPagesByName(String paramName) {
        return organizationService.countPagesByName(paramName);
    }
}
