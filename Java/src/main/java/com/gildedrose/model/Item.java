package com.gildedrose.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Represents an item with a name, sell-in value and quality
 */
@Data
@AllArgsConstructor
@Builder
public class Item {
    /**
     * The name of the item
     */
    private String name;
    /**
     * The number of days remaining to sell the item
     */
    private int sellIn;
    /**
     * The quality of the item and the quality is in between 0 and 50.
     */
    private int quality;
}
