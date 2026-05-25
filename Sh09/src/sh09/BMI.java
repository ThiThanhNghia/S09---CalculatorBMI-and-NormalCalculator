/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh09;

/**
 * S09 - This class contains BMI description
 *
 * @author CE2010300 Thi Thanh Nghĩa
 */
public enum BMI {
    UNDER_STANDARD("UNDER-STANDARD"),
    STANDARD("STANDARD"),
    OVERWEIGHT("OVERWEIGHT"),
    FAT("FAT - should lose weight"),
    VERY_FAT("VERY FAT - should lose weight immediately");

    private final String description;

    /**
     * This constructor automatically assigns description of each BMI status.
     *
     * @param description of each BMI status.
     */
    BMI(String description) {
        this.description = description;
    }

    /**
     * This method is used to get the description of each BMI status.
     *
     * @return description of each BMI status.
     */
    public String getDescription() {
        return this.description;
    }
}
