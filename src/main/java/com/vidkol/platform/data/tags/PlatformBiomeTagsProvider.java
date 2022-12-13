package com.vidkol.platform.data.tags;

import com.vidkol.platform.Platform;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PlatformBiomeTagsProvider extends BiomeTagsProvider {

    public PlatformBiomeTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Platform.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Platform Tags";
    }
}
