package com.acmeflix.team7.domain.enums;

import lombok.Getter;

@Getter
public enum Tag {
    AUTISTIC("autistic"),
    STRONGFEMALELEAD("strong female lead"),
    STRONGMALELEAD("strong male lead"),
    LAWFIRM("law firm"),
    ADAPTEDFROMANOVEL("adapted from a novel"),
    POLICEINSPECTOR("police inspector"),
    SWINDLER("swindler"),
    MAGICALPOWER("magical power"),
    ASSASSINFEMALELEAD("assassin female lead"),
    BIRTHSECRET("birth secret"),
    PARTTIMEWORKER("part time worker"),
    DENTISTLEAD("dentist lead"),
    PATISSERIE("patisserie");

    private String tag;
    Tag(String tag) {
        this.tag = tag;
    }
}
