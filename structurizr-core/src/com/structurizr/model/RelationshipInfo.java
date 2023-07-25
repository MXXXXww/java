package com.structurizr.model;

public class RelationshipInfo {
    private InfrastructureNode destination;
    private String description;
    private String technology;
    private InteractionStyle interactionStyle;
    private String[] tags;

    public RelationshipInfo() {
    }

    public RelationshipInfo(InfrastructureNode destination, String description, String technology, InteractionStyle interactionStyle, String[] tags) {
        this.destination = destination;
        this.description = description;
        this.technology = technology;
        this.interactionStyle = interactionStyle;
        this.tags = tags;
    }

    public InfrastructureNode getDestination() {
        return destination;
    }

    public void setDestination(InfrastructureNode destination) {
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public InteractionStyle getInteractionStyle() {
        return interactionStyle;
    }

    public void setInteractionStyle(InteractionStyle interactionStyle) {
        this.interactionStyle = interactionStyle;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}


