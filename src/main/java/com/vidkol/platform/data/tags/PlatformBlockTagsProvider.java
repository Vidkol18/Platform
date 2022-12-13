package com.vidkol.platform.data.tags;

import com.vidkol.platform.Platform;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PlatformBlockTagsProvider extends BlockTagsProvider {

    public PlatformBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
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
