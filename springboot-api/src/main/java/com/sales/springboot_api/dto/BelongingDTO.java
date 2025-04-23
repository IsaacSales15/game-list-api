package com.sales.springboot_api.dto;

public class BelongingDTO {
    private Long elementId;
    private Long listId;
    private Integer position;

    public BelongingDTO() {
    }

    public BelongingDTO(Long elementId, Long listId, Integer position) {
        this.elementId = elementId;
        this.listId = listId;
        this.position = position;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Long getElementId() {
        return elementId;
    }

    public void setElementId(Long elementId) {    
        this.elementId = elementId;
    }
}
