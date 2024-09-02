package com.gildedrose.processor;

import com.gildedrose.model.Item;

/**
 * Interface for processing items
 */
public interface ItemProcessor {
    /**
     * Processes the given item based on specific rules.
     * @param item The item to be processed.
     */
    void processItem(Item item);
}
