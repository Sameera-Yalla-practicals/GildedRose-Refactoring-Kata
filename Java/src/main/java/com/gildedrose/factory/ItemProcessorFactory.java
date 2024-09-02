package com.gildedrose.factory;

import com.gildedrose.Exception.InvalidItemTypeException;
import com.gildedrose.model.Item;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.processor.impl.AgedBrieItemProcessor;
import com.gildedrose.processor.impl.BackStagePassesItemProcessor;
import com.gildedrose.processor.impl.ConjuredItemProcessor;
import com.gildedrose.processor.impl.SulfurasItemProcessor;

/**
 * Factory class to create objects of all item types
 */
public class ItemProcessorFactory {

   public  ItemProcessor getProcessor(Item item){
        return switch(item.getName()){
            case "Conjured" -> new ConjuredItemProcessor();
            case "Sulfuras" -> new SulfurasItemProcessor();
            case "BackStagePasses" -> new BackStagePassesItemProcessor();
            case "AgedBrie" -> new AgedBrieItemProcessor();
            default -> throw new InvalidItemTypeException("Unknown item type: " + item.getName());
        };
    }
}
