package com.vidkol.platform.data;

import com.vidkol.platform.Platform;
import com.vidkol.platform.data.block.PlatformBlockStatesProvider;
import com.vidkol.platform.data.item.PlatformItemModelsProvider;
import com.vidkol.platform.data.loot.PlatformLootTablesProvider;
import com.vidkol.platform.data.recipes.PlatformRecipesProvider;
import com.vidkol.platform.data.tags.PlatformBiomeTagsProvider;
import com.vidkol.platform.data.tags.PlatformBlockTagsProvider;
import com.vidkol.platform.data.tags.PlatformItemTagsProvider;
import com.vidkol.platform.data.tags.PlatformStructureSetTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Platform.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData (GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if(event.includeServer()) {
            generator.addProvider(new PlatformRecipesProvider(generator));
            generator.addProvider(new PlatformLootTablesProvider(generator));
            PlatformBlockTagsProvider blockTags = new PlatformBlockTagsProvider(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new PlatformItemTagsProvider(generator, blockTags, event.getExistingFileHelper()));
            generator.addProvider(new PlatformBiomeTagsProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new PlatformStructureSetTagsProvider(generator, event.getExistingFileHelper()));
        }

        if (event.includeClient()) {
            generator.addProvider(new PlatformBlockStatesProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new PlatformItemModelsProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new PlatformLanguageProvider(generator, "en_us"));
        }
    }

}
