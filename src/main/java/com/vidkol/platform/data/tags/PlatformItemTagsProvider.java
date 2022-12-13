package com.vidkol.platform.data.tags;

import com.vidkol.platform.Platform;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PlatformItemTagsProvider extends ItemTagsProvider {

    public PlatformItemTagsProvider(DataGenerator generator, PlatformBlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(generator, blockTags, Platform.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }

    @Override
    public String getName() {
        return "Platform Tags";
    }
}
