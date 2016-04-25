package com.devcore.dto.search;

public class SearchDto {
    private String searchText;
    private Integer firstResult;
    private Integer maxResult;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public Integer getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(Integer firstResult) {
        this.firstResult = firstResult;
    }

    public Integer getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
    }
}
